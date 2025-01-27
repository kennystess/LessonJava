package src.Student;

import src.Student.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Bella", "Leyla", "KA23768" );
        student.addGrade(50);
        student.addGrade(97);
        student.addGrade(52);

        student.displayInfo();

    }
}
