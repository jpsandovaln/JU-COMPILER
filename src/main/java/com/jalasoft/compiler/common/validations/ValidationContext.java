package com.jalasoft.compiler.common.validations;

import com.jalasoft.compiler.common.exceptions.InvalidDataException;

import java.util.List;

public class ValidationContext {
    private List<IValidationStrategy> validationStrategyList;

    public ValidationContext(List<IValidationStrategy> validationStrategyList) {
        this.validationStrategyList = validationStrategyList;
    }

    public void validate() throws InvalidDataException {
        for (IValidationStrategy strategy : this.validationStrategyList) {
            strategy.validate();
        }
    }
}
