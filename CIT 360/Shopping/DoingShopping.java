import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class DoingShopping {

    public static void main(String[] args) {

        ExecutorService myService = Executors.newFixedThreadPool(3);
        String check = null;
        int count = 1;
        List list = new ArrayList();

try (
    Scanner scan = new Scanner(System.in)) {

        System.out.println("Enter item to shopping list:");

    list.add(scan.nextLine());

    while (check != null) {
            count++;
            list.add(scan.nextLine());
            check = list.get(count);
        }

        if (list.get(list.size() - 1) == null) {
            System.out.println("List cancelled.");
        }
        else {
    Random random = new Random();


        Shopping ds1 = new Shopping(list, random.nextInt(100));

            myService.execute(ds1);

        System.out.println("List complete.");
    }}

    myService.shutdown();
    }
}