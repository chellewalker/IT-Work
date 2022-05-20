import java.util.*;

public class CollectionTypes {

    public static void main(String[] args) {

        System.out.println("-- List --");
        List list = new ArrayList();
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("List");

        for (Object str : list) {
            System.out.println((String)str);
        }

        System.out.println("-- Set --");
        NavigableSet set = new TreeSet();
        set.add("This");
        set.add("is");
        set.add("a");
        set.add("Set");

        NavigableSet second = new TreeSet();

        second.add(set.pollFirst());
        second.add(set.pollFirst());

            System.out.println(second.pollLast());
            System.out.println(set.pollLast());
            System.out.println(set.pollFirst());
            System.out.println(second.pollFirst());

        System.out.println("-- Queue --");
        Queue<String> queue = new LinkedList<> ();
        queue.add("This");
        queue.offer("is");
        queue.offer("a");
        queue.offer("Queue");

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            synchronized (System.out) {
                System.out.println(queue.poll());
        }}

        System.out.println("-- Map --");
        Map map = new HashMap();
        map.put(1,"This");
        map.put(2,"is");
        map.put(3,"a");
        map.put(4,"Map");

        for (int i = 1; i < 5; i++) {
            String result = (String)map.get(i);
            System.out.println(result);
        }

        System.out.println("-- List using Generics --");
        List<DVDs> myList = new LinkedList<DVDs>();
        myList.add(new DVDs("Star Wars: Episode VII - The Force Awakens", "J.J. Abrams"));
        myList.add(new DVDs("Star Wars: Episode VIII - The Last Jedi", "Rian Johnson"));
        myList.add(new DVDs("Star Wars: Episode IX - The Rise of Skywalker", "J.J. Abrams"));
        myList.add(new DVDs("Rogue One: A Star Wars Story", "Gareth Edwards"));

        for (DVDs dvd : myList) {
            System.out.println(dvd);
        }

    }
}