package saim_tasks.Constructors;

public class ScrumTeamTest {

    public static void main(String[] args) {


        ScrumTeam s = new ScrumTeam("John","Nadir","Murodil");

        //s.addTester();

        System.out.println("s.getTestersList() = " + s.getTestersList());

    }
}
