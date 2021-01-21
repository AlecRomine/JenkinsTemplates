#!/usr/bin/env groovy

def call (String projectFolder,String projectName){
    /*not the final code*/
          echo "Performing a clean of Builds"
          bat "dotnet clean ${projectFolder}\\${projectName}"
          echo "cleaning done"
    }