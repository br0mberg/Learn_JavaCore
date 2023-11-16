package ComporatorComparable_1;

import java.util.Comparator;

public class StudentAvgRatingComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverageRating().compareTo(o2.getAverageRating());
    }
}
