package Service;

import model.Student;

import java.util.LinkedList;

public interface StudentService {
    String addStudent(Student student);
    void displayStudents();
    LinkedList<Student> sortByName();
    LinkedList<Student> sortByGrades();
    LinkedList<Student>sortByGradesMinimize();
}
