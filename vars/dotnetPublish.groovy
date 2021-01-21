#!/usr/bin/env groovy

def call (String projectFolder,String projectName, String configuration, String framework, String outFolder){
    /*not the final code*/
          echo "Performing publish to deploy folders  ${outFolder}"
          echo "Performing publish to deploy folders  ${outFolder}"
          bat "dotnet publish ${projectFolder}\\${projectName} --configuration ${configuration} --framework ${framework} --output ${outFolder}"
          echo "Publishing done"
    }