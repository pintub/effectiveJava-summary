package com.sf.effectivejava.item1.example1;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private Student(){
    }

    public Student(int studentId, String firsName){
        this.studentId = studentId;
        this.firstName = firsName;
    }

    /*public Student(int studentId, String lastName){
        this.studentId = studentId;
        this.lastName = lastName;
    }*/

    //Work Around
    /*public Student(String lastName, int studentId){
        this.studentId = studentId;
        this.lastName = lastName;
    }*/

    //TODO implementation
    public static Student createInstanceByIdAndFirstName(int studentId, String firstName) {
        Student s = new Student();
        s.setFirstName(firstName);s.setStudentId(studentId);
        return s;
    }

    public static Student createInstanceByIdAndLastName(int studentId, String lastName) {
        Student s = new Student();
        s.setFirstName(lastName);s.setStudentId(studentId);
        return s;
    }
}
