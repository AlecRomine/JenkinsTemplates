#!/usr/bin/env groovy
package com.ELRR

class esbuildOps implements Serializable {
    static def dotnetBuild (script, projectFolder,projectName,configuration){
    /*not the final code*/
            sctipt.echo 'building'
            script.bat 'dotnet build $(projectFolder)\\$(projectName) --configuration $(configutation)'
            sctipt.echo 'building done'
    }
}