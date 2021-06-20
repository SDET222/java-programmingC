package day55_abstraction_interface.flags;
import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {

        AzerbaijanFlag azerbaijanFlag = new AzerbaijanFlag();
        azerbaijanFlag.draw();

        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        UkranianFlag ukranianFlag = new UkranianFlag();
        ukranianFlag.draw();




    }
}
