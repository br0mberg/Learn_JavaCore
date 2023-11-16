package ComporatorComparable;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Andrey", 20));
        users.add(new User("Egor", 15));
        users.add(new User("Egor", 16));
        users.add(new User("Andrey", 2));

        System.out.println(users);
        users.sort(new UserNameComparator());
        System.out.println(users);
        users.sort(new UserAgeComparator());
        System.out.println(users);
        Comparator<User> comparator = new UserNameComparator().thenComparing(new UserAgeComparator());
        users.sort(comparator);
        System.out.println(users);
    }
}
