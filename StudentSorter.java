// Implements selection sort and comparator classes for sorting students.

import java.util.ArrayList;
import java.util.Comparator;

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class SortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollno, s2.rollno);
    }
}

public class StudentSorter {
    // Selection sort for sorting students
    public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap elements
            Student temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}
