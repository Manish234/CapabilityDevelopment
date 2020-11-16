package codeexercise;

import java.util.Scanner;

public class wordReverse {
    public static String reverseWords(String str){

        String reversedString = "";
        String[] strArr =str.split(" ");

        for(int i=0;i<strArr.length ; i++){
            String reversedWord = "";
            String word = strArr[i];
            for(int j=word.length()-1 ; j >=0 ; j--)
            {
                reversedWord = reversedWord + word.charAt(j);
            }
            reversedString = reversedString + reversedWord + " ";
        }

        return reversedString;
    }
    public static void main(String ...args){
        System.out.print("Enter a String :");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        if(null == str || str.isEmpty()){
            System.out.println("Please enter a valid String");
        }
        else {
            System.out.println("You have entered :" + str);
            System.out.println("After reversing the words :" + reverseWords(str));
        }
    }
}
