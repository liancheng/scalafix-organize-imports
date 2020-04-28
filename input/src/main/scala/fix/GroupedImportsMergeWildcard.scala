/*
rules = OrganizeImports
OrganizeImports.groupedImports = Merge
OrganizeImports.importSelectorsOrder = Ascii
 */
package fix

import fix.GroupedImportsMergeWildcard.P._
import fix.GroupedImportsMergeWildcard.P.{a => _, _}
import fix.GroupedImportsMergeWildcard.P.{b => B}
import fix.GroupedImportsMergeWildcard.P.{c => _, _}
import fix.GroupedImportsMergeWildcard.P.d

import fix.GroupedImportsMergeWildcard.Q.{a => _, _}
import fix.GroupedImportsMergeWildcard.Q.{b => B}
import fix.GroupedImportsMergeWildcard.Q.{c => _, _}
import fix.GroupedImportsMergeWildcard.Q.d

import fix.GroupedImportsMergeWildcard.R.{a => A}
import fix.GroupedImportsMergeWildcard.R.{b => B}
import fix.GroupedImportsMergeWildcard.R.c
import fix.GroupedImportsMergeWildcard.R.d

import fix.GroupedImportsMergeWildcard.S.a
import fix.GroupedImportsMergeWildcard.S.b
import fix.GroupedImportsMergeWildcard.S.c
import fix.GroupedImportsMergeWildcard.S.{a => a1}
import fix.GroupedImportsMergeWildcard.S.{b => b1}

object GroupedImportsMergeWildcard {
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
}
