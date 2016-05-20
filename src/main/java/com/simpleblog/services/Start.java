package com.simpleblog.services;

import com.simpleblog.rss2.ObjectFactory;
import com.simpleblog.rss2.Rss;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import java.io.File;
import java.util.Base64;
import java.util.List;

/**
 * Created by lord_777 on 14.09.15.
 */
public class Start
{
    public static void main(String[] args) throws JAXBException
    {
        String answers = "23-sdsfd-sdfsdf";
//        answers = Base64.getEncoder().encodeToString(answers.getBytes());
//        System.out.println(answers);
//        byte[] s = Base64.getDecoder().decode(answers.getBytes());
//        System.out.println(new String(s));

//        File file = new File("java-test/rss2sample.xml");
//        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
//        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//        Rss rss = (Rss) unmarshaller.unmarshal(file);
//        Rss.Channel channel = rss.getChannel();
//        List<Rss.Channel.Item> item = channel.getItem();
//        item.stream().forEach(e -> System.out.println(e.getDescription()));
        System.out.println(answers.split("-")[0]);
    }
}
