import java.util.*;

public class App {
    public static void main(String[] args) {
        String[] nums = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"} ;
        System.out.println(evalRPN (nums));
        

    }

    public static int evalRPN(String[] tokens) {
        Stack <String> stack = new Stack <String> ();
        int x, y ;
        String choice;
        int value = 0;
        String resultado = "" ;

        for (int i = 0 ; i<tokens.length ; i++){
            if (tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*" && tokens[i] != "/"){
                stack.push(tokens[i]);
                continue;
            }
            else {
                choice = tokens[i];
            }
            
            switch (choice){
                case "+":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x + y ;
                    resultado = Integer.toString(value);
                    stack.push (resultado);
                    break;
                case "-":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y - x ;
                    resultado = Integer.toString(value);
                    stack.push (resultado);
                    break;
                case "*":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x * y ;
                    resultado = Integer.toString(value);
                    stack.push (resultado);
                    break;
                case "/":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y / x ;
                    resultado = Integer.toString(value);
                    stack.push (resultado);
                    break;
                    
                default:
                    continue;
            }
        }
        return Integer.parseInt(stack.pop());
  
    }
}


