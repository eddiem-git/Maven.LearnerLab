package io.zipcoder.interfaces;

public class Instructors extends People {

    static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        for(long i = 0; i < 4; i++){
            Instructor instructor = new Instructor(i);
            add(instructor);
        }
    }
    public static Instructors getINSTANCE() {
        return INSTANCE;
    }
    public Person[] getArray() {
        Object[] personArray = new Person[personList.size()];
        for(int i=0; i<personArray.length; i++) {
            personArray[i] = personList.get(i);
        }
        return (Person[]) personArray;

    }
}