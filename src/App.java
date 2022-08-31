import java.util.*;

public class App {
    public static void main(String[] args) {
        String[] nums = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"} ;
        System.out.println(evalRPN (nums));
        

    }

    public static int evalRPN(String[] tokens) {
        Stack <String> stack = new Stack <String> ();
        int x, y ;
        String result = "";
        String get = "";
        String choice;
        int value = 0;
        String p = "" ;
        
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
                    get = stack.pop();
                    x = Integer.parseInt(get);
                    get = stack.pop();
                    y = Integer.parseInt(get);
                    value = x + y ;
                    result = p+value;
                    stack.push (result);
                    break;
                case "-":
                    get = stack.pop();
                    x = Integer.parseInt(get);
                    get = stack.pop();
                    y = Integer.parseInt(get);
                    value = x - y ;
                    result = p+value;
                    stack.push (result);
                    break;
                case "*":
                    get = stack.pop();
                    x = Integer.parseInt(get);
                    get = stack.pop();
                    y = Integer.parseInt(get);
                    value = x * y ;
                    result = p+value;
                    stack.push (result);
                    break;
                case "/":
                    get = stack.pop();
                    x = Integer.parseInt(get);
                    get = stack.pop();
                    y = Integer.parseInt(get);
                    value = x / y ;
                    result = p+value;
                    stack.push (result);
                    break;
                    
                default:
                    continue;
            }
        }
        get = stack.pop();
        return Integer.parseInt(get);
  
    }
}


