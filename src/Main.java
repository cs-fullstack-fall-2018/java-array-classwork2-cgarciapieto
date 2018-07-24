

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> squadList = new ArrayList<String>();
        squadList.add("bob");
        squadList.add("John");
        squadList.add("Kevin");
        squadList.add("Kevin");

        System.out.println(squadList);
        squadList.remove(2);
        System.out.println(squadList.size());

        if(squadList.contains("Kevin")) {
            System.out.println(squadList.get(2));
        }

    }
}
