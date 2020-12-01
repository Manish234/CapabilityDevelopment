package codeexercise;

public class removeOuterParantheses {
    static String removeOuterParentheses(String S)
    {
        String res = "";

        int count = 0;


        for (int c = 0;
             c < S.length(); c++)
        {
            // If opening parenthesis is
            // encountered and their
            // count exceeds 0
            if (S.charAt(c) == '(' &&
                    count++ > 0)

                // Include the character
                res += S.charAt(c);

            // If closing parenthesis is
            // encountered and their
            // count is less than count
            // of opening parentheses
            if (S.charAt(c) == ')' &&
                    count-- > 1)

                // Include the character
                res += S.charAt(c);
        }
        return res;
    }

    public static void main(String[] args)
    {
        String S = "(()())(())()";
        System.out.print(removeOuterParentheses(S));
    }
}

