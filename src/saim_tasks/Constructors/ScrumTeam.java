package saim_tasks.Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String po;
    private String ba;
    private String sm;

    ArrayList<Tester> testersList;
    private ArrayList<Tester> developersList;
    private boolean hasSprint;
    private boolean hasMeeting;
    int sprintNum;

    public ScrumTeam(String po, String ba, String sm) {

        this.developersList = new ArrayList<>();
        this.testersList = new ArrayList<>();
        this.po = po;
        this.ba = ba;
        this.sm = sm;

    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public String getBa() {
        return ba;
    }

    public void setBa(String ba) {
        this.ba = ba;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public ArrayList<Tester> getTestersList() {
        return testersList;
    }

    public void setTestersList(ArrayList<Tester> testersList) {
        this.testersList = testersList;
    }

    public ArrayList<Tester> getDevelopersList() {
        return developersList;
    }

    public void setDevelopersList(ArrayList<Tester> developersList) {
        this.developersList = developersList;
    }

    public boolean isHasSprint() {
        return hasSprint;
    }

    public void setHasSprint(boolean hasSprint) {
        this.hasSprint = hasSprint;
    }

    public boolean isHasMeeting() {
        return hasMeeting;
    }

    public void setHasMeeting(boolean hasMeeting) {
        this.hasMeeting = hasMeeting;
    }

    public void addTester(Tester tester) {
        this.testersList.add(tester);

    }
         public void addTester(Tester... testers) {  // varargs Tester[] testers

            this.testersList.addAll(Arrays.asList(testers));
         }

}
