package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {
    Person person;

    @Before
    public void setID(){
        long idInput = 0474754;
        person = new Person(idInput);
    }

    @Test
    public void testConstructor(){
        long idInput = 0474754;
        person = new Person(idInput);
        long actual = person.getId();
        assertEquals(idInput, actual);
    }

    @Test
    public void TestSetName(){
        String name = "Eddie";
        person.setName(name);
        String actual = person.getName();
        assertEquals(name, actual);
    }
}
