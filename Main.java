// Creates an ArrayList of students, sorts them by roll number and name using selection sort.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating a list of 10 students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(7, "Mickey Mouse", "101 Rio Grande Blvd"));
        students.add(new Student(2, "Donald Duck", "452 Central Ave"));
        students.add(new Student(9, "Goofy Goof", "382 Lomas Blvd"));
        students.add(new Student(4, "Minnie Mouse", "761 Zuni Rd"));
        students.add(new Student(10, "Daisy Duck", "123 Isleta Blvd"));
        students.add(new Student(1, "Pluto Pup", "592 Alameda Blvd"));
        students.add(new Student(5, "Simba Lion", "876 Coors Blvd"));
        students.add(new Student(3, "Ariel Mermaid", "317 Tramway Blvd"));
        students.add(new Student(6, "Woody Cowboy", "654 Gibson Blvd"));
        students.add(new Student(8, "Buzz Lightyear", "231 Unser Blvd"));

        // Sorting by roll number
        System.out.println("Sorting by Roll Number:");
        StudentSorter.selectionSort(students, new SortByRollNo());
        for (Student s : students) {
            s.display();
        }

        // Sorting by name
        System.out.println("\nSorting by Name:");
        StudentSorter.selectionSort(students, new SortByName());
        for (Student s : students) {
            s.display();
        }
    }
}
