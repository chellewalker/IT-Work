import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class DoingShopping {

    public static void main(String[] args) {

        ExecutorService myService = Executors.newFixedThreadPool(3);
        String victor;
        int record;
        List list = new ArrayList();

try (
    Scanner scan = new Scanner(System.in)) {

        System.out.println("Enter item to shopping list:");

        while (list.get(list.size() - 1) != null) {
            list.add(scan.nextLine());
        }
 
        Random random = new Random();


        Shopping ds1 = new Shopping(list, random.nextInt(100));

            myService.execute(ds1);

        System.out.println("List complete.");
    }

    myService.shutdown();
    }
}