package com.jalasoft.compiler.model;

import com.jalasoft.compiler.common.exceptions.CommandException;
import com.jalasoft.compiler.model.parameters.PythonParameter;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class PythonCommandTest {
    private final static  String PYTHON_FILE = "src/test/resources/files/Hello.py";
    private ICommandBuilder command;

    @Test
    public void buildCommandInvalidFile() throws CommandException {
        command = new PythonCommand();
        String result = command.buildCommand(new PythonParameter("d:/code/", new File(PYTHON_FILE)));
        String expected = "d:/code/python D:\\JUProgra102\\JU-COMPILER\\src\\test\\resources\\files\\Hello.py";
        assertEquals(expected, result);
    }

    @Test(expected = CommandException.class)
    public void buildCommandNullFile() throws CommandException {
        command = new PythonCommand();
        command.buildCommand(new PythonParameter("d:/code/", null));
    }

    @Test(expected = CommandException.class)
    public void buildCommandNullArgs() throws CommandException {
        command = new PythonCommand();
        command.buildCommand(new PythonParameter(null, null));
    }

    @Test(expected = CommandException.class)
    public void buildCommandNullParam() throws CommandException {
        command = new PythonCommand();
        command.buildCommand(null);
    }
}