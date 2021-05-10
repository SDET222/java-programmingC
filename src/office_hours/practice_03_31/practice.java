package office_hours.practice_03_31;

public class practice {
    public static void main(String[] args) {


        String str ="lkdsjAAAlksjld3";
        int upperCase=0, lowerCase=0, number=0;

        for (int i=0; i < str.length(); i++) {

            char eachLetter = str.charAt(i);

            if (eachLetter>='A' && eachLetter<='Z') {
                upperCase++;
            } else if (eachLetter>='a' && eachLetter<='z') {
                lowerCase++;
            } else if (eachLetter>='0' && eachLetter<='9') {
                number++;
            }


        }
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Numbers: " + number);









    }
}
