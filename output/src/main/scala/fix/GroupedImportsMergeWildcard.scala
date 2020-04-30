package fix

import fix.P._
import fix.P.{b => B}
import fix.Q.{b => B, c => _, _}
import fix.R.{a => A, b => B, c, d}
import fix.S.{a => a1, b => b1, c}
import fix.S.{a, b}

object P {
  val a = ???
  val b = ???
  val c = ???
  val d = ???
}

object Q {
  val a = ???
  val b = ???
  val c = ???
  val d = ???
}

object R {
  val a = ???
  val b = ???
  val c = ???
  val d = ???
}

object S {
  val a = ???
  val b = ???
  val c = ???
}

object GroupedImportsMergeWildcard
