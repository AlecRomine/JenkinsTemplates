#!/usr/bin/env groovy
package com.ELRR

class SampleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
}