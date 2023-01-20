package com.dmdev.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.Plugin

/**
 *
 * @author Andrey Makarov on 20.01.2023
 */
 class CustomPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        addHelloTask(project)
    }

     void addHelloTask(Project project) {
        def map = [description: "Hello task", group: "dmdev", type: DefaultTask]
        project.task(map, "hello") {
            println "configuration phase. Task hello"


            println "task: $description, group: $group, actions: ${actions.size()}"
            println "path task: $path"
        }
    }
}