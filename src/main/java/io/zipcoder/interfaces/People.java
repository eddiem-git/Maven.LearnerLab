package io.zipcoder.interfaces;

import java.util.List;

public class People {
    List<Person> personList;

    public void add() {
    }

    public Person findById(Long id) {
        return null;
    }

    public Boolean contains(Person person) {
        return false;
    }

    public void remove(Person person) {
    }

    public void remove(Long Id) {
    }

    public void removeAll(List<Person> personList){
        removeAll(this.personList);
    }

    public Integer count(){
        return this.personList.size();
    }

    public void toArray(){

    }





}
