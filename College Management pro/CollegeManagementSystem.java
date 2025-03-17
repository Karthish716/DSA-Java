package sample;


import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    /*public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
*/
    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }
}

class Course {
    private String courseName;
    private int courseId;

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Course ID: " + courseId;
    }
}

public class CollegeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        while (true) {
            System.out.println("\nCollege Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. List Students");
            System.out.println("4. List Courses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    students.add(new Student(studentName, rollNumber));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter course ID: ");
                    int courseId = scanner.nextInt();
                    courses.add(new Course(courseName, courseId));
                    System.out.println("Course added successfully.");
                    break;

                case 3:
                    System.out.println("List of Students:");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;

                case 4:
                    System.out.println("List of Courses:");
                    for (Course course : courses) {
                        System.out.println(course);
                    }
                    break;

                case 5:
                    System.out.println("Exiting College Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}