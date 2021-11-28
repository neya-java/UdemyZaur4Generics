import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hi");
        list.add('a');
        list.add(12345);
        list.add(new Human());
        System.out.println(list);

//        List <String> list = new ArrayList();
//        list.add("Hi");
//        list.add("Privet");
//        list.add("NiHao");
//        System.out.println(list);

//        for(String o : list) {
//            System.out.println(o + " / Length: " + o.length());
//        }

        for(Object o : list) {
            System.out.println(o + " / Length: " + ((String)o).length());
        }
    }
}

class Human{
    int age;
    String name;
}
