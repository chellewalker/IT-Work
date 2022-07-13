import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class DoingShopping {

    public static void main(String[] args) {

        ExecutorService myService = Executors.newFixedThreadPool(3);
        String check = "temp";
        int count = 1;
        List list = new ArrayList();

try (
    Scanner scan = new Scanner(System.in)) {

        System.out.println("Enter item to shopping list:");

    while (check != "") {
            count++;
            check = scan.nextLine();
            list.add(check);
            if (check != "") {
        System.out.println(check + " added to shopping list. Enter new item or press enter to end inputs:");
        }}

        if (list.size() == 1) {
            System.out.println("List cancelled.");
        }
        else {
    Random random = new Random();



        Shopping ds = new Shopping(list, random.nextInt(100));

            myService.execute(ds);
    }}

    myService.shutdown();
    }
}