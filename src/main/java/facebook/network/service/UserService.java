package facebook.network.service;
import facebook.network.data.Database;
import facebook.network.model.User;

public class UserService {
    public static void main(String[] args) {
        final User alex = new User("Alex", "ddd", 22, "ff");
        System.out.println(alex);
        Database database = new Database();
        //getAll();
        //   getFirst();
        //   getLast();
        final User userByName=getByName("Bob");
        System.out.println(userByName);
        //todo create method getBy.. (all fields)
    }

    private static void getAll(){
        final User[] users=Database.getUsers();
        for (User user: users) {
            System.out.println(users);
        }
    }

    private static User getByName(String name) {
        final User[] users = Database.getUsers();
        for (int i = 0; i < users.length; i++) {

            if (name.equals(users[i].getName()))
                return users[i];
        }
        return null;
    }

    private static void getLast() {
    }


}
