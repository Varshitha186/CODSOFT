import java.util.ArrayList;
import java.util.Scanner;

// Student class
class Student {
    private String name;
    private int rollNo;
    private String grade;

    public Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Grade: " + grade;
    }
}

// Management System
class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void removeStudent(int rollNo) {
        students.removeIf(s -> s.getRollNo() == rollNo);
        System.out.println("Student removed if found!");
    }

    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students available!");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}

// Main Class
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter roll no: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = sc.nextLine();
                    sms.addStudent(new Student(name, roll, grade));
                    break;

                case 2:
                    System.out.print("Enter roll no to remove: ");
                    int rollRemove = sc.nextInt();
                    sms.removeStudent(rollRemove);
                    break;

                case 3:
                    System.out.print("Enter roll no to search: ");
                    int rollSearch = sc.nextInt();
                    sms.searchStudent(rollSearch);
                    break;

                case 4:
                    sms.displayAll();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
