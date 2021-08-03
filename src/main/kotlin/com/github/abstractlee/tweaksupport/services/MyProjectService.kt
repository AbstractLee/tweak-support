package com.github.abstractlee.tweaksupport.services

import com.github.abstractlee.tweaksupport.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
