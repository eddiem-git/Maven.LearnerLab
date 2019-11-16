package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    private long id;


    public Instructor(long id, String name) {
        super(id, name);
    }

    public Instructor(Long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        Double numberOfHoursPerLearners = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearners);

        }


    }

}
