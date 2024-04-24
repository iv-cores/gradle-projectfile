package org.ivcode.gradle.projectfile

import org.gradle.api.Plugin
import org.gradle.initialization.DefaultSettings
import org.ivcode.gradle.projectfile.utils.readProjectFile

class ProjectFileSettingsPlugin: Plugin<DefaultSettings> {

    override fun apply(defaultSettings: DefaultSettings) {
        val projectFile = readProjectFile()

        defaultSettings.rootProject.name = projectFile.name
    }
}