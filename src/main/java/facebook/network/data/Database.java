package facebook.network.data;

import facebook.network.model.User;

public class Database {
    public static User[] getUsers() {
        return  new User[] {
                new User("Alex","Cbljh",22,"Kiev"),
                new User("Bob","ddd",33,"ddd")};
    }

}




