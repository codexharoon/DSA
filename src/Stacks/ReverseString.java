package Stacks;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args){
        String input = "these are words";
        Stack<Character> stack = new Stack<Character>();
        StringBuilder output = new StringBuilder();

        for(char c : input.toCharArray()){
            stack.push(c);
        }

        while(!stack.isEmpty()){
            output.append(stack.pop());
        }

        System.out.println(output);
    }
}
