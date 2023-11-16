package ResultTaskAboutCollections;

import java.util.Comparator;

public class UserLoginComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getLogin().compareTo(o2.getLogin());
    }
}
