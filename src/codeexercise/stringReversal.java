package codeexercise;

import java.util.Scanner;

public class stringReversal {
    public static String reverseString(String string){
        if(string.isEmpty()){
            return string;
        }
        return reverseString(string.substring(1)) + string.charAt(0);
    }
    public static void main(String args[]){
        System.out.print("Enter a String :");
        Scanner sc= new Scanner(System.in);
        String string = sc.nextLine();
        if(null == string || string.isEmpty()){
            System.out.println("Please enter valid string");
        }
        else {
            System.out.println("Your string :" + string);
            System.out.println("Reversed string :" +reverseString(string));
        }
    }
}
