#!/usr/bin/env groovy

def call (String projectFolder,String projectName, String configuration){
    /*not the final code*/
          echo 'building'
          bat 'dotnet build ${projectFolder}\\${projectName} --configuration ${configuration}'
          echo 'building done'
    }