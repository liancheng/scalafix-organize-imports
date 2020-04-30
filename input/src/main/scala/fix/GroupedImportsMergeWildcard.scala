/*
rules = OrganizeImports
OrganizeImports.groupedImports = Merge
OrganizeImports.importSelectorsOrder = Ascii
 */
package fix

import fix.P._
import fix.P.{a => _, _}
import fix.P.{b => B}
import fix.P.{c => _, _}
import fix.P.d

import fix.Q.{a => _, _}
import fix.Q.{b => B}
import fix.Q.{c => _, _}
import fix.Q.d

import fix.R.{a => A}
import fix.R.{b => B}
import fix.R.c
import fix.R.d

import fix.S.a
import fix.S.b
import fix.S.c
import fix.S.{a => a1}
import fix.S.{b => b1}

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
