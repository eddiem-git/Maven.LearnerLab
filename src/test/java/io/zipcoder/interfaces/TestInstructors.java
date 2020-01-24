package io.zipcoder.interfaces;

import org.junit.Assert;
        import org.junit.Test;

     public class TestInstructors {

    @Test
    public void test(){
        Instructors instructors = Instructors.getINSTANCE();
        int actual = instructors.getCount();
        Assert.assertEquals(4, actual);
    }
}
