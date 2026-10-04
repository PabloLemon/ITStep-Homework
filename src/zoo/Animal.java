package zoo;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void eat (){
        System.out.println(name +"ест");
    }
    public void sleep(){
        System.out.println(name + "спит");
    }

    public abstract void makeSound();
    }



