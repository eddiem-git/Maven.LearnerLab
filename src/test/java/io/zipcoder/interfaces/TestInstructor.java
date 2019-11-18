package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestInstructor {
    Instructor instructor = new Instructor(0L);

    @Test
    public void testImplementation(){
        assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Student student = new Student();
        instructor.teach(student,5.7);
        assertEquals(5.7,student.getTotalStudyTime(),0.001);
    }
    @Test
    public void testLecture(){
        Student[] students = new Student[4];
        students[1] = new Student(505);
        students[2] = new Student(403);
        students[3] = new Student(203);
    }
}
