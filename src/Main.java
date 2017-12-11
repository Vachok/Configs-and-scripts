//87.58_AnonClas
/*class Popcorn {
    void doSome() {
        System.out.println("popcorn");
    }
    void secondMethhod() {
        System.out.println("second");
    }
}

=======
//86.57-InnerClases
/*public class Main {
    private int i = 5;
    static int q = 5;


    public static void main( String[] args ) {
        StaticClass staticClass = new StaticClass();
        staticClass.mthod();
        Main main = new Main();
        main.method();
        Inner inner = main.new Inner();
        inner.method2();
    }

    Inner inner3 = new Inner();
    void method() {
        class NewInner {
            void newMethod() {
                System.out.println("bla");

            }
        }
        NewInner newInner = new NewInner();
        newInner.newMethod();
    }

    static class StaticClass {
        void mthod() {
            System.out.println(q);
        }
    }



    class Inner {
        int k = 6;

        void method2() {
            System.out.println(q);
            System.out.println(i);
        }
=======
//83.56-Generic
/*import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Parrent<T> {
    void method() {
        System.out.println("b");
    }
}

class Child extends Parrent {
}
=======
//79.55-Sets
//78.54-Maps

/*public class Main {
    public static void main( String[] args ) {
        Map map3 = new HashMap();
        Map map2 = new Hashtable();
        Map map4 = new LinkedHashMap();
        Map map = new TreeMap();
        map.put("1" , "one");
        map.put("3" , "three");
        map.put("2" , "two");
        System.out.println(map.get("3"));
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.print(o + " ");
        }
=======
//77.53-queue
/*import java.util.*;
=======
//76.52-Spiski_List 
/*import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
=======
/*75.52-SortCollection
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person {
    private int age;

    public Person( int age ) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }
}

class ComparePerson implements Comparator<Person> {
    @Override
    public int compare( Person o1 , Person o2 ) {
        return o1.getAge() - o2.getAge();
    }
}
//65.50-Collection
/*import java.util.*;
=======
//64.49-Equals_HashCode
/*import java.util.HashMap;
import java.util.Map;

class Book {
    String author;
    String name;
}

class Ticket {
    int number;
    String libraryName;

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (number != ticket.number) return false;
        return libraryName.equals(ticket.libraryName);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + libraryName.hashCode();
        return result;
    }
}
=======
//63.48-Date_calend
/*import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main( String[] args ) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE , 1);
        System.out.println(calendar.getTime());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        Date newDate = simpleDateFormat.parse("05/12/1985 05:22");
        System.out.println(newDate);
    }
}*/
/*62.47-Serializ_nasleduem_obj
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Son extends Child {
    void method() {
        System.out.println("son");
    }
}
public class Main {
//83.56-Generic
=======
    public static void main( String[] args ) throws Exception {
        UserChild user = new UserChild();
        user.lifeLevel = 55;
        User.staticField = 45;
        Sword sword = new Sword();
        sword.level = 5;
        user.sword = sword;
        user.childLevel = 65;

        FileOutputStream fileOutputStream = new FileOutputStream("tempfile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        User.staticField = 35;

        FileInputStream fileInputStream = new FileInputStream("tempfile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserChild newUser = (UserChild) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);
        System.out.println(User.staticField);
        System.out.println(newUser.sword);
        System.out.println(newUser.childLevel);

/* 61.46-Serializ
import java.io.*;

public class Main {
    public static void main( String[] args ) throws Exception {
        User user = new User();
        user.lifeLevel = 55;
        User.staticField = 45;
        Sword sword = new Sword();
        sword.level = 5;
        user.sword = sword;

        FileOutputStream fileOutputStream = new FileOutputStream("tempfile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        User.staticField = 35;

        FileInputStream fileInputStream = new FileInputStream("tempfile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);
        System.out.println(User.staticField);
        System.out.println(newUser.sword);
        
/*60-45.files_directories
import java.io.*;

public class Main {
    public static void main( String[] args ) throws Exception {
//88.59-Clon
        MyObject myObject = new MyObject();
        myObject.i = 1;
        NewObject newObject = new NewObject();
        newObject.j = 3;
        myObject.newObject = newObject;
        MyObject myObject1 = myObject.clone();
        myObject1.i = 2;
        System.out.println(myObject.i);
        myObject1.newObject.j = 4;
        System.out.print(myObject.newObject.j);
    }
}



class MyObject implements Cloneable {
    int i;
    NewObject newObject;
    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        MyObject myObject = (MyObject) super.clone();
        myObject.newObject = newObject.clone();
        return myObject;
    }
}



class NewObject implements Cloneable {
    int j;


    @Override
    protected NewObject clone() throws CloneNotSupportedException {
        return (NewObject) super.clone();
    }
}

/*
2 вида клонирования - поверхностное и глубокое
для клонирования нужно имплементить инт. Cloneable
@Override метод clone()
При глубоком клоне, во всех внутренних типах, необходимо
клонировать объекты, и сделать ссылки на них
=======
        File file = new File("temp.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("exists");
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("1\n");
        fileWriter.write("2\n");
        fileWriter.flush();

        FileReader fileReader = new FileReader(file);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str3");
        bufferedWriter.newLine();
        bufferedWriter.write("str4");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
/*53.42-Exception
import java.io.File;
import java.io.IOException;

public class Main {
/*46.36-methodMainandHisProps
    public static void main( String[] myArgs ) {
        for (String s : myArgs) { 
            System.out.println(s);

//45.35-operatory_JAVA
    }
}
+ - / *
%  остаток деления
< > <= >=
== != reference сравнение
instanceof для ссылок
string + переопределён для класса String
++ -- увеличивает/уменьшает на 1
?:  проверка правда/ложь
& | ^ ! && || и/или
 */
/* Java_Lessons-44 Java 34: Garbage Collector
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public static void main( String[] myArgs ) {
        int i = 10;
        switch (i) {
            case 1:
                System.out.println(1);
            default:
                System.out.println("default"); //не обязательно последний
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
        }
        static Main main;


    public static void main( String[] args ) {
//87.58_AnonClas
        method(new Popcorn() {
            void doSome() {
                System.out.println("bla");
            }
        });
    }
    static void method( Popcorn popcorn ) {
        popcorn.doSome();
    }
}
=======
//79.55-Sets
        Set set = new HashSet();
        Set set2 = new LinkedHashSet();
        Set set3 = new TreeSet();
        set.add("1 ");
        set.add("2 ");
        set.add("2 ");
        set.add("1 ");
        set.add("1 ");
        for (Object o : set) {
            System.out.print(o);
        }
=======
//77.53-queue
        Queue queue = new LinkedList();
        Queue queue2 = new PriorityQueue();
        queue.offer("1");
        queue.offer("3");
        queue.offer("2");
        while (queue.size() > 0) {
            System.out.print(queue.poll());
        }
=======
//76.52-Spiski_List
        List list = new ArrayList(); // коллек. на основании индекса
        System.out.print(list.size() + " /// ");
        List list1 = new Vector(); // ArrayList synchronized
        List linked = new LinkedList(); // implements Queue. Двунаправленный список
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        
//75.52-SortCollection
        Set set = new TreeSet(new ComparePerson());
        set.add(new Person(4));
        set.add(new Person(6));
        set.add(new Person(5));
        set.add(new Person(2));
        for (Object o : set) {
            System.out.println(o);
        }
=======
//65.50-Collection
        Collection collection = new TreeSet();
        collection.add("2");
        collection.add("3");
        collection.add("1");
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}*/
//64.49-Equals_HashCode
/*
        Ticket ticket = new Ticket();
        ticket.number = 1123;
        Book book = new Book();
        book.author = "Kernegi";
        book.name = "how to get friends";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket , book);

//83.56-Generic
        List<Parrent> list = new ArrayList<>();
        list.add(new Parrent());
        Main main = new Main();
        main.method(list);

    }

    void method( List<? super Child> list ) {
        list.add(new Son());
        for (Object o : list) {
            Parrent p = (Parrent) o;
            p.method();
        }
    }
}*/
/*
        Ticket ticket2 = new Ticket();
        ticket2.number = 1123;

        Book karnegiBook = library.get(ticket2);
        System.out.println(karnegiBook.author);
    }
}*/
/*55.44-StringBuilder
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.insert(0 , "-");
        int i = stringBuilder.length();
        System.out.println(i);
/*54.43-Assertions
        new Main().myMethod(-5);
    }

    private void myMethod( int a ) {
        assert (a > 0);
        System.out.println(a);
/*52.40-for_enchanced
        int[] arr = {1 , 2 , 3};
        int i = 0;
        for (System.out.println("hello this is first state"); i < arr.length; i++)
            System.out.println(arr[i]);
/*51.39-Cycles_whileDowhile
        int[] arr = {1 , 2 , 3};
        int i = 0;
        while (i == 5) {
            System.out.println(arr[i]);
            i++;
        }
        i = 0;
        do
            System.out.println("do");
        while (false);
/*47.37-if_else
        int a = 6;
        int b = 6;
        int c = 4;
        int d = 5;
        if (a == b) {
            if (c == d) {
                System.out.println("a > b");
            }
        } if(false) {
        } else
            System.out.println("bla");
        method();
       
    }

    private static void method() {
        Main main = new Main();
        Main main2 = new Main();
        main = null;
        main2 = null;
        System.gc();
    }

    @Override
    public void finalize() {
        Main.main = this;
    }

    void meMethod() {
        /*chk
        throw new Throwable();
        throw new Exception();
        throw new IOException();
//////////|||||||||||||||||||||||||||||||||||||||\\
        /*UNchk
        throw new Error();
        throw new RuntimeException();
         */
//    }
//}



/* Иерархия Exceptions
1. Throwable
    2. Error - не нужно ловить! Это риторические проблемы - сами придут.
    2. Exception -
        3. RuntimeException - это "ошибки программирования" (unchk)
        3. IO (chk)
            3.1 Если работаем с "чужими" - нужно помещать в try/catch.
            3.2 Если пишем сами, для других прогеров. https://youtu.be/mLpMtc62530?t=39m25s
        3 ....можно добавить свои подклассы
 */