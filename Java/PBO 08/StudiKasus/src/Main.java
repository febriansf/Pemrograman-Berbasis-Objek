public class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.x = 10;
        a.y = 20;
        a.myMethod1();

        ClassC c = new ClassC();
        c.x = 1;
        c.y = 2;
        c.z = 3;
        c.c = 4;

        c.myMethod1();
        c.myMethod2();
    }
}
