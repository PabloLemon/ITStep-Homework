package CollectionWork;

import java.util.*;
import java.util.stream.Collector;

public class UserService {

    public List<User> findByName(Collection<User> users, String name) {
        List<User> result = new ArrayList<>();
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(name)) {
                result.add(u);
            }
        }
        return result;
    }

    public List<User> findByGender(Collection<User> users, String gender) {
        List<User> result = new ArrayList<>();
        for (User u : users) {
            if (u.getGender().equalsIgnoreCase(gender)) {
                result.add(u);
            }
        }
    return result;
    }

public List<User> sortByAge(Collection<User> users) {
        List<User> result = new ArrayList<>(users);
        Collections.sort(result);
        return result;
}
}
