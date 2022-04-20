package com.github.petrmurlykin.vbmigration.services

import com.intellij.openapi.project.Project
import com.github.petrmurlykin.vbmigration.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
