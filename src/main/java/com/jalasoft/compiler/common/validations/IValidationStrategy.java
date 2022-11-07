package com.jalasoft.compiler.common.validations;

import com.jalasoft.compiler.common.exceptions.InvalidDataException;

public interface IValidationStrategy {
    void validate() throws InvalidDataException;
}
