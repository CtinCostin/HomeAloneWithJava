package main.java.com.georgescuconstantin.collections.list;


import java.util.*;

public class DemoList {


    public static void main(String[] args) {

        createListOfStudents();
        iterateListWithIterator();
        iterateWithFor();
        iterateWithForeach();


    }

    public static void createListOfStudents() {

        Student ion = new Student("Ion", 40);
        Student vasile = new Student("Vasile", 35);
        Student george = new Student("George", 32);

        List<Student> studentList = new ArrayList<>();
        studentList.add(ion);
        studentList.add(vasile);
        studentList.add(george);

        System.out.println(studentList);
    }

    public static void iterateListWithIterator() {

        //Create a list
        List<String> capitals = new ArrayList<>();
        capitals.add("Bucharest");
        capitals.add("Madrid");
        capitals.add("Athens");
        capitals.add("Berlin");

        //Read
        //iterate with list iterator
        Iterator<String> iterator = capitals.iterator();

        //print with iterator
        while (iterator.hasNext()) {
            String nextCapital = iterator.next();
            System.out.println(nextCapital + " " + nextCapital.toUpperCase());
        }

        //print the second item in the list
        String madrid = capitals.get(1);
        System.out.println(madrid);

        //print the index of
        System.out.println("index of Athens:" + capitals.indexOf("Athens"));

        //Update
        //Change the capital at index
        capitals.add(0,"");

        System.out.println("before remove: ");
        System.out.println(capitals);

        //Delete
        //Remove 1 item and print the list
        capitals.remove("Bucharest");
        System.out.println("\nafter remove: ");
        System.out.println(capitals);

        //print the list size
        System.out.println("Number of capitals: " + capitals.size());

        if(capitals.contains("Berlin")){
            System.out.println("\ngood beer");
        }

        if(!capitals.isEmpty()){
            System.out.println();
        }

    }

    public static void iterateWithFor() {

        List<String> modelsBmw = new ArrayList<>();
        modelsBmw.add("e39");
        modelsBmw.add("e36");
        modelsBmw.add("e30");
        for (int i = 0; i < modelsBmw.size(); i++) {
            System.out.println(modelsBmw.get(i));
        }
        System.out.println("\n----------------------------");
    }

    public static void iterateWithForeach(){

        List<String> itemList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String item = " ";
        while (true){
            System.out.println("Element:");
            item = scanner.nextLine();

            if(item.equals("stop")){
                break;
            }
            if(itemList.contains(item)){
                System.out.println("The element is already present");
                System.out.println("Do you want to remove it? (y/n)");

                String response = scanner.next();

                if(response.equals("y")){
                    itemList.remove(item);
                    break;
                }
            } else {
                itemList.add(item);
            }
        }

        for(String element : itemList){
            System.out.println(element);
        }
    }
}
