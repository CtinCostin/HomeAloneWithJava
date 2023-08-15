package main.java.com.georgescuconstantin.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetAndHashSet {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Ion");
        names.add("Vasile");
        names.add("Carmen");
        names.add("Costin");
        names.add("Ion");

        names.remove(0);

        System.out.println(names.size());






    }
}
