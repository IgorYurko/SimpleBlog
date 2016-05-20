package com.simpleblog.springform;


import org.hibernate.validator.constraints.*;

import javax.validation.constraints.*;

public class BlogForm
{
    @NotEmpty(message = "This field is required.")
    @Size(min = 3, max = 30, message = "Please enter at least 3 characters.")
    private String name;

    @NotEmpty(message = "This field is required.")
    @URL(message = "Please enter a valid URL.")
    private String url;

    public BlogForm()
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

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
}
