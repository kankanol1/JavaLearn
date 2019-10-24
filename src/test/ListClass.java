package test;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class ListClass {
    public static void main(String[] args){
        String[] str = {"a","b","c"};
        List<String> listStr = new ArrayList<>(Arrays.asList(str));
        listStr.add("d");
        System.out.println(listStr);
        System.out.println(listStr.size());
        System.out.println(listStr.toString());

    }
}
