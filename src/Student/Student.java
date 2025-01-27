package src.Student;

import java.util.List;
import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    String studentID;
    List<Integer> grades;
    public Student(String firstName, String lastName,String studentID) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.studentID = studentID;
     this.grades = new ArrayList<>();
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    public void displayInfo() {
        System.out.println("Вся інформація про студента: ");
        System.out.println("Ім'я: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Номер студентського квитка: " + studentID);
        System.out.println("Оцінки: " + grades);
        System.out.printf("Середня оцінка: " + calculateAverageGrade());
    }
}


