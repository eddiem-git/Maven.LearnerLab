package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void personTest(){
    //given we have a name and a Id upon construction
    Long expectedId = null;
    String expectedName = null;
    Person person = new Person(null,null);
    //when we set these values
    Long actualId = person.getId();
    String actualName = person.getName();
    //then when we compare these values
    Assert.assertEquals(actualId,expectedId);
    Assert.assertEquals(actualName,expectedName);
    }
    @Test
    public void personNameTest(){
        //given
        Person person = new Person(null,"Eddie");
        person.setName("Eddie");
        //when
        String expectedName = "Eddie";
        String actualName = person.getName();
        //then
        Assert.assertEquals(actualName,expectedName);
    }
}
