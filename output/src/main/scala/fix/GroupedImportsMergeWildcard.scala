package fix

import fix.GroupedImportsMergeWildcard.P.{b => B, d, _}
import fix.GroupedImportsMergeWildcard.Q.{b => B, c => _, d, _}
import fix.GroupedImportsMergeWildcard.R.{a => A, b => B, c, d}
import fix.GroupedImportsMergeWildcard.S.{a => a1, b => b1, c}
import fix.GroupedImportsMergeWildcard.S.{a, b}

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
