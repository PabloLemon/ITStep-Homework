public class User {
 private String firstName;
 private String lastName;
 private int age;
 private Gender gender;

 public enum Gender {
     MALE,
     FEMALE
 }
 public User (String firstName,String lastName,int age,Gender gender) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age= age;
     this. gender = gender;
 }
    public String getFullName(){
     return firstName + " " + lastName;
    }
public void increaseAge() {
    this.age++;
}
public void printInfo(){
     System.out.println("Имя: " + firstName);
    System.out.println("Фамилия: "+ lastName);
    System.out.println("Возраст: "+ age);
    System.out.println("Пол: "+ (gender == Gender.MALE ? "Мужской": "Женский"));
    System.out.println("_________________________");
}

public static void main(String[]args){
 User user = new User ("Paul","Lemon",30,Gender.MALE);

 user.printInfo();

 String fullName = user.getFullName();
 System.out.println("Полное имя: "+ fullName);
 user.increaseAge();
    System.out.println("После дня рождения:");
 user.printInfo();
 }
}
