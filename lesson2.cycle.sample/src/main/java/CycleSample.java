public class CycleSample {
    public static void main(String[] args) {
        boolean isTrue = true; //For while cycle
        int whileNumber = 0; //For while cycle
        int doNumber = 0; //For Do while cycle
        for (int i = 0; i < 5; i++) {
            System.out.println("Текущее значение: " + i);
        }

        while (isTrue) {
            whileNumber++;
            if (whileNumber == 3) {
                isTrue = false;
            }
            System.out.println("While cycle number: " + whileNumber);
        }

        do {
            doNumber++;
            System.out.println("Do While cycle number: " + doNumber);
        } while (doNumber < 6);

    }


}
