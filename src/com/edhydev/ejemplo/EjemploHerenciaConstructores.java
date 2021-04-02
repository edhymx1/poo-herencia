package com.edhydev.ejemplo;

import com.edhydev.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("********* Creating the Instance of Student Class *********");
        Student student = new Student();
        student.setName("Edgar");
        student.setSurnames("Jiménez Galicia");
        student.setAge(22);
        student.setSchool("ITTehuacán");
        student.setScoreMath(7.9);
        student.setScoreHistory(9.0);
        student.setScoreSpanish(10);

        System.out.println();
        System.out.println();

        System.out.println("********* Creating the Instance of StedentInternational Class *********");
        StudentInternational studentInt = new StudentInternational();
        studentInt.setName("David");
        studentInt.setSurnames("Luiz");
        studentInt.setAge(23);
        studentInt.setCountry("Chile");
        studentInt.setSchool("IT Chile");
        studentInt.setScoreMath(7.9);
        studentInt.setScoreHistory(9.0);
        studentInt.setScoreSpanish(8.0);
        studentInt.setScoreLanguage(9.0);

        System.out.println();
        System.out.println();

        System.out.println("********* Creating the Instance of Teacher Class *********");
        Teacher teacher = new Teacher();
        teacher.setName("Francisco");
        teacher.setSurnames("Vázquez Gonzáles");
        teacher.setCourse("Operating Systems");

        System.out.println();
        System.out.println();


        System.out.println(student.getName() + " " + student.getSurnames() + " " + student.getSchool());
        System.out.println(teacher.getName() + " " + teacher.getSurnames() + " " + teacher.getCourse());
        System.out.println(studentInt.getName() + " " + studentInt.getSurnames() + " " + studentInt.getSchool() + " " + studentInt.getCountry());

        Class className = studentInt.getClass();
        while (className.getSuperclass() != null) {
            String child = className.getName();
            String father = className.getSuperclass().getName();
            System.out.println(child + " es una hija de la clase padre " + father);
            className = className.getSuperclass();
        }

    }
}
