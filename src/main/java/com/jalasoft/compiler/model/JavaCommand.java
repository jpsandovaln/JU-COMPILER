package com.jalasoft.compiler.model;

import com.jalasoft.compiler.common.exceptions.CommandException;
import com.jalasoft.compiler.model.parameters.JavaParameter;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

public class JavaCommand implements ICommandBuilder<JavaParameter> {
    private static final String JAVA_COMPILER = "javac ";
    private static final String JAVA_EXECUTE = "java ";
    private static final String JAVA_CP_PARAM = "-cp ";
    private static final String JAVA_AND = " && ";
    private static final String JAVA_SPACE = " ";

    public String buildCommand(JavaParameter parameter) throws CommandException {
        try {
            parameter.validate();
            StringBuilder command = new StringBuilder();
            command.append(parameter.getJavaFolder())
                    .append(JAVA_COMPILER)
                    .append(parameter.getFile().getAbsoluteFile())
                    .append(JAVA_AND)
                    .append(JAVA_EXECUTE)
                    .append(JAVA_CP_PARAM)
                    .append(parameter.getFile().getParent())
                    .append(JAVA_SPACE)
                    .append(FilenameUtils.getBaseName(parameter.getFile().getName()));

            return command.toString();
        } catch (Exception ex) {
            throw new CommandException(ex);
        }
    }
}
