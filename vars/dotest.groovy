#!/usr/bin/env groovy

def call (){
    /*not the final code*/
          echo "Checking environmentals"
          sh "printenv | sort"
          echo "get jobname"
          env.jobname = env.JOB_NAME.replaceAll('/','-') 
          echo "priunt env again"
          sh "printenv | sort"
          echo "done"
    }