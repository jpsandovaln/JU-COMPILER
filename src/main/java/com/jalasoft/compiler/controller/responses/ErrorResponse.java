package com.jalasoft.compiler.controller.responses;

public class ErrorResponse extends  Response {
    private String errorMessage;

    public ErrorResponse(String status, String errorMessage) {
        super(status);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
