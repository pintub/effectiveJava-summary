package com.sf.effectivejava.item1.example1;

public class StudentClient {
    public static void main(String[] args) {
        //Example Name John Smith
        //Student student = new Student("John", 123);
        Student student = Student.createInstanceByIdAndFirstName(10 , "Jhn");
        Student student1 = Student.createInstanceByIdAndLastName(11, "Smith");
    }
}
