package seventh_week;

import java.util.Deque;
import java.util.LinkedList;

public class RPN_decoder {

    public static double parse(String [] rpnString) {
        Deque<Double> rpn_deq = new LinkedList<>();
        for(String trivial: rpnString) {
            try {
                rpn_deq.push(Double.parseDouble(trivial));
            } catch(NumberFormatException e) {
                double last_val = rpn_deq.pop();
                switch (trivial) {
                    case "+" -> rpn_deq.add(rpn_deq.pop() + last_val);
                    case "-" -> rpn_deq.add(rpn_deq.pop() - last_val);
                    case "*" -> rpn_deq.add(rpn_deq.pop() * last_val);
                    case "/" -> {
                        if (last_val == 0) {
                            throw new ArithmeticException();
                        }
                        rpn_deq.add(rpn_deq.pop() / last_val);
                    }
                    default -> throw new RPNParserException("Incorrect symbol found", trivial);
                }
            }
        }
        if(rpn_deq.size() == 1) {
            return rpn_deq.remove();
        } else {
            throw new RPNParserException("Incorrect quantity of nums and symbols");
        }
    }

    public static void main(String[] args) {
        if(args != null) {
            System.out.println(parse(args));
        }
    }
}