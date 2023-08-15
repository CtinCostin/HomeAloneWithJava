package main.java.com.georgescuconstantin.pregatireinterviu.base_algorithms;

import main.java.com.georgescuconstantin.mainconceptsOOP.GenericPackage;

public class MainBaseAlgorithms {

    public static void main(String[] args) {

//        ControlFlowExercises.displayDigitsAndSum(21304);
//        System.out.println("------------------------------");
//        ControlFlowExercises.calculateAndPrintTheSmallestNumber();
//        System.out.println("------------------------------");
//        ControlFlowExercises.isPrime(15);
//        ControlFlowExercises.printPrimeNumbers();
//        ControlFlowExercises.printAllDivisorsForANumber();
          StringAndArrays stringAndArrays = new StringAndArrays();
//        String[] array = {"java", "Cox", "Rares", "rares", "Java", "Costica"};
//        String key = "costica";
//        stringAndArrays.countOccurrencesIgnoreCase(array, key);

//        System.out.println("test 1 : "
//                + stringAndArrays.isPalindromIgnoreCase("rotatOR"));
//        System.out.println("test 2 : "
//                + stringAndArrays.isPalindromIgnoreCase("Madama"));

//        System.out.println("Test 1 : "
//                + stringAndArrays.isPalindromIgnoreCasePRO("Red rum, sir, is murder!"));
//
//        System.out.println("Test 2 : "
//                + stringAndArrays.isPalindromIgnoreCasePRO("Not a palindrom, I'm afraid.."));
//
//        System.out.println("Test 3 : "
//                + stringAndArrays.isPalindromIgnoreCasePRO("Was it a cat I saw?"));
//
//        System.out.println("Test 3 : "
//                + stringAndArrays.isPalindromIgnoreCasePRO("Step on no pets."));

        GenericPackage.setCourierName("DevCourier");
        GenericPackage gp = new GenericPackage("25374525762", 0.413, "Diplome");
        gp.addItem(20.5d);
        System.out.println(gp.checkID());
        System.out.println(gp.computeDetails());


    }
}
