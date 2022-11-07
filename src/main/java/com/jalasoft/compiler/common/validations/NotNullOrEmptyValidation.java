package com.jalasoft.compiler.common.validations;

import com.jalasoft.compiler.common.exceptions.InvalidDataException;

public class NotNullOrEmptyValidation implements IValidationStrategy {
    private String value;
    private String field;

    public NotNullOrEmptyValidation(String field, String value) {
        this.value = value;
        this.field = field;
    }

    @Override
    public void validate() throws InvalidDataException {
        if (this.value == null || this.value.isEmpty()) {
            throw new InvalidDataException("Invalid value");
        }
    }
}
