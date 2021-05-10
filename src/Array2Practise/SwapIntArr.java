package Array2Practise;
import java.util.*;
public class SwapIntArr {
    public static void main(String[] args) {
        int [] num = {14,11,18,7,17,12,9,24};
                    //14,18,11,7,12,17,24,9
        int temp =0;

        for (int i = 0; i < num.length-1; i++) {

            if((num[i] % 2 !=0) && (num[i+1] % 2==0))
                temp+=num[i];
                num[i] = num[i+1];
                num[i+1]=temp;
            break;
        }

       System.out.println(Arrays.toString(num));




    }
}
