#!/usr/bin/env groovy

def call (script ){
    /*not the final code*/
        def tname = ""
          echo "Checking environmentals"
          sh "printenv | sort"
          echo "1 print  ${JOB_NAME}" 
          tname = env.JOB_NAME
          echo "2 print ${tname}" 
          tname = env.JOB_NAME.replaceAll('/','-')
          echo "3 print ${tname}"
          script.env.jobname = tname
          echo "4 print  ${JOB_NAME}" 
          echo "5 print  ${env.PemFile}" 
          echo "5 print  ${env.jobname}" 
          echo "6 Checking environmentals"
          sh "printenv | sort"
          echo "done"
    }