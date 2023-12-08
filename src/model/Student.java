package model;

public class Student {
    private  String name;
    private String group;
    private double baasy;

    public Student() {
    }

    public Student(String name, String group, double baasy) {
        this.name = name;
        this.group = group;
        this.baasy = baasy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getBaasy() {
        return baasy;
    }

    public void setBaasy(double baasy) {
        this.baasy = baasy;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name: " + name + '\'' +
                ", group: " + group + '\'' +
                ", baasy: " + baasy +
                '}';
    }
}
