package office_hours.may19;

import java.util.ArrayList;

public class RemoveLongString {
    public static void main(String[] args) {




    }
    public static ArrayList<String> removeLongString (ArrayList<String> list, int minLength){

        ArrayList<String> validString = new ArrayList<>();

        for(String word:list) {

            if(word.length()>=minLength){
                validString.add(word);
            }
        }

        return validString;

    }

}
