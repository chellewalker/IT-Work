public class DoingSomething implements Runnable {

    private String name;
    private int endurance;

    public DoingSomething(String name, int endurance) {

        this.name = name;
        this.endurance = endurance;
    }

    public void run() {
        System.out.println("\n\nExecuting with these parameters: Name =" + name + " Enduance = " + endurance + "\n\n");
        for (int count = 1; count < endurance; count++) {
            if (count % 200 == 0) {
                System.out.println(name + " stikes a mighty blow against their opponent!");
                try {
                    Thread.sleep(endurance);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
                
            }
            else if (count % 100 == 0) {
                    System.out.println(name + " seemingly begins to flag, but then they strike with ferver!");
            }
        }
        System.out.println("It was a hard-fought battle, but " + name + " reconciles with their opponent!");
    }
}