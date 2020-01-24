package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.Optional;

public class TestPeople {

    People people = new People() {
        public Person[] getArray() {
            return new Person[0];
        }
    };


    @Test
    public void testAdd(){
        Person person = new Student(0140);
        people.add(person);

        Assert.assertEquals(Optional.of(people.getCount()), Optional.of(1));
    }

    @Test
    public void testRemove(){
        Person person = new Person(01400L);
        Person person2 = new Person(0141L);
        people.add(person);
        people.add(person2);
        people.remove(person);

        Assert.assertEquals(java.util.Optional.ofNullable(people.getCount()), Optional.of(1));
    }

    @Test
    public void testRemoveById(){
        Person person = new Person(0140L);
        Person person2 = new Person(0141L);
        people.add(person);
        people.add(person2);
        people.removeById(person2.getId());

        Assert.assertEquals(java.util.Optional.ofNullable(people.getCount()), Optional.of(1));
    }

    @Test
    public void testRemoveAll(){
        Person person = new Person(0140L);
        Person person2 = new Person(0141L);
        people.add(person);
        people.add(person2);
        people.removeAll((List<Person>) people);

        Assert.assertEquals(java.util.Optional.ofNullable(people.getCount()), people.personList.isEmpty());
    }

    @Test
    public void testFindById(){
        Person person = new Person(null);
        Person person2 = new Person(null);
        people.add(person);
        people.add(person2);

        Person found = people.findById(null);

        Assert.assertEquals(found, person);
    }
}
