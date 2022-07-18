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

    int count2 = 1;


            for (Object str : list) {
                String item;
                item = (String)str;
                Shopping ds = new Shopping(item, random.nextInt(20));

            myService.execute(ds);
                System.out.println("Press enter to view next item");
                String empty = scan.nextLine();

    }}}

    myService.shutdown();
    }
}