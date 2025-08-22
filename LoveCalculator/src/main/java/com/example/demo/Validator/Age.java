package com.example.demo.Validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

	String message() default "{message}";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	int lower() default 0;
	int upper() default Integer.MAX_VALUE;
	
	
}

