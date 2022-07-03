public class Shopping implements Runnable {

    private String item;
    private int endurance;

    public Shopping(String name, int endurance) {

        this.item = item;
        this.endurance = endurance;
    }

    public void run() {
        System.out.println("\n\nExecuting with these parameters: Name =" + item + " Enduance = " + endurance + "\n\n");
        for (int count = 1; count < endurance; count++) {
            if (count % 15 == 0) {
                System.out.println("Checking for next item...");
                try {
                    Thread.sleep(endurance);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
                
            }
        }
        System.out.println(item);
    }
}