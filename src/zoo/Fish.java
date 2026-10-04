package zoo;

public class Fish extends Animal implements Swimmable{
  public Fish(String name,int age){
      super(name,age);
  }

    @Override
    public void swim() {
        System.out.println(name + " плывет,виляя хвостиком");
    }

    @Override
    public void makeSound() {
        System.out.println(name + "Буль-Буль");
    }
  }

