package saim_tasks.array_practice;

public class ShortestLongest {
    public static void main(String[] args) {

        String[] words = {"java", "python", "c++", "api"};
        String shortest = words[0];
        String longest = words[0];
        for (String each:words){
            if (each.length()<shortest.length()){
                shortest=each;
            } if (each.length()>longest.length()) {
                longest=each;
            }

        }
        System.out.println("shortest = " + shortest);
        System.out.println("longest = " + longest);







    }
}
