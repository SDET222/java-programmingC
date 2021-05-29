package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,5,51,43,1));

        sortArrayListDecending(list);

    }




    public static void sortArrayListDecending(List<Integer> list) {



        for (int i = 0; i < list.size(); i++) {


            for (int j = 0; j < list.size(); j++) {

                if(list.get(i)> list.get(j)) {

                    Integer temp = 0;
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);

                }


            }
        }

        System.out.println(list);



    }

}
