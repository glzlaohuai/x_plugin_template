package com.github.glzlaohuai.xplugintemplate.services

import com.github.glzlaohuai.xplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
