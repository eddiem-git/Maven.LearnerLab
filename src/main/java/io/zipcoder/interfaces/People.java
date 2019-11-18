package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends Person> {
    List<Person> personList = new ArrayList<Person>();
   // The class should define a method named add which adds a Person to the personList.
    public void add(E person) {
        personList.add(person);
    }
    //The class should define a method named findById which makes use of a long id
    // parameter to return a Person object with the respective id field.
    public Person findById(Long id) {
        for ( Person person: personList) {
                if(person.getId() == id){
                    return person;
                }
        }
        return null;
    }
    //The class should define a named contains which makes use of a Person person
    // parameter to return true if the personList contains the respective Person object.
    public Boolean contains(Person person) {
        personList.contains(person);
        return true;
    }
    //The class should define a method named remove which makes use of a Person person parameter
    // to remove a respective Person object.
    public void remove(Person person) {
        personList.remove(person);
    }
    //The class should define a method named remove which makes use of a long id
    // parameter to remove a Person object with the respective id field.
    public void remove(Long Id) {
        personList.remove(findById(Id));
    }
    public void removeById(long id){
        personList.remove(findById(id));
    }
    //The class should define a named removeAll which clears our personList field.
    public void removeAll(List<Person> personList) {
        personList.clear();
    }
    //The class should define a method named count which returns the size of personList.
    public Integer getCount() {
        return personList.size();
    }
    //The class should define a method named toArray which returns an array representation of the personList field.
    public Integer[] toArray() {
        return personList.toArray(new Integer[personList.size()]);
    }
}