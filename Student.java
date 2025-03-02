// This class represents a student with a roll number, name, and address.

public class Student {
    int rollno;
    String name;
    String address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll Number: " + rollno + ", Name: " + name + ", Address: " + address);
    }
}
