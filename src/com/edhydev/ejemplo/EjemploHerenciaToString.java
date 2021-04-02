package com.edhydev.ejemplo;

import com.edhydev.pooherencia.Person;
import com.edhydev.pooherencia.Student;
import com.edhydev.pooherencia.StudentInternational;
import com.edhydev.pooherencia.Teacher;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        System.out.println("********* Creating the Instance of Student Class *********");
        Student student = new Student("Edgar", "Jiménez Galicia", 22, "ITTehuacán");
        student.setScoreMath(7.9);
        student.setScoreHistory(9.0);
        student.setScoreSpanish(10);
        student.setEmail("edhy.mxm@gmail.com");

        System.out.println("********* Creating the Instance of StedentInternational Class *********");
        StudentInternational studentInt = new StudentInternational("David", "Luiz", "Chile");
        studentInt.setAge(23);
        studentInt.setSchool("IT Chile");
        studentInt.setScoreMath(7.9);
        studentInt.setScoreHistory(9.0);
        studentInt.setScoreSpanish(8.0);
        studentInt.setScoreLanguage(9.0);
        studentInt.setEmail("david.luiz@gmail.com");

        System.out.println("********* Creating the Instance of Teacher Class *********");
        Teacher teacher = new Teacher("Francisco", "Vázquez Gonzáles", "Operating Systems");
        teacher.setAge(57);
        teacher.setEmail("franco.teacher@gmail.com");

        print(student);
        print(studentInt);
        print(teacher);
    }

    public static void print(Person person) {
        System.out.println("=================================================================================");
        System.out.println(person);
    }
}
