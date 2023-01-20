package com.dmdev.task;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction;

import java.io.File;

/**
 * @author Andrey Makarov on 20.01.2023
 */
class ReleaseTask extends DefaultTask {
	@Input
	Boolean release
	@OutputFile
	File releaseFile

	@TaskAction
	void performRelease() {

		println "release in prigress..."
	}
//	    inputs.property("release", project.release)
//		outputs.file("$rootDir/script.gradle")
//
//	doLast {
//		println "release in prigress..."
//	}
//

}
