import java.nio.file.attribute.UserPrincipal;

public class UserAddress {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
private Address address;
    public enum Gender {
        MALE,
        FEMALE
    }
    public class Address{
        private String country;
        private String city;

        public Address(String country,String city){
            this.country = country;
            this.city = city;
        }
        public String getFullAddress(){
          return country + ", "+ city;

        }
    }
    public UserAddress (String firstName,String lastName,int age,Gender gender) {
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
    public void setAddress(Address address){
        this.address = address;
    }
    public void printInfo(){
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: "+ lastName);
        System.out.println("Возраст: "+ age);
        System.out.println("Пол: "+ (gender == Gender.MALE ? "Мужской": "Женский"));
        if(address !=null) {
            System.out.println("Адрес: " + address.getFullAddress());
        } else {
            System.out.println("Адрес : не указан");
        }
        System.out.println("_________________________");
    }

    public static void main(String[]args){
        UserAddress user = new UserAddress ("Paul","Lemon",30,Gender.MALE);

        UserAddress.Address address = user.new Address("Беларусь","Минск");
        user.setAddress(address);

        user.printInfo();

        String fullName = user.getFullName();
        System.out.println("Полное имя: "+ fullName);
        user.increaseAge();
        System.out.println("После дня рождения:");
        user.printInfo();
    }
}
