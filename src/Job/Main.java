package Job;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Иван","Иванов",1.0,3);
        Worker w2 = new Worker ("Петр","Петров",1.2,5);
        Worker w3 = new Worker ("Сидор","Сидоров",0.8,2);
        Director d1 = new Director("Алексей","Начальников",2.0,10);

        System.out.println(w1.getFullName() + " ->" + w1.calculateSalary());
        System.out.println(w2.getFullName() + " ->" + w2.calculateSalary());
        System.out.println(w3.getFullName() + " ->" + w3.calculateSalary());
        System.out.println(d1.getFullName() + " ->" + d1.calculateSalary());

        d1.addWorker(w1);
        d1.addWorker(w2);

        System.out.println("\n---Сведения о директоре ---");
        System.out.println(d1.toString());

        Director d2 = new Director("Мария","Начальникова",1.8,8);
        d2.addWorker(d2);

        System.out.println("\n--- Обновленные сведения о первом директоре ---");
        System.out.println(d1.toString());

    }


}
