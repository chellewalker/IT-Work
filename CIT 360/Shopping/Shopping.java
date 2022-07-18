import java.util.*;

public class Shopping implements Runnable {

    private String item;
    private int endurance;

    public Shopping(String item, int endurance) {
        this.endurance = endurance;
        this.item = item;
    }

    public void run() {

        for (int count = 1; count < endurance; count++) {
            count++;
            if (endurance % 5 == 0) {
                try {
                    Thread.sleep(endurance);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
                
            }
            else {
                System.out.println("Checking for next item...");
            }}
            if (item != "") {
            System.out.println("-----" + item + "-----");
        } else {
                System.out.println("List complete; press enter to end program.");
            }}
    }