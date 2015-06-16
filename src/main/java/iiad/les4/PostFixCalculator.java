package iiad.les4;

import iiad.les2.stack.Stack;
import iiad.les2.stack.StackImpl;

import java.util.StringTokenizer;

/**
 * Created by mathijs on 16-6-2015.
 */
public class PostFixCalculator {

    private String input;
    private int result;

    public PostFixCalculator (String invoer) {
        this.input = invoer;
        evaluate();
    }

    public int getResult() {
        return result;
    }

    private void evaluate() {
        Stack<String> stack = new StackImpl<>();

        StringTokenizer st = new StringTokenizer(input);

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            char eerste = token.charAt(0); // het eerste karakter van elk token
            if ((eerste >= '0') && (eerste <= '9')) {
                stack.push(token);
            } else if(stack.size() > 1) {
                int lval = Integer.valueOf(stack.pop()), // poppen en omzetten van een String naar int
                    rval = Integer.valueOf(stack.pop()); // idem
                int result = 0;
                switch (eerste) {
                    case '+':
                        result = lval + rval;
                        break;
                    case '*':
                        result = lval * rval;
                        break;
                    case '-':
                        result = lval - rval;
                        break;
                    case '/':
                        result = lval / rval;
                        break;
                }
                stack.push(String.valueOf(result));
            }
        }
        if (!stack.isEmpty())
            result = Integer.valueOf(stack.pop()); // als alles goed is gegaan result
            // poppen en omzetten naar een int
        else
            result = 0;
    }
}
