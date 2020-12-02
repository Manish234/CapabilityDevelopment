package codeexercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertSetToArray {
    public static void main(String[] args) {

        Set<String> setDays = new HashSet<String>();
        setDays.add("Sunday");
        setDays.add("Monday");
        setDays.add("Tuesday");


        String[] strDays = setDays.toArray(new String[ setDays.size() ]);

        System.out.println( Arrays.toString(strDays) );

    }
}
