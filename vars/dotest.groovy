#!/usr/bin/env groovy

def call (){
    /*not the final code*/
          echo "Checking environmentals"
          sh "printenv | sort"
          echo "get jobname"
          echo "print env again ${JOB_NAME}" 
          echo "done"
    }