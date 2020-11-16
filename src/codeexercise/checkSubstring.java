package codeexercise;

import java.util.Scanner;

public class checkSubstring{
        public static void main(String args[]){

            System.out.println("Enter String1");
            Scanner sc= new Scanner(System.in);
            String str1 = sc.nextLine();
            System.out.println("Enter String2");
            String str2 = sc.nextLine();

            if(str1.contains(str2)) {
                System.out.println("String2 is a substring of String1");
            }
            else if (str2.contains(str1)) {
                System.out.println("String1 is a substring of String2");
            }
            else {
                System.out.println("Strings are not a substring");
            }

        }


}

