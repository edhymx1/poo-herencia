package com.edhydev.ejemplo;

import com.edhydev.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        StringBuilder sb = new StringBuilder();

        sb.append("=========================================================================\n");
        sb.append(person.sayHello()).append("\n");
        sb.append("This is mi biography").append("\n");
        sb.append("=========================================================================\n");

        sb.append("Name:\t").append(person.getName()).append("\n")
                .append("Surnames:\t").append(person.getSurnames()).append("\n")
                .append("Age:\t").append(person.getAge()).append("\n")
                .append("Email:\t").append(person.getEmail()).append("\n");

        if(person instanceof Student) {
            sb.append("School:\t").append(((Student) person).getSchool()).append("\n");
            sb.append("Score History:\t").append(((Student) person).getScoreHistory()).append("\n");
            sb.append("Score Math:\t").append(((Student) person).getScoreMath()).append("\n");
            sb.append("Score Spanish:\t").append(((Student) person).getScoreSpanish()).append("\n");

            if(person instanceof StudentInternational) {
                sb.append("Score Language:\t").append(((StudentInternational) person).getScoreLanguage()).append("\n");
                sb.append("Country:\t").append(((StudentInternational) person).getCountry()).append("\n");
            }

            sb.append("Average:\t").append(((Student) person).getAverage());
        }

        if(person instanceof Teacher) {
            sb.append("Course:\t").append(((Teacher) person).getCourse()).append("\n");
        }

        System.out.println(sb.toString());
    }
}
