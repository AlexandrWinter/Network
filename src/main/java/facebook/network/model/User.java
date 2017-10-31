package facebook.network.model;

public class User {
    private String name;
    private String surname;
    private int Age;
    private String City;

    public User(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        Age = age;
        City = city;
    }

    @Override
    public String toString() {
        return "User{"

                + name
                + '\n'
                + surname
                + '\n'
                + Age
                + City
                + '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
