#!/usr/bin/env groovy

def call (strng dockerFolder){
    /*not the final code*/
        cd dockerFolder
        sh "docker build . -t ${buildTAG} -t ${buildLATESTTAG}" 
    }
