public class Shopping implements Runnable {

    private String item;
    private int endurance;
    private List list;

    public Shopping(List list, int endurance) {
        this.endurance = endurance;
    }

    public void run() {
        System.out.println("\n\nExecuting with these parameters: Name =" + item + " Enduance = " + endurance + "\n\n");
        for (Object str : list) {
            item = (String)str;
            int count = 1;
            count++;
            if (count % 8 == 0) {
                System.out.println(item);
                try {
                    Thread.sleep(endurance);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
                
            }
            else {
                System.out.println("Checking for next item...");
            }
        }
    }}