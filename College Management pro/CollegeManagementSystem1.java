package sample;

import java.util.ArrayList;
import java.util.Scanner;

class Student1 {
    private String studentId;
    private String name;
    private int age;
    private String dept;

    public Student1(String studentId, String name, int age,String dept) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.dept=dept;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getdept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + "Name: " + name + "Age: " + age + "Deportment: " +dept ;
    }
}

public class CollegeManagementSystem1 {
    private static ArrayList<Student1> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nCollege Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    System.out.println("-------Exiting program.Thank You------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("----Invalid option. Please try again!-----");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Deportment: ");
        String dept = scanner.next();
        Student1 newStudent = new Student1(studentId, name, age,dept);
        studentList.add(newStudent);
        System.out.println("-------Student added successfully!--------");
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String studentId = scanner.nextLine();

        for (Student1 student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                studentList.remove(student);
                System.out.println("---------Student deleted successfully!-----------");
                return;
            }
        }

        System.out.println("---Student not found!----");
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        String studentId = scanner.nextLine();

        for (Student1 student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                System.out.print("Enter new Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new Age: ");
                int age = scanner.nextInt();
                System.out.print("Enter Student ID: ");
                String dept = scanner.next();
                studentList.remove(student);
                student = new Student1(studentId, name, age,dept);
                studentList.add(student);
                System.out.println("-------Student updated successfully!-------");
                return;
            }
        }

        System.out.println("---Student not found!----");
    }

    private static void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\n-------List of Students:---------");
            for (Student1 student : studentList) {
                System.out.println("\n"+student);
            }
        }
    }
}
