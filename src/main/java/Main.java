import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> MarkYear = new HashMap<>();
        ArrayList<String> Names = new ArrayList<>();
        LinkedList<Integer> FileSize = new LinkedList<>();
        Integer integer1 = 64;
        Integer integer2 = 128;

        MarkYear.put("BMW",2021);
        MarkYear.put("Ferrari",2016);
        MarkYear.put("Mercedes",2014);
        MarkYear.remove("BMW",2021);
        MarkYear.remove("Ferrari",2016);
        MarkYear.remove("Mercedes",2014);
        System.out.println(MarkYear);

        Names.add("Denys ");
        Names.add("Masha ");
        Names.remove("Denys ");
        Names.remove("Masha ");
        System.out.println(Names);

        FileSize.add(integer1);
        FileSize.add(integer2);
        FileSize.remove(integer1);
        FileSize.remove(integer2);
        System.out.println(FileSize);
    }
}
