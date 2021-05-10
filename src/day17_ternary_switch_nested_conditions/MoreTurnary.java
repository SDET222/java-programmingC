package day17_ternary_switch_nested_conditions;

public class MoreTurnary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = hourlyRate > 45 ? "accept" : "reject";
        System.out.println(reply);

        String todaysClass = "Java";
        String teacher = todaysClass.equals("Java") ? "Saim/Murodil" : "Nadir";
        System.out.println(teacher);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "have DL, can drive" : "No DL, can not drive";
        System.out.println("driving = " + driving);


    }
}
