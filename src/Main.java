import java.io.IOException;

public class Main {

    public static void main( String[] args ) {
        new Main().someMethod();
        System.out.println("after method");
    }

    void someMethod() {
        try {
            System.out.println("try");
            while (true) {
            }
            //Object o = null;
            // o.hashCode();
        } finally {
            System.out.println("finally");
            throw new RuntimeException();
        }
        }
    }