package ImmutableClasses;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {
    private final String field;
    private final Map<String, String> fieldMap;
    private final User user;

    //    Return a deep copy in constructor
    public ImmutableClass(String field, Map<String, String> fieldMap, User user) {
        this.field = field;
        this.fieldMap = new HashMap<>(fieldMap);
        this.user = new User(user);
//        This must not be allowed
//        this.user = user;
    }

    //    Return a deep copy in getter
    public User getUser() {
        return new User(user);
//        This must not be allowed
//        return user;
    }

    //    Return a deep copy in getter
    public Map<String, String> getFieldMap() {
        return new HashMap<>(fieldMap);
    }
}
