package com.javaex.oop.person;

public class Student {
	
	private String school;
	

    public Student(String school) {
        super("", 0);
        this.school = school;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void showInfo() {
        System.out.println("학교: " + school);
        super.showInfo();
    }
}