
#!/usr/bin/env groovy
package com.ELRR

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.ELRR.GlobalVars
   // println GlobalVars.foo
}