package Java;

import java.util.ArrayList;
import java.util.Iterator;

public class reviewing {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("blue");
        arrayList.add("pink");
        arrayList.add("Red");
        arrayList.add("white");

        System.out.println("\nUsing Iterator");

        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()+" ");

        }
    }
}
