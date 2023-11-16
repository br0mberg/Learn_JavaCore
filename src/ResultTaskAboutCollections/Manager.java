package ResultTaskAboutCollections;

import java.util.*;

public class Manager {
    private Map<String, User> users = new HashMap<>();

    public Manager(Map<String, User> users) {
        this.users = users;
    }

    public Manager() {}

    public boolean login(String login, String password) {
        if (!users.containsKey(login)) {
            System.out.println("Пользователь не существует\n");
            return false;
        }

        User user = users.get(login);
        if (Objects.equals(user.getPassword(), password)) {
            System.out.println("Авторизация прошла успешно\n");
            return true;
        }

        System.out.println("Неверный пароль\n");
        return false;
    }

    public boolean addNewUser(User user) {
        if (users.containsKey(user.getLogin())) {
            System.out.println("Пользователь с таким логином уже существует\n");
            return false;
        }
        System.out.println("Успешное добавление пользователя\n");
        return true;
    }

    public boolean deleteUser(String login) {
        users.remove(login);
        if (!users.containsKey(login)) {
            System.out.println("Пользователь был успешно удалён\n");
            return true;
        }
        System.out.println("Пользователь не был удалён\n");
        return false;
    }

    public List<User> getAllUsers() {
        List<User> usersList = new ArrayList<>(users.size());
        for (Map.Entry<String, User> entry : users.entrySet()) {
            usersList.add(entry.getValue());
        }
        return usersList;
    }

    public Collection<User> getAllUsers(String sortCriterion) {
        List<User> userList = getAllUsers();
        switch(sortCriterion) {
            case "login":
                userList.sort(new UserLoginComparator());
                return userList;
            case "date":
                userList.sort(new UserDateComparator());
                return userList;
            default:
                System.out.println("Пользователя не были отсортированы из-за неверного критерия");
                return userList;
        }
    }

    public boolean editUser(User user) {
        if (users.containsKey(user.getLogin())) {
            System.out.println("Пользователь был успешно изменён\n");
            users.put(user.getLogin(), user);
            return true;
        }
        System.out.println("Пользователя не существует\n");
        return false;
    }
}
