package ComporatorComparable_1;

import java.util.*;

public class Main {
    public static void deleteStudentsWithBadMarks(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageRating() < 3) students.remove(student);
        }
    }
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Andrei", "SM5-51B", 5));
        students.add(new Student("Elena", "BBSO-01-21", 4));
        students.add(new Student("Egor", "SM5-51B", 3));
        students.add(new Student("Andrei", "BBSO-01-21", 5));
        students.add(new Student("Egor", "BBSO-01-21", 1));
        students.add(new Student("Elena", "SM5-51B", 5));

        deleteStudentsWithBadMarks(students);
        System.out.println(students);

        Set<Student> studentsTreeSet = new TreeSet<>(students);
        System.out.println(studentsTreeSet);

        students.sort(new StudentAvgRatingComparator());
        System.out.println(students);

        students.sort(new StudentGroupComparator());
        System.out.println(students);

        Comparator<Student> comp = new StudentGroupComparator()
                .thenComparing(new StudentAvgRatingComparator());

        System.out.println(students);
    }
}
