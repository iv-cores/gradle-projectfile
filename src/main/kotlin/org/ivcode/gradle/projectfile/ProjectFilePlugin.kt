package org.ivcode.gradle.projectfile

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.ivcode.gradle.projectfile.utils.readProjectFile

class ProjectFilePlugin: Plugin<Project> {

    override fun apply(project: Project) {
        val projectFile = readProjectFile()

        project.version = projectFile.version
        project.description = projectFile.description
    }
}