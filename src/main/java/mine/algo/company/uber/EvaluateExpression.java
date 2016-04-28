// At Uber Phone screen
// evalexpr(-4 - 3 * 2 + 1 / 2 + 4)
//


/*

2, 3, -4
5, -4
*/
// input: expression as an iterable of tokens
// output: result of the expression as a float
//
// Token:
//   type: one of , MUL, DIV, ADD, SUB
//   value: (type float) only defined for tokens of type NUM

// 3 * 2 / 2 +
//
//
/*
Operand Stacks[]
4, 0.5, , 6, -4 
Operator Stack[]
+, +, +

*/

// Next field in software engineering or computer science you wanna work in?
/* Software engineering
*/


/*import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class EvaluateExpression {

    public static class Token {
        private float val;
        private String type;
        Token(String, type, float value){
            this.type = type;
            this.val = value;
        }
        Token(String, type){
            this.type = type;
        }
    }

    public static float evalexpr(List<Token> input){
        Queue<Token> oper = new LinkedList<>();
        Stack<Token> operd = new Stack<>();
        int i = 0;
        while(i< input.size() - 2) {
            if(input.get(i).type == "NUM"){
                operd.push(input.get(i))
            } else {
                if(!"MUL".equals(op.type) && !"DIV".equals(op.type)){
                    opert.push(input.get(i))
                }
                else
                {
                    operd.push(input.get(i+i))
                    if("MUL".equals(op.type) || "DIV".equals(op.type)){
                        Token num = operad.pop();
                        Token num1 - operad.pop();
                        if("MUL".equals(op.type)){
                            operad.push(num.val * num1.val);
                        } else {
                            operad.push(num.val / num1.val);
                        }
                    }
                }
            }
            i++;
        }

        while(!opert.isEmpty()){
            if("ADD".equals(op.type) || "SUB".equals(op.type)){
                Token num = operad.pop();
                Token num1 - operad.pop();
                if("ADD".equals(op.type)){
                    operad.push(num.val + num1.val);
                } else {
                    operad.push(num.val - num1.val);
                }
            }

        }
    }


    public static void main(String[] args)
    {
        ArrayList<Token> expr = new ArrayList<Token>();

        expr.add(new Token("NUM", -4.0f));
        expr.add(new Token("ADD"));
        expr.add(new Token("NUM", 3.0f));
        expr.add(new Token("MUL"));
        expr.add(new Token("NUM", 2.0f));
        expr.add(new Token("DIV"));
        expr.add(new Token("NUM", 2.0f));
        expr.add(new Token("ADD"));
        expr.add(new Token("NUM", 4.0f));

        System.out.println(String.format("Result = %f", evalexpr(expr)));
    }
}
*/