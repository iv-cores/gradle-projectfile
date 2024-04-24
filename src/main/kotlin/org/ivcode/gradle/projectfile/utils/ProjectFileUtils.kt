package org.ivcode.gradle.projectfile.utils

import com.google.gson.Gson
import org.ivcode.gradle.projectfile.ProjectFile
import java.io.FileReader

const val DEFAULT_FILENAME = "../project.json"

fun readProjectFile(): ProjectFile {
    val filename = System.getenv("PROJECT_FILE") ?: DEFAULT_FILENAME
    return Gson().fromJson(FileReader(filename), ProjectFile::class.java)
}