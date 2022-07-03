import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class DoingShopping {

    public static void main(String[] args) {

        ExecutorService myService = Executors.newFixedThreadPool(3);
        String victor;
        int record;

try (//two people do 3 vs, puts out winner
    Scanner scan = new Scanner(System.in)) {

        System.out.println("Enter item to shopping list:");
        String name1 = scan.nextLine();
 
        Random random = new Random();


        Shopping ds1 = new Shopping(name1, random.nextInt(100));

            myService.execute(ds1);

        System.out.println("List complete.");
    }

    myService.shutdown();
    }
}