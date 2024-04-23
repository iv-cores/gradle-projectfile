package org.ivcode.gradle.projectfile

import com.google.gson.Gson
import java.io.FileReader

open class ProjectFileExtension(
    var filename: String = "../project.json"
) {
    fun read(filename: String = this.filename):ProjectFile = Gson().fromJson(FileReader(filename), ProjectFile::class.java)
}
