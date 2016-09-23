package ru.ksu.motygullin.calculator20;

import java.math.*;

class StackParser {

    private char operation;

    String Parse(String stack) throws IndexOutOfBoundsException {
        double prev = 0;
        double next = 0;
        double mantissa;
        String cur ="";
if (!stack.contains(".")) {

    for (int i = 0; Character.isDigit(stack.charAt(i)); ) {
        if (prev != 0.0) {
            if (Double.toString(prev).endsWith(".0"))
                cur = Double.toString(prev).replace(".0", "") + stack.charAt(i);
        } else {
            cur = "" + stack.charAt(i);
        }
        prev = Double.parseDouble(cur);

        stack = stack.substring(i + 1);
    }

    operation = stack.charAt(0);
    stack = stack.substring(1);

    for (int i = 0; !stack.isEmpty(); ) {
        if (next != 0.0) {
            if (Double.toString(next).endsWith(".0"))
                cur = Double.toString(next).replace(".0", "") + stack.charAt(i);
        } else cur = "" + stack.charAt(i);

        next = Double.parseDouble(cur);
        stack = stack.substring(i + 1);
    }
} else {
    //TOdo floating numbers operation
}
            switch (operation) {
            case ('+'):
                prev = prev+next;
                break;
            case ('-'):
                prev = prev - next;
                break;
            case ('*'):
                prev = prev*next;
                break;
            case ('/'):
                prev = prev/next;
                break;

        }
        if (Double.toString(prev).endsWith(".0"))
    return String.format("%.0f",prev); else return Double.toString(prev);
    }

}
