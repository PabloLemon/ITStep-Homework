public class Box {
    private int width;
    private int height;
    private int depth;

    public Box() {
        this(10, 10, 10);
        System.out.println("Вызван конструктор без параметров");
    }

    public Box(int size) {
        this(size, size, size);
        System.out.println("Вызван конструктор с одним параметром");
    }

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        System.out.println("Вызван основной конструктор");
    }

    public void printSize() {
        System.out.println("Коробка: " + width + "x" + height + "x" + depth);
        System.out.println("______________________");
    }

    public static void main(String[] args) {
        System.out.println("=== Коробка 1(без параметров) ===");
        Box box1 = new Box();
        box1.printSize();

        System.out.println("=== (Коробка 2(куб 5х5х5) ===");
        Box box2 = new Box(5);
        box2.printSize();

        System.out.println("=== Коробка 3(20х30х40) ===");
        Box box3 = new Box(20, 30, 40);
        box3.printSize();
    }
}