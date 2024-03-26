package org.example;

public class Main {
    public static void main(String[] args) {


        Teacher teacher = new Teacher(1,"basti","Mathe");


        System.out.println(teacher);

        Student student = Student.builder()
                .id(1)
                .grade(2.4)
                .name("Basti")
                .address("lol")
                .build();

        Student updateStudent = student
                .withNewGrade(2.4)
                .withNewName("Sven")
                .withNewAddress("kekw");


        System.out.println("Default " + student);
        System.out.println("Updated Student  " + updateStudent);

        Course course = Course.builder()
                .id(1)
                .name("Mathe")
                .teacher(teacher)
                .student(student)
                .build();

        Course neuerCourse = course
                .withNewName("Bio")
                .withNewStudent(student)
                .withNewTeacher(teacher);

        System.out.println("Default " + course);
        System.out.println("Updated " + neuerCourse);

    }
}