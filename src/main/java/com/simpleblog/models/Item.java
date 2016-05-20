package com.simpleblog.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Item
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private Date publishedDate;

    @Column
    private String link;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;

    public Integer getId()
    {
        return Id;
    }

    public void setId(Integer id)
    {
        Id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getPublishedDate()
    {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate)
    {
        this.publishedDate = publishedDate;
    }

    public String getLink()
    {
        return link;
    }

    public void setLink(String link)
    {
        this.link = link;
    }

    public Blog getBlog()
    {
        return blog;
    }

    public void setBlog(Blog blog)
    {
        this.blog = blog;
    }
}
