import java.util.*;

public class Shopping implements Runnable {

    private String item;
    private int endurance;
    private List list;

    public Shopping(List list, int endurance) {
        this.endurance = endurance;
        this.list = list;
    }

    public void run() {
        for (Object str : list) {
            Scanner scan2 = new Scanner(System.in);

            item = (String)str;
            /*System.out.println("Press enter to view next item");
            empty = scan2.nextLine();*/

            int count = 1;
            count++;
            if (count % 8 == 0) {
                try {
                    Thread.sleep(endurance);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
                
            }
            else {
                System.out.println("Checking for next item...");
            }
            System.out.println("-----" + item + "-----");
        }
        System.out.println("List complete.");
    }}