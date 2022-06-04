import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class ExecuteDoingSomething {

    public static void main(String[] args) {

        ExecutorService myService = Executors.newFixedThreadPool(3);
        String victor;
        int record;

try (//two people do 3 vs, puts out winner
    Scanner scan = new Scanner(System.in)) {
        System.out.println("Name of fighter #1");
        String name1 = scan.nextLine();

        System.out.println("Name of fighter #2");
        String name2 = scan.nextLine();   
        Random random = new Random();


            DoingSomething ds1 = new DoingSomething(name1, random.nextInt(1000));
            record = random.nextInt();
            victor = name1;
            DoingSomething ds2 = new DoingSomething(name2, random.nextInt(1000));
            if (record < random.nextInt()) {
                record = random.nextInt();
                victor = name2;
            }
            DoingSomething ds3 = new DoingSomething(name1, random.nextInt(1000));
            if (record < random.nextInt()) {
                record = random.nextInt();
                victor = name1;
            }
            DoingSomething ds4 = new DoingSomething(name2, random.nextInt(1000));
            if (record < random.nextInt()) {
                record = random.nextInt();
                victor = name2;
            }
            DoingSomething ds5 = new DoingSomething(name1, random.nextInt(1000));
            if (record < random.nextInt()) {
                record = random.nextInt();
                victor = name1;
            }
            DoingSomething ds6 = new DoingSomething(name2, random.nextInt(1000));
            if (record < random.nextInt()) {
                record = random.nextInt();
                victor = name2;
            }

            myService.execute(ds1);
            myService.execute(ds2);
            myService.execute(ds3);
            myService.execute(ds4);
            myService.execute(ds5);
            myService.execute(ds6);

        System.out.println("It was a hard-fought battle, but " + victor + " is the victor.");
    }

    myService.shutdown();
    }
}