public class Overload {

    public void print(int a){
        System.out.println("int: "+ a);
    }
public void print(String s) {
    System.out.println("String: "+ s);
    }
    public void print(int a,int b) {
        System.out.println("Два int: " + a+" "+ b );
    }
    public void print(double d){
        System.out.println("double: "+ d);
    }
    public static void main(String[] args){
        Overload ex = new Overload();
    ex.print(5);
    ex.print("Привет");
    ex.print(1,2);
    ex.print(3.14);
    }
}