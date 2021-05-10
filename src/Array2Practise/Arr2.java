package Array2Practise;

import java.util.Arrays;

public class Arr2 {
    public static void main(String[] args) {


         /*
                      ******* Tasks *******
   1 String d[]={"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com",
                "cybertek@outlook.com"};
    By using for loop declare witch one has @gmail.com
   2 Store values at String Array variable and them declare array.
     example: you have 3 array but you will give string values later and
       then print Arrays length
   3 Create an array that holds 12 months names. User should be able to enter
     month index and output should be: “The month name is <MonthName>”
     As long as user  add's invalid number print "re-enter"
     After 3 attempt declare "you tried 3 times sorry system locked" and exit program.
     Hint: USE FOR AND WHILE
   4 Write a program that asks how many student user wants  and ask name
       and store each of the names in the array students.
   5 Second Way ---  Write a program that asks "enter a name" 10 times,
       and store each of the names in the array students
   6 Second Way ---  Write a program that asks "enter a name" 10 times,
       and store each of the names in the array students
   7 write a program that can find the minimum and maximum
     number from any given int array
   9 write a program by using FOR LOOP that can find the maximum number
     from any given int array which declared IN ADVANCE.
   12 Combine arrays  int arr1[]={1,2,3};  int arr2[]={4,5,6,7}; int arr3[]= {8,9,10};
   13 int[] arr5 = {3, 2, 1};  int[] arr6 = {2, 1, 3};  sort and check Arrays equality
   15 "Cybertek School";  "School Cybertek"; sort them and  then check eguality.
    Should be true
   17 int[] arr11 = {3,1,4,-1,100, -100, 200, 155};
     Declare ascending array then convert it descending array and print like this
      output:
           [-100, -1, 1, 3, 4, 100, 155, 200]
           [200, 155, 100, 4, 3, 1, -1, -100]
     18 USER MUST INPUT HOW MANY WORDS YOU WANT.YOU MUST USE 1 SCANNER TO GET 5 INPUT
        Given a String array words, iterate through each word and print first
        and last letter of each element in the format below.
        Example: Hint: you will use to print statement
        words → ["hello", "why", "by", "apple" , "note"]
        output:
               ho
               wy
               by
               ae
               ne
              [ho, wy, by, ae, ne]
     19 The code provided in your main method will take in five Strings and
        save them into an array called arr.  Print out the first three letter of
        each element of arr, one per line.  You can assume that every element of
        arr is at least 3 letters long.
        Example:
                arr -> ["apple", "banana"]
                  prints: app
                          ban
     20  Given an array of ints, print true if the array contains a 5 next
         to a 5 anywhere in the array. If no consecutive 5s or no 5s are
         detected in your code then print false.
nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false
     22  Given an array nums, calculate count of even numbers in nums and
         print out to console. AND DECLARE WHAT NUMBERS ARE GIVEN
nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
     23  Given an array nums with 7 integers every element is repeated twice
      -  except one. Find that element and print it to console.
         Example:
             nums -> [1, 1, 2, 3, 4, 3, 4]
             output : 2
     24 Ask user how many words he wants to add and fill out array and
        find longest and shortest word.
        Given the array words, it will print the word with the largest length.
     26  Write a program that can return the average number from an array of integers
         ex:[1,2,3]
         average:[10, 15, 5, 6]
         average: 9
                    [4, 5, 6, 7, 8, 10, 20, 30, 0]
         average: 10
      27  DecimalFormat ,  rounding the decimals
      28 char[] array = {'d', 'c', 'a', 'b'};
         By using char array and for loop  declare this {'d','c','a','b'};
         acd  skip b
      29  String str ="Today is great day"; declare as Array [Today, is, great, day]
          then reverse Array[Today, is, great, day] to >  day great is Today
      30  String str2 = "ABCD";  get String    //["A", "B", "C", "D"]
          and char //['A', 'B', 'C', 'D']
      31  int[] nums  = {1, 2, 3, 4}; use for eeach loop to get 1 2 3 4
      32  String[] students = {"Muhtar", "Asiya", "Murodil"}; use for each
          to get Muhtar Asiya Murodil
      33 int[] arr14 = { 10, 2, 3, 4, 5, 6, 7, 8, 9, 1}; use each for loop
          to get 5,6,7,8,9,10
      34 String sentnce = "I like Java";  use for each to get
           I
           lIKE
           Java
           THEN REVERSE THEM
           Java
           like
           I
      35  given an array:
          String[] emails = {"cybertek@gmail.com", "cybertek@yahoo.com",
                            "cybertek@hotmail.com", "cybertek@outlook.com"}
          elemnts could be more in the array print all the email addresses
          excluding the gmail addresses
          NOTE: MUST USE FOR EACH LOOP
      36   //                      0        1         2         3
        String[] DevTeam = {"Zeynep", "Haider", "Jovid", "Muhtar"};
        String[] TestersTeam = {"Rahman", "Aishan", "Osman", "Ali"};
        String[] PO = {"Barzy", "Donald"};
        String[] TestersTeam2  ={"Ilham", "Zarina", "Aizhan", "Asiman"} ;
        Creat SCRUM Team ARRAY AND ADD Devteam,Testersteam,Po into scrum team then
        change  "Muhtar" to "Jean" in devtean, and then change Testerteam with
        Testerteam 2 in Scrum Team Array then declear "Jean" from devteam ,
        Aizhan from Testerteam2 and then declear whole Testerteam2 and
         then declaer "Donald" from Po team
      37 {  { 1, 2, 3} ,  { 4, 5, 6, 7}   };
         Creat 2 singel  Array then create multi dimensional Array and
         put 2 singel array into multi dimensional array then declear multi dimensional
         Aray's length then creat new array and assign second single array
         from multi demensional to new array and declaer new array and then declear 7
      38  {  {'A', 'B' } ,  {'D', 'E', 'F'} ,  {'G', 'H', 'I'} };
         Creat  char multi demensional Array and then put three single dimencional
         array and put 3 values into  each single dimencional array  and then
         assign 'D' to char variable and print 'D'
         then assign {'G', 'H', 'I'} to another char variable and print them
      39 {  {"A", "B", "C"},   {"D", "E", "F"},  {"J", "H", "I"}
         Creat String multi dimencional Array and then declear "H"
      40 {1,2,3};  creat single dimensional array and print it like this [1, 2, 3]
         Create multi dimensional array   {{1,2,3},{4,5,6}}; and declare like this
         [[1, 2, 3], [4, 5, 6]]
      41 {{1,2,3},{4,5,6}} ,     {{7,8,9},{10,11,12}
         create multi demencional array and declare this [1, 2, 3], then [4, 5, 6]
         then  [10,11,12]  then  12
      42 {"Tiger", "Lion", "Monkey", "Turtle", "Corcodile"};
         {"Eagle", "Ducks", "Peacock","Chicken"};
         These are single dimencional Arrays. Create multi dimencional Array name is
         zoo and put these into zoo then create String and assign
         "Chicken from zoo" to new String and print "Chiken"
         then declear all animals excluding "Chiken" from zoo
         Eagle
         Ducks
         Peacock
         then declear all animlas excluding
         "Turtle"  from zoo
         Tiger
         Lion
         Monkey
         Corcodile
      43  1. create an int array called numbers that has length of 100
          2. assign 1~100 to the array' each indexes [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
          3. use for each loop to print out all the even numbers. 2 4 6 8 10 12 14 16 18 20 22
             Must use continue statement
      44 Ask user "how many number he wants to add?"then fill out this int array [];
         and then REVERSE and print this 5 4 3 2 1 and then
         Reverse and print as array [5, 4, 3, 2, 1]
      45 3. write a program that can return the number of appearances of
         "java" and "python" anywhere in the sentence--
         "I Like java and javascript not python";
         You will do for each and regular for loop for each result: java 2  python 1
         regulat for loop reault:java 2 python 1
         python
         java javascript
      46 MUST use FOR EACH LOOP {1,2,3,4,5,6,7,8,9,10}; THEN REGULAR FOR LOOP
         write a program that can count the even and odd number from
         an array of integers and print out odd and even numbers
         output
      5  count odd number
      5 count even number
               1 3 5 7 9
               2 4 6 8 10
      47 {{1,2,3},{4,5,6}};
         output should be these
         [1, 2, 3]
         [4,5,6]
         3
         [[1, 2, 3], [4, 5, 6]]
         [4, 5, 6]
         1
         2
         3
         4
         5
         6
      48 {  {'A','B' } , {'C', 'D', 'E' } , {'F', 'J', 'H', 'I' }  };
         output
         --first do this
         AB
         CDE
         FJHI
         --second do only this
         A
         B
         --Then do this
         A
         B
         C
         D
         E
         F
         J
         H
         I
      49 {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };
         print like this:
         9 8 7
         6
         5 4 3 2 1 0
      50 {  {9, 8, 7}, {6},  { { 5,4,3,2,1,0}   };  output should be this
         7 8 9 6 0 1 2 3 4 5
      51 {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };    output should be
         5 4 3 2 1 0 6 9 8 7
      52 {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };  output should be
         0 1 2 3 4 5 6 7 8 9
      53   {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
         Output should be all even numbers and count of odd numbers
         2 4 6 8 10 12 14 16 18 20
         count: 11
      54 {1,2,3,4,5};  output  use for each
         1
         2
         3
         4
         5
55  { {1,2,3}, {4,5,6}  };  output  use for each
1
2
3
4
5
6
      56  {  {'A', 'B'} , {'C', 'D', 'E'} , {'F', 'J', 'H'}  };
         output  use For Each then regular
         A
         B
         C
         D
         E
         F
         J
         H
      57 {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
         };
         Output should be  USE FOR EACH
         2 4 6 8 10 12 14 16 18 20   even numb
         11 > count of odd numbers
         sum of odd: 121
         sum of even: 110
      58 int[] arr88=new int[5];
         output
         5 4 3 2 1
         [5, 4, 3, 2, 1]
         59 int[] numbers=new int[20];
         output
         [20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
         20 18 16 14 12 10   ->> USE FOR EACH TO GET THIS RESULT
      60 Write a program that can print out the unique values from a String Array
	     do with For each loop and then with regular For loop
	     Ex:	if arr -> {"A", "A", "B", "C", "C"}
				output: B
      61 String[] arr = {"1","2.5", "3", "3.5", "4.5"};
         by using sort Array get max and min number
      62 Complete the method so that it takes in a 2-D array and returns the
         sums of the rows as an integer array.
         For example, the if we run rowSums for the following 2D array:
         {
           {1,1,2}, //sum = 4
           {3,1,2}, //sum = 6
           {3,5,3}, //sum = 11
           {0,1,2}  //sum = 3
           Ascending_DecsendingOrder
}
          Then we should get the following array back:
          {4,6,11,3}
      63 you must write RETURN method
         Switch the last element in an array with the first and return the array.
         example:
         do_switch([1,2,3,4])
         returns:[[4,2,3,1]
         do_switch([7,2,3,5])
         returns:[5,2,3,7]
      64 YOU MUST WRITE RETURN METHOD
         Complete the combineNames method to return a new String array that
         is composed of the first name and last name of each of the parameters.
         This may be confusing so look at the example:
         first_names = {"bob","joe"}
         last_names = {"jones","smith"}
         returns a new String array with {"bob jones", "joe smith"}
         AT THE END DO FOR LOOP. THIS IS SECOND WAY
    //65 You must create return method and you must 2 int parameter.
         Given two positive integers m and n, find their greatest common divisor,
         that is, the largest positive integer that evenly divides both m and n.
         if m = 15 and n = 25, then result greatest common divisor is = 5.
      66 USE ONLY 1 LOOP
         Combine arrays  int arr1[]={1,2,3};  int arr2[]={4,5,6,7};
         int arr3[]={1,2,3,4,5,6,7};
      67 INPUT
         int[] nums = {1, 2, 3, 4, 5, 6, 7};
         OUTPUT
         [4, 5, 6, 7, 1, 2, 3]
      68 input
         int[] num21 = {1,2,4,0,0,5,0};
         output
         [5, 4, 2, 1, 0, 0, 0]
     69 int[] num23 = {1,2,4,0,0,5,0};
      count how many 0 have and decaker 3
     70 input
        int g[]={1,2,3};
        int gg[]={4,5,6,7};
        int h[]={8,9};
        int dd[]={10,11};
         output
         [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
      71 Find missing number.
         input
         int a[]={1,2,3,4,6,7};
  output
  5
     //72 int a[]={1,3,5};
          int b[]={2,4,6};
          output
          [1,2,3,4,5,6]
     //73 String str = "Java Java Java";
          String t="Java";
          output: 3
     //74 String a="a2b5c7a9f0dafa2s6a8d5a";
          String str="";
          output
          aaaaaa2b5c79f0df2s68d5
     //75 Don't use divide operator
          int a=10;
          int b=2;
          divide a by b and result is =5
     //76  Ask user enter 3 word and add >  apple,banan,
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
               ****** Solutions ******
======================================================================================
            //1
            String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};
            // print out all the users who regsitered with thier gmail
            //  max:  4
            for (int i = 0; i < emails.length; i++) {
                // String email = emails[i];
                if (emails[i].endsWith("@gmail.com")) {
                    System.out.println(emails[i]);
                }
//            if(email.endsWith("@gmail.com")){
//            System.out.println(email);
//            }
            }
//========================================================================================//
//2
            String[] Testers = new String[3];  // {"Reem", "Madina", "Osman"};
            // index: 0, 1, 2
            Testers[0] = "Reem";
            Testers[2] = "Osman";
            Testers[1] = "Madina";
            for (int i = 0; i < Testers.length - 1; i++) {
                String ss = Testers[i];
                System.out.println(ss)
                ;
            }
            //  System.out.println(Testers[0]);  // Reem
            //  System.out.println(Testers[1]); // null
            //System.out.println(Testers[2]); // "Osman
            System.out.println(Testers.length);  // 3
//===========================================================================//
//3
            String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("Enter month number: ");
        int num = scan.nextInt();
            int attempt = 0;
            while (num < 1 || num > 12) {
                System.out.println("invalid number print re-enter:");
                num = scan.nextInt();
                attempt++;
                if (attempt == 2 && (num < 1 || num > 12)) {
                    System.out.println("Exceed number of attempts, bye!");
                    System.exit(0);
                }
            }
        System.out.println(months[num - 1]);
//============================================================================//
//4
            System.out.println("Hw many student do you want?");
            int i5 = scan.nextInt();
            String[] student = new String[i5];
            for (int i22 = 0; i22 <= student.length - 1; i22++) {
                System.out.println("Enter name");
                student[i22] = scan.next();
            }
            System.out.println("List of students:");
            for (int i33 = 0; i33 <= student.length - 1; i33++) {
                System.out.println((i33 + 1) + ")" + student[i33]);
            }
//=============================================================================//
//5
            String name = " ";
            String students[] = new String[10];
            for (int i55 = 0; i55 < 10; i55++) {
                System.out.println("enter name");
                students[i55] = scan.next();
                name += i55 + 1 + ":" + students[i55] + " ";
            }
            System.out.print(name);
//================================================================================//
//6
            String[] students11 = new String[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter name");
                students11[i] = scan.nextLine();
            }
            System.out.println("Print names: ");
            int count = 0;
            for (String r : students11) {
                count++;
                System.out.println(count + ") " + r.substring(0, 1).toUpperCase().concat(r.substring(1).toLowerCase()));
            }
//===============================================================================//
//7
            System.out.println("How many number do you want to enter?");
            int i1 = scan.nextInt();
            int i2[] = new int[i1];
            int max = 0;
            for (int i = 0; i <= i2.length - 1; i++) {
                System.out.println("Enter number");
                i2[i] = scan.nextInt();
                if (i2[i] > max) {
                    max = i2[i];
                }
            }
            System.out.println(max);
//==========================================================================//
//8
            System.out.println("How many number do you want to enter?");
            int i11 = scan.nextInt();
            int i22[] = new int[i11];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= i22.length - 1; i++) {
                System.out.println("Enter number");
                i22[i] = scan.nextInt();
                if (min > i22[i]) {
                    min = i22[i];
                }
            }
            System.out.println(min);
         int a[]={1,2,3,4,5};
int max=0;
        int i=100;
while(i<a.length) {
    if (a[i] < min) {
        min = a[i];
    }
    i++;
}
    System.out.println(min);
//============================================================================//
//9
            int i10[] = {1, 2, 3, 4, 5};
            int maxx = Integer.MIN_VALUE;
            for (int i = 0; i <= i10.length - 1; i++) {
                if (i10[i] > max) {
                    max = i10[i];
                }
            }
            System.out.println(max);
        int a[]={1,2,3,4,5};
int max=0;
        int i=100;
while(i<a.length) {
    if (a[i] > max) {
        max = a[i];
    }
    i++;
}
    System.out.println(max);
//===========================================================================//
//10
            String[] months = {"Jan", "Feb", "Mar", "Apr", "May",
                    "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};// size: 12,  : 11
            //          0       1      2
 String[] months2 = new String[12];
 months2[0] = "Jan";
  ...
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            int num11 = input.nextInt(); // 18
            int attepmts = 1;
            while (num11 > 12 || num11 <= 0) {
                System.out.println("Invalid Entry");
                System.out.println("Please re-enter the number");
                num11 = input.nextInt();  //12
                attepmts++;
                if (attepmts == 3 && (num11 > 12 || num11 <= 0)) {
                    System.out.println("Invalid Entry, you already have 3 attepmts");
                    System.exit(0);
                }
            }
            String result = months[num - 1];  // index number, index number starts from 0 ALWAYS
//==============================================================================//
//11
            int[] arr = {1, 2, 3};
            String r = Arrays.toString(arr);
            System.out.println(r);
            //    System.out.println(arr); // ARray bMUST be converted to string
            // before we print
            String names[] = {"Madina", "Fatih", "Osman"};
            System.out.println(Arrays.toString(names));
            double[] nums = {10, 20, 30, 40, 50};
            System.out.println(Arrays.toString(nums));
            System.out.println(nums[0]);
//=============================================================================//
//12
            int arr1[]={1,2,3};
            int arr2[]={4,5,6,7};
            int arr3[]= {8,9,10};
            int arr[] = new int[arr1.length+ arr2.length+ arr3.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length+i] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            arr[arr1.length+arr2.length+i] = arr3[i];
        }
        System.out.println(Arrays.toString(arr));
//============================================================================//
//13
            int[] arr556 = {3, 2, 1};
            int[] arr666 = {2, 1, 3};
            Arrays.sort(arr5);  //[ 1,  2,  3]
            Arrays.sort(arr6); // [ 1, 2, 3]
            boolean result3 = Arrays.equals(arr5, arr6);  // true
            System.out.println(result3);
//============================================================================//
//14
            char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E', 'D'};
            Arrays.sort(ch);
            System.out.println(Arrays.toString(ch));
//==============================================================================//
//15
            String str1 = "Cybertek School";
            String str2 = "School Cybertek";
            char[] ch1 = str1.toCharArray(); //[C, y, b, e, r, t, e, k,
            // , S, c, h, o, o, l]
            char[] ch2 = str2.toCharArray(); //[S, c, h, o, o, l,  ,
            // C, y, b, e, r, t, e, k]
            Arrays.sort(ch1); // [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]
            Arrays.sort(ch2); // [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]
            boolean euqalStr = Arrays.equals(ch1, ch2);
            System.out.println(euqalStr); // str1 & str2 are biuld out of same
            // characters
//==============================================================================//
//16
            String[] names1 = {"Deniz", "Osman", "Rustem", "Anna", "Ali", "Adil"};
            Arrays.sort(names1);
            System.out.println(Arrays.toString(names1));
//=============================================================================//
//17
            int[] arr11 = {3, 1, 4, -1, 100, -100, 200, 155};
            int[] arrDesc = new int[arr.length];  //[0, 0, 0, 0, 0, 0, 0, 0]
            // index:0, 1, 2, 3, 4, 5, 6, 7
            Arrays.sort(arr11); // [-100, -1, 1, 3, 4, 100, 155, 200]
            // index:   0    1  2  3  4  5     6    7
            int k = 0;
            for (int i = arr11.length - 1; i >= 0; i--) {
                arrDesc[k] = arr[i];
                k++;
            }
            System.out.println(Arrays.toString(arr11));
            System.out.println(Arrays.toString(arrDesc));
 int[] arr11 = {3,1,4,-1,100, -100, 200, 155};
        Arrays.sort(arr11);
        int v[]=new int[arr11.length];
        System.out.println(Arrays.toString(arr11));
        int g=arr11.length-1;
        String s="";
        for(int i=0;i<arr11.length;i++){
            v[i]=arr11[g];
            s+=v[i]+" ";
            g--;
        }
        System.out.println(Arrays.toString(v));
        System.out.println(s);
//=======================================================================//
// 18
            String[] words = {input.nextLine(), input.nextLine(),
                    input.nextLine(), input.nextLine(), input.nextLine()};
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i].substring(0, 1) +
                        words[i].substring(words[i].length() - 1));
            }
        for(int i=0;i<arr.length;i++){
    String s=""+arr[i].charAt(0)+arr[i].charAt(arr[i].length()-1);
    System.out.println(s);
}
//====================================================================//
//19
            System.out.println("Enter names");
            String[] arr111 = new String[5];
            for (int i = 0; i < 5; i++) {
                arr111[i] = scan.nextLine();
            }
            for (int i = 0; i < arr111.length; i++) {
                System.out.println(arr111[i].substring(0, 3));
            }
//========================================================================//
//20
            int nums55[] = {1, 2, 3, 5, 5};
            boolean B=false;
            for (int i = 0; i < nums55.length - 1; i++) {
                if (nums55[i] == nums55[i + 1] && nums55[i] == 5) {
                    B=true;
                    //   System.out.println("true");
                    //   System.exit(0);
                }
            }
            //   System.out.println("false");
            System.out.println(B);
//=====================================================================//
//21
            String[] words33 = {input.nextLine(), input.nextLine(),
                    input.nextLine(), input.nextLine(), input.nextLine()};
            String ss[] = new String[words33.length];
            for (int i = 0; i < words33.length; i++) {
                ss[i] = words33[i].substring(0, 1) + words33[i
//=====================================================================//
//23
         int[] arr = {1, 1, 2, 3, 0, 3, 4, 99, 4, 2};
          for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(nums[i]);
            }
        }
//=====================================================================//
//24
             System.out.println("How many word you want to enter?");
        String arr[] = new String[scan.nextInt()];
        for (int i = 0, j=1; i < arr.length; j++, i++) {
            System.out.println("enter the word - " + j);
            arr[i] = scan.next();
        }
        String shortest = arr[0];
        String longestest = arr[0];
        for(String each : arr){
            if(each.length()<shortest.length()){
                shortest=each;
            }
            if(each.length()>longestest.length()){
                longestest=each;
            }
        }
        System.out.println("longestest = " + longestest);
        System.out.println("shortest = " + shortest);
        //=====================================================================//
//26
        int arr[] = {77, 76, 49, 68, 38, 64, 22, 33, 13, 32};
        int average = 0;
        int sum = 0;
        for(int each : arr){
            sum+=each;
        }
        average = (sum/ arr.length);
        System.out.println(average);
    //=====================================================================//
//27
         double d1 = 569.99;
        double d2 = 426.1;
        double result = d1/d2;
        System.out.println(result);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(result));
        //=====================================================================//
//28
        char[] arr1 = {'d', 'c', 'a', 'b'};
        char[] arr2 = new char[arr1.length-1];
        Arrays.sort(arr1);
        for(int i=0, j=0; i<arr1.length; i++){
            if(arr1[i]=='b'){
                continue;
            }else{
                arr2[j] = arr1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
      //=====================================================================//
//29
          String str ="Today is great day";
        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
     //=====================================================================//
//34
         String sentnce = "I like Java";
        String [] arr = sentnce.split(" ");
        for(String each : arr){
            System.out.println(each);
        }
        System.out.println("*****REVERSED*****");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
       //=====================================================================//
//35
          for(String each : emails){
            if(each.endsWith("@gmail.com")){
                continue;
            }else{
                System.out.println(each);
            }
        }
*/




    }
}