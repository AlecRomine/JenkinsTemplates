#!/usr/bin/env groovy

def call (String projectFolder,String projectName, String configuration. String framework, String outFolder){
    /*not the final code*/
          echo "Publishing"
          bat "dotnet publish ${projectFolder}\\${projectName} --configuration ${configuration} --framework ${framework} --output ${outFolder}"
          echo "Publishing done"
    }