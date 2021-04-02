package com.edhydev.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Edgar");
        student.setSurnames("Jiménez Galicia");
        student.setSchool("ITTehuacán");

        Teacher teacher = new Teacher();
        teacher.setName("Francisco");
        teacher.setSurnames("Vázquez Gonzáles");
        teacher.setCourse("Operating Systems");

        System.out.println("Student " + student.getName() + " " + student.getSurnames() + " " + student.getSchool());
        System.out.println("Teacher " + teacher.getCourse() + " " + teacher.getName() + " " + teacher.getSurnames());
    }
}
