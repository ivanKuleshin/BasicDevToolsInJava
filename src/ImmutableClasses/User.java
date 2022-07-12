package ImmutableClasses;

public class User {
    private String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(User user) {
        this.name = user.name;
        this.age = user.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
