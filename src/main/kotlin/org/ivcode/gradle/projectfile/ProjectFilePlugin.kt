package org.ivcode.gradle.projectfile

import org.gradle.api.Plugin
import org.gradle.api.Project

class ProjectFilePlugin: Plugin<Project> {

    override fun apply(project: Project) {
        val projectFileExtension = project.extensions.create("projectfile", ProjectFileExtension::class.java)

        project.afterEvaluate {
            val projectFile = projectFileExtension.read()

            project.version = projectFile.version
            project.description = projectFile.description
        }
    }
}