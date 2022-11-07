package com.jalasoft.compiler.common.exceptions;

public class InvalidDataException extends Exception {
    public InvalidDataException(String message, Throwable ex) {
        super(message, ex);
    }

    public InvalidDataException(String message) {
        super(message);
    }
}
