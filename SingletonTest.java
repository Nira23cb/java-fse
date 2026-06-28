public class SingletonTest {

    public static void main(String[] args) {

        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        obj1.display();
        obj2.display();

        System.out.println(obj1);
        System.out.println(obj2);

        if (obj1 == obj2) {
            System.out.println("Only one object created.");
        }
    }
}