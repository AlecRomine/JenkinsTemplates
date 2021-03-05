#!/usr/bin/env groovy

def call (String dockerFolder){
    /*not the final code*/
        sh "cd ${dockerFolder}"
        sh "docker build . -t ${buildTAG} -t ${buildLATESTTAG}" 
    }
