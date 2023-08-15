package main.java.com.georgescuconstantin.mainconceptsOOP;

public class GenericPackage {

    private final String uniqueID;
    private double weight;
    private String packageName;
    private static String courierName;

    public GenericPackage(String uniqueID, String packageName) {
        this.uniqueID = uniqueID;
        this.packageName = packageName;
    }

    public GenericPackage(String uniqueID, double weight, String packageName) {
        this.uniqueID = uniqueID;
        this.weight = weight;
        this.packageName = packageName;
    }

    public static String getCourierName() {
        return courierName;
    }

    public static void setCourierName(String courierName) {
        GenericPackage.courierName = courierName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void addItem(double itemWeight) {
        this.weight += itemWeight;
    }

    public boolean checkID() {
        if (this.idCondition1() && this.idCondition2() && this.idCondition3()
                && this.idCondition4() && this.idCondition5()) {
            return true;
        }
        return false;
    }

    private boolean idCondition1() {
        for (int i = 0; i < this.uniqueID.length(); i++) {
            if (Character.isDigit(uniqueID.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    private boolean idCondition2() {
        int count = 0;
        for (int i = 0; i < this.uniqueID.length(); i++) {
            int currentDigit = Character.getNumericValue(uniqueID.charAt(i));
            if (currentDigit % 2 == 1) {
                count++;
            }
        }
        if (count % 3 == 0) {
            return true;
        }
        return false;
    }

    private boolean idCondition3() {
        int sum = 0;
        for (int i = 0; i < this.uniqueID.length(); i++) {
            int currentDigit = Character.getNumericValue(uniqueID.charAt(i));
            sum += currentDigit;
        }
        if (sum % 4 == 0) {
            return true;
        }
        return false;
    }

    private boolean idCondition4() {
        for (int i = 0; i < this.uniqueID.length() - 1; i++) {
            int currentDigit = Character.getNumericValue(uniqueID.charAt(i));
            int nextDigit = Character.getNumericValue(uniqueID.charAt(i + 1));
            int diff = currentDigit - nextDigit;
            if (diff >= 5 || diff <= -5) {
                return false;
            }
        }
        return true;
    }

    private boolean idCondition5() {
        if (uniqueID.length() >= 10 && uniqueID.length() <= 12) {
            return true;
        }
        return false;
    }

    public String computeDetails() {
        String toString = "Pachetul " + this.packageName + " avand codul " + this.uniqueID
                + " si greutatea : " + this.weight + " apartine curierului " + this.courierName + ".";
        return toString;
    }
}
