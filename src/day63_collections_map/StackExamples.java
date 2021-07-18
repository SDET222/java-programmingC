package day63_collections_map;

import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.push("cucumber"); // add
        bookStack.push("Java textBook");
        bookStack.add("Chose");
        //System.out.println("bookStack.pop() = " + bookStack.pop()); // removes and returns the last
        System.out.println("bookStack.peek() = " + bookStack.peek()); // shows the last element
       // bookStack.remove(0);

        System.out.println(bookStack);
    }
}
