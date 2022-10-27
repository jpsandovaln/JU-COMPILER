package com.jalasoft.compiler.common.exceptions;

public class CompilerException extends Exception {
    private String errorCode;
    public CompilerException(String currentMessage, String errorCode) {
        super(currentMessage);
        this.errorCode = errorCode;
    }

    public CompilerException(String currentMessage, Throwable ex, String errorCode) {
        super(currentMessage, ex);
        this.errorCode = errorCode;
    }

    public  CompilerException(Throwable ex, String errorCode) {
        super(ex);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
