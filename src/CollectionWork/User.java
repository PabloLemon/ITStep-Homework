
package CollectionWork;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private String gender;
    private int age;

    public User(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {return name;}
    public String getGender() {return gender;}
    public int getAge(int age) {return age;}

    public void setNAme(String name) {this.name=name;}
    public void setGender(String gender) {this.gender = gender;}
    public void setAge(int age) {this.age = age;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name)
                && Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }

    @Override
    public int compareTo(User other) {
        int ageCompare = Integer.compare(this.age, other.age);
        if (ageCompare != 0) {
            return ageCompare;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "User{name='" + name + " ',gender ='" + gender + "', age=" + age + "}";
    }
}
