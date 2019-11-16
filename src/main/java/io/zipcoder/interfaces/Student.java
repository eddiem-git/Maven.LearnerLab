package io.zipcoder.interfaces;

public final class Student extends Person implements Learner {
    private Double totalStudyTime;
    private long id;

    public Student() {
        this.id = 0;
    }

    public Student(long id) {
        setId(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    private void setId(long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime = numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
