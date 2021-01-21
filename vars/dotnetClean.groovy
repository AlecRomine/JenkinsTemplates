#!/usr/bin/env groovy

def call (String projectFolder,String projectName){
    /*not the final code*/
          echo "cleaning"
          bat "dotnet clean ${projectFolder}\\${projectName} "
          echo "cleaning done"
    }