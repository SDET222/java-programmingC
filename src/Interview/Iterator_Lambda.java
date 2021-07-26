package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator_Lambda {
    public static void main(String[] args) {

        List<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(5);
        n.add(7);
        n.add(9);
//
//        for(Integer each:n){
//            if(each<3){
//                n.remove(each);
//            }
//
//        }


        n.remove(0);
        System.out.println(n);

        Iterator<Integer> it = n.iterator();

        while(it.hasNext()){
            if(it.next()<=4){
                it.remove();
            }
        }
        System.out.println(n);

        n.removeIf(each->each<6);
        System.out.println(n);


    }

}
