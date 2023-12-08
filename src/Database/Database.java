package Database;

import model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Database {
   Student student1 =  new Student("Nurkamil","Java-12",5);
    Student student2= new Student("Asan","Java-10",4);
    Student student3=  new Student("Gulya","JS-9",3);
    Student student4=    new Student("leila","Java-12",5);
    public static LinkedList<Student> students = new LinkedList<>(Arrays.asList( new Student("Nurkamil","Java-12",5),
    new Student("Asan","Java-10",4),
     new Student("Gulya","JS-9",3),
     new Student("leila","Java-12",5)));
}
