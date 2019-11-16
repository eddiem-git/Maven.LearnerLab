package io.zipcoder.interfaces;

public class Person {
    final long id;
    String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
        this.id = 000000000000000;
    }

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
