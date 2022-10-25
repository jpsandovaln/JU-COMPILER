package com.jalasoft.compiler.common.exceptions;

public class ExecuteException extends Exception {
    public ExecuteException(String message, Throwable ex) {
        super(message, ex);
    }

    public ExecuteException(String message) {
        super(message);
    }
}
