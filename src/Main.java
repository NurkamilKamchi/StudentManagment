import ServiceImpl.StudentServiceImpl;
import model.Student;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        StudentServiceImpl studentService = new StudentServiceImpl();
        System.out.println("Welcome to managing!!!");
        while (true){
            System.out.println("""
                    1.Add student.
                    2.Display student.
                    3.Sort by name.
                    4.Sort by grades.
                    5.Sort by grades minimize.
                     Enter your choice:
                    """);

            switch (new Scanner(System.in).nextLine()){
                case "1"->{
                    System.out.print("Enter name: ");
                    String name= scanner.nextLine();
                    student1.setName(name);
                    System.out.print("Enter group: ");
                    String group = scanner.nextLine();
                    student1.setGroup(group);
                    System.out.print("Enter baasy: ");
                    double baasy = scanner.nextDouble();
                    student1.setBaasy(baasy);
                    studentService.addStudent(student1);
                }
                case "2"->{
                    studentService.displayStudents();
                }
                case "3"->{
                    studentService.sortByName();
                }
                case "4"->{
                    studentService.sortByGrades();
                }
                case"5"->{
                    studentService.sortByGradesMinimize();
                }
            }
        }
    }
}