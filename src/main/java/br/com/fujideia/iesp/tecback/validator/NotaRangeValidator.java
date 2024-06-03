package br.com.fujideia.iesp.tecback.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NotaRangeValidator implements ConstraintValidator<NotaRange, Integer> {
    private int min;
    private int max;
    @Override
    public void initialize(NotaRange constraint) {
        this.min = constraint.min();
        this.max = constraint.max();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        if (value==null){
            return true;
        }
        return value >= min && value <= max;
    }
}
