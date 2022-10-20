package com.jalasoft.compiler.model;

import org.apache.commons.io.FilenameUtils;

import java.io.File;

public class JavaCommand implements ICommandBuilder {
    private static final String JAVA_COMPILER = "javac ";
    private static final String JAVA_EXECUTE = "java ";
    private static final String JAVA_CP_PARAM = "-cp ";
    private static final String JAVA_AND = " && ";
    private static final String JAVA_SPACE = " ";

    public String buildCommand(String javaFolder, File javaFile) {
        StringBuilder command = new StringBuilder();
        command.append(javaFolder)
                .append(JAVA_COMPILER)
                .append(javaFile.getAbsoluteFile())
                .append(JAVA_AND)
                .append(JAVA_EXECUTE)
                .append(JAVA_CP_PARAM)
                .append(javaFile.getParent())
                .append(JAVA_SPACE)
                .append(FilenameUtils.getBaseName(javaFile.getName()));

        return command.toString();
    }
}
