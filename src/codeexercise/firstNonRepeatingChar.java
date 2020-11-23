package codeexercise;

import java.util.Scanner;

public class firstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str1 = s.nextLine();
        System.out.println("The given string is: " + str1);
        for (int i = 0; i < str1.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first non repeated character in string is: " + str1.charAt(i));
                break;
            }
        }
    }
}

