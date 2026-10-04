package zoo;

public class test {
    public static void main(String[] args) {
        Animal[]animals = {
        new Cat("Мурка ",2),
        new Dog ("Шарик ",4),
        new Parrot("Проша ",1),
                new Fish("Дори ",2)
        };

    System.out.println("--- Голоса зоопарка ---");
    for (Animal a : animals){
        a.makeSound();
    }
    System.out.println("--- Кормим всех ---");
    for(Animal a : animals) {
        a.eat();
    }
    System.out.println("--- Кто умеет плавать ---");
    Swimmable[] swimmers = {
            new Dog ("Шарик",4),
            new Fish ("Дори",2)
    };
    for (Swimmable s : swimmers) {
        s.swim();
    }

    System.out.println("--- Кто умеет летать ---");
    Flyable[]flyers = {
            new Parrot("Проша",1)
    };
    for (Flyable f : flyers) {
        f.fly();
    }
    }

  }