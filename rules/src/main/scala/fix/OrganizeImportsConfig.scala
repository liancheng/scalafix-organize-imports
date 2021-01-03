package fix

import metaconfig.ConfDecoder
import metaconfig.generic.Surface
import metaconfig.generic.deriveDecoder
import metaconfig.generic.deriveSurface
import scalafix.internal.config.ReaderUtil

sealed trait ImportsOrder

object ImportsOrder {
  case object Ascii extends ImportsOrder
  case object SymbolsFirst extends ImportsOrder
  case object Keep extends ImportsOrder

  implicit def reader: ConfDecoder[ImportsOrder] =
    ReaderUtil.fromMap(
      (List(Ascii, SymbolsFirst, Keep) map (v => v.toString -> v)).toMap
    )
}

sealed trait ImportSelectorsOrder

object ImportSelectorsOrder {
  case object Ascii extends ImportSelectorsOrder
  case object SymbolsFirst extends ImportSelectorsOrder
  case object Keep extends ImportSelectorsOrder

  implicit def reader: ConfDecoder[ImportSelectorsOrder] =
    ReaderUtil.fromMap {
      (List(Ascii, SymbolsFirst, Keep) map (v => v.toString -> v)).toMap
    }
}

sealed trait GroupedImports

object GroupedImports {
  case object AggressiveMerge extends GroupedImports
  case object Merge extends GroupedImports
  case object Explode extends GroupedImports
  case object Keep extends GroupedImports

  implicit def reader: ConfDecoder[GroupedImports] =
    ReaderUtil.fromMap {
      (List(AggressiveMerge, Merge, Explode, Keep) map (v => v.toString -> v)).toMap
    }
}

final case class OrganizeImportsConfig(
  coalesceToWildcardImportThreshold: Int = Int.MaxValue,
  expandRelative: Boolean = false,
  groupExplicitlyImportedImplicitsSeparately: Boolean = false,
  groupedImports: GroupedImports = GroupedImports.Merge,
  groups: Seq[String] = Seq(
    "*",
    "re:(javax?|scala)\\."
  ),
  importSelectorsOrder: ImportSelectorsOrder = ImportSelectorsOrder.Ascii,
  importsOrder: ImportsOrder = ImportsOrder.Ascii,
  removeUnused: Boolean = true
)

object OrganizeImportsConfig {
  val default: OrganizeImportsConfig = OrganizeImportsConfig()

  implicit val surface: Surface[OrganizeImportsConfig] =
    deriveSurface[OrganizeImportsConfig]

  implicit val decoder: ConfDecoder[OrganizeImportsConfig] =
    deriveDecoder[OrganizeImportsConfig](default)
}
