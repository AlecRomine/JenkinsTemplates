#!/usr/bin/env groovy

def call (){
    /*not the final code*/
          echo "Checking environmentals"
          sh "printenv | sort"
          env.jobname = "${JOB_NAME}"
          envjobname = envjobname.replaceAll('/','-') 
          sh "printenv | sort"
          echo "done"
    }