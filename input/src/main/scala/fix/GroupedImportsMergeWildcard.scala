/*
rules = [OrganizeImports]
OrganizeImports.removeUnused = false
OrganizeImports.groupedImports = Merge
 */
package fix

import fix.MergeImports.Wildcard1._
import fix.MergeImports.Wildcard1.{a => _, _}
import fix.MergeImports.Wildcard1.{b => B}
import fix.MergeImports.Wildcard1.{c => _, _}
import fix.MergeImports.Wildcard1.d

import fix.MergeImports.Wildcard2._
import fix.MergeImports.Wildcard2.{a, b}

object GroupedImportsMergeWildcard
