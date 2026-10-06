package CollectionWork;



import java.util.*;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("Аня","Женский",25);
        User u2 = new User("Борис","мужской",30);
        User u3 = new User("Аня","Женский",25);
        User u4 = new User("Виктор","Мужской",33);
        User u5 = new User("Галина","Женский",44);

        System.out.println("--- LIST ---");
        List<User> userList= new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        userList.add(u5);
        System.out.println("Размер List: "+ userList.size());
        userList.forEach(System.out::println);

        System.out.println("\n--- SET ---");
        Set<User>userSet = new HashSet<>();
        userSet.add(u1);
        userSet.add(u2);
        userSet.add(u3);
        userSet.add(u4);
        userSet.add(u5);
        System.out.println("Размер Set: " + userSet.size());
        userSet.forEach(System.out::println);

        UserService service = new UserService();

        System.out.println("\n--- Поиск по имени 'Аня'---");
        List<User> anya = service.findByName(userList,"Аня");
        anya.forEach(System.out::println);

        System.out.println("\n--- Мужчины ---");
        List<User>men = service.findByGender(userList,"мужской");
        men.forEach(System.out::println);

        System.out.println("\n--- Сортировка по возрасту ---");
        List<User>sorted = service.sortByAge(userList);
        sorted.forEach(System.out :: println);

        System.out.println("\n --- Замена ArrayList на LinkedList ---");
        List<User> linkedList = new LinkedList<>(userList);
        System.out.println("Поиск 'Аня' в LinkedList");
        service.findByName(linkedList,"Аня").forEach(System.out::println);

        System.out.println("\n --- Замена HashSet на TreeSet ---");
        Set<User> treeSet = new TreeSet<>(userSet);
        System.out.println("TreeSet (Отсартировано автоматический):");
        treeSet.forEach(System.out::println);
    }
}
