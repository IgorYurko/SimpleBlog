package com.simpleblog.springform;

import com.simpleblog.annotation.UniqueUsername;
import org.hibernate.validator.constraints.*;

import javax.validation.constraints.*;

public class UserForm
{
    @NotEmpty(message = "This field is required.")
    @Size(min = 3, max = 30, message = "Please enter at least 3 characters.")
    @UniqueUsername(message = "Such username already exist.")
    private String name;

    @NotEmpty(message = "This field is required.")
    @Email(message = "Please enter a valid email address.")
    private String email;

    @NotEmpty(message = "This field is required.")
    @Size(min = 7, max = 30, message = "Please enter at least 7 characters.")
    private String password;

    public UserForm()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
