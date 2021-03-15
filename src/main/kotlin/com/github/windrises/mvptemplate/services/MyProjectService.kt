package com.github.windrises.mvptemplate.services

import com.github.windrises.mvptemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
