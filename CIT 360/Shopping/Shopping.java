public class Shopping implements Runnable {

    private String name;
    private int endurance;

    public DoingShopping(String name, int endurance) {

        this.name = name;
        this.endurance = endurance;
    }

    public void run() {
        System.out.println("\n\nExecuting with these parameters: Name =" + name + " Enduance = " + endurance + "\n\n");
        for (int count = 1; count < endurance; count++) {
            if (count % 15 == 0) {
                System.out.println(name + " stikes a mighty blow against their opponent!");
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