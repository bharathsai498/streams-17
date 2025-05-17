package model;

import java.util.List;

public class Student {
    private String name;
    private String rollNo;
    private List<Integer> marks;

    public Student(String name, String rollNo, List<Integer> marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
}
