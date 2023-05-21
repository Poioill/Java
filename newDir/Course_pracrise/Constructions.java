package Course_pracrise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Constructions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // assigning
        int day = random.nextInt(1, 7);
        byte[] array = forLoop();

        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();

        //Here the results showing
        System.out.print(nameOutput(name));
        System.out.print(ageDefinition(age));
        System.out.println(" Today is a " + whatDay(day));
        System.out.println(Arrays.toString(array));

        //2d array
        int[][] array2 = nestedArr();
        for (int i = 0; i < array2.length; i++) {
            System.out.println();
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
        }

        // Tricks with a String type
        String nameNew = "Emir";
        tricksString(nameNew);
    }

    public static String ageDefinition(byte age) {
        if (age >= 60) {
            return " You are an elderly";
        } else if (age >= 18) {
            return " You are an adult!";
        } else if (age >= 12) {
            return " You are a teenager";
        } else {
            return " You are too young";
        }
    }

    public static String whatDay(int day) {
        switch (day) {
            case 1:
                return "Monday!";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday!";
            case 4:
                return "Thursday";
            case 5:
                return "Friday!";
            case 6:
                return "Saturday!";
            case 7:
                return "Sunday!";
            default:
                return "That is not a day! ((";
        }
    }

    public static String nameOutput(String name) {
        do {
            return "Your name is " + name + ".";
        } while (name.isBlank());
    }

    public static byte[] forLoop() {
        byte[] arraySec = new byte[5];
        for (byte i = 0; i < arraySec.length; i++) {
            arraySec[i] = (byte) Math.pow(i + 1, 3);
        }
        return arraySec;
    }

    public static int[][] nestedArr() {
        int[][] nest = new int[5][5];
        int count = 0;
        for (int i = 0; i < nest.length; i++) {
            System.out.println();
            for (int j = 0; j < nest.length; j++) {
                count++;
                nest[i][j] = count;
            }
        }
        return nest;
    }

    public static void tricksString(String name) {
        String resultUpper = name.toUpperCase();
        System.out.println();
        System.out.println("Make an upperCase : " + resultUpper);
        int resultLength = name.length();
        System.out.println("The length: " + resultLength);
        boolean resultBool = name.equals("Timur"); // also has "equalsIgnoreCase"
        System.out.println("Is it equals to 'Timur' : " + resultBool);
        boolean resultEmpty = name.isEmpty();
        System.out.println("Is it empty? : " + resultEmpty);
        char resultChar = name.charAt(2); // shows the letter which is in the index typed in brackets
        System.out.println("What letter is in the index 2: " + resultChar);
        int resultIndex = name.indexOf("m"); // shows the letters index
        System.out.println("The index of the letter 'm' :" + resultIndex);
        String resultReplace = name.replace("E", "A");
        System.out.println("Replaced letter: " + resultReplace);
        System.out.println(name.trim()); //trim removes all gaps
    }
}
