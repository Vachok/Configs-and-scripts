public class OverloadingExmpl {
    public static void main( String[] args ) {
        OverloadingExmpl overloadingExmpl = new OverloadingExmpl();
        short b = 5;
        overloadingExmpl.method(b);
    }

    void method(Integer i) {
        System.out.println("Integer"); //не запустится
    }

    void method(Object... i) {
        System.out.println("Object"); //компилятор в ступоре - что запусквть?
    }
}