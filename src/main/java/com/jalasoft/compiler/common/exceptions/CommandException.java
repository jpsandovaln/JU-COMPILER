package com.jalasoft.compiler.common.exceptions;

public class CommandException extends Exception {
    private static final String MESSAGE = "Invalid command";
    public CommandException(String currentMessage) {
        super(currentMessage);
    }

    public CommandException(String currentMessage, Throwable ex) {
        super(currentMessage, ex);
    }

    public  CommandException(Throwable ex) {
        super(MESSAGE, ex);
    }
}
