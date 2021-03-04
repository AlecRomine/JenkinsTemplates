#!/usr/bin/env groovy

def call (){
    /*not the final code*/
          echo "Checking environmentals"
          sh "printenv | sort"
          jobname = "${JOB_NAME}"
          jobname = jobname.replaceAll('/','-') 
          sh "printenv | sort"
          echo "done"
    }