package com.simpleblog.annotation;

import com.simpleblog.repository.UserRepository;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String>
{
    @Inject
    private UserRepository userRepository;

    @Override
    public void initialize(UniqueUsername uniqueUsername)
    {

    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext)
    {
        if (userRepository == null)
        {
            return true;
        }
        return userRepository.findByName(name) == null;
    }
}
