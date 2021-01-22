# JenkinsTemplates

## Importable Templates in for Jenkins scripts

This repository is the location for custom functions and variables used in
common for Jenkins pipelines within the ADL/ELRR project prototypes

## To use:

**Add this repository to the Jenkins server that will be used to process your
pipelines.**

1.  As a Jenkins Administrator, click "Manage Jenkins"

2.  Click "Configure System"

3.  under "Global Pipeline Libraries" clich "Add"

4.  Use the following settings

    -   Name: "ELRRLib"

    -   Default version: "main"

    -   Retrieval method: Modern SCM

    -   Select the Git type

    -   Project repository:"https://github.com/US-ELRR/JenkinsTemplates.git"

**Add a call to the library and function in the Pipeline Script.**

1.  Before the "pipeline {}" declaration, insert a call to the invoke the
    library with the name you gave it in the Global Pipeline Libraries section
    (In this case “ERRLib”).

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
@Library('ELRRLib')_

pipeline { 

    blah blah blah 

}

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

*IMPORTANT TO REMEMBER: The Blue Ocean Editor does not retain any declarations
outside of the "pipeline" node.*  
*If you use Blue Ocean to edit or update the Jenkinsfile, it will fail to build
until you reinsert the Library Decoration above manually.*  
*also: do not omit the "\@" or the trailing underline in the library
declaration*

1.  Call the function in the pipeline script

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  stage('Build'){
      steps{
        script{
              dotnetBuild("projectfolder","projectFile","configuration")
        }
      }
   }    
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
