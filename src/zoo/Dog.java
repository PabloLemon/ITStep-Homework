package zoo;

public class Dog extends Animal implements Swimmable
{
    public Dog(String name,int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + "Гав");
    }

    @Override
    public void swim(){
        System.out.println(name + " плывет по-собачьи");
    }
}
