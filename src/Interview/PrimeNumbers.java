package Interview;

public class PrimeNumbers {
    public static void main(String[] args) {

       // primeNumbers(50);
        count100(0);

    }
    public static void primeNumbers(int num){
        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <=i ; j++) {
                if(i%1==0 && i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
    public static void count100(int num) {

        if(num<100){
            num++;
            System.out.println(num);
            count100(num);
        }

    }
}
