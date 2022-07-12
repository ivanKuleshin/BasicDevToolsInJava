package ImmutableClasses;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClassMain {
    public static void main(String[] args) {
        Map<String, String> fieldMap = new HashMap<>(Map.of("good key", "value"));
        User user = new User("Ivan", 25);

        ImmutableClass immutableClass = new ImmutableClass("this is immutable class", fieldMap, user);

        immutableClass.getFieldMap().put("unwanted key", "another value");
        immutableClass.getUser().setName("Oleg");
        System.out.println("Get map and User from the object and modify:");
        immutableClass.getFieldMap().entrySet().forEach(System.out::println);
        System.out.println("The user is: " + immutableClass.getUser());

        fieldMap.put("bad key", "another value");
        user.setName("Viktor");
        System.out.println("Modify initial map and User:");
        immutableClass.getFieldMap().entrySet().forEach(System.out::println);
        System.out.println("The user is: " + immutableClass.getUser());
    }
}
