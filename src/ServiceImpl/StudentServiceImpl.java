package ServiceImpl;

import Database.Database;
import Service.StudentService;
import model.Student;

import java.util.Comparator;
import java.util.LinkedList;

public class StudentServiceImpl implements StudentService {
    @Override
    public String addStudent(Student student) {
        Database.students.add(student);
        return "Successfully saved student!!!";
    }

    @Override
    public void displayStudents() {
        System.out.println(Database.students);
    }

    @Override
    public LinkedList<Student> sortByName() {
        Comparator<Student> comparator = Comparator.comparing(Student::getName);
        System.out.println("Before sorting: " +Database.students);
        Database.students.sort(comparator);
        System.out.println("Database.students = " + Database.students);
        return Database.students ;
    }

    @Override
    public LinkedList<Student> sortByGrades() {
        Comparator<Student> comparator = Comparator.comparing(Student::getBaasy);
        System.out.println("Before sorting: " +Database.students);
        Database.students.sort(comparator);
        System.out.println("Sortded baasy" + Database.students);
        return Database.students;
    }

    @Override
    public LinkedList<Student> sortByGradesMinimize() {
        Comparator<Student> comparator = Comparator.comparing(Student::getBaasy).reversed();
        System.out.println("Before sorting: " +Database.students);
        Database.students.sort(comparator);
        System.out.println("Sortded baasy" + Database.students);
        return Database.students;

    }


}
// public static void main(String[] args)
//    {
//        LinkedList<String> listOfNames = new LinkedList<String>();
//
//        listOfNames.add("D");
//        listOfNames.add("A");
//        listOfNames.add("Z");
//        listOfNames.add("Y");
//        listOfNames.add("X");
//
//        System.out.println("Before sorting: "+ listOfNames);
//        listOfNames.sort(new MyComparator());
//        System.out.println("After sorting: "+ listOfNames);
//    }
//}
//class MyComparator implements Comparator<String>
//{
//    public int compare(String string1, String string2)
//    {
//        return string1.compareTo(string2);
//    }
//}
