

public class Main {
    public static void main( String[] args ) {
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.insert(0 , "-");
        int i = stringBuilder.length();
        System.out.println(i);
    }
}