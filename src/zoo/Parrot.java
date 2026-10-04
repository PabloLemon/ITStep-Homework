package zoo;

public class Parrot extends Animal implements Flyable {

    public Parrot(String name,int age) {
        super(name,age);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " кхе -кхе" );
    }
    @Override
    public void fly() {
        System.out.println(name + " Летает по небу ");
    }
    }

