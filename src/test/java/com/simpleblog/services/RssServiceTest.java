package com.simpleblog.services;

import com.simpleblog.models.Item;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.*;

public class RssServiceTest
{
    private RssService rssService;

    @Before
    public void setUp() throws Exception
    {
        rssService = new RssService();
    }

    @Test
    public void testGetItems() throws Exception
    {
        List<Item> items = rssService.getItems(new File("java-test/rss2sample.xml"));
        assertEquals(4, items.size());
        Item item = items.get(0);
        assertEquals("Star City", item.getTitle());
    }
}