package ComporatorComparable_1;

public class Student implements Comparable<Student>{
    private String name;
    private String group;
    private Integer averageRating;

    public Student(String name, String group, Integer averageRating) {
        this.name = name;
        this.group = group;
        this.averageRating = averageRating;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Integer getAverageRating() {
        return averageRating;
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", averageRating=" + averageRating +
                "}\n";
    }
}
