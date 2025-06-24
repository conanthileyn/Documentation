import java.util.Scanner;
import java.util.Stack;


/** 
 * Module 05: Assignment 01 - Project 05 - Planning and Executing a Maintenance Task
 * 
 * <p> This program demonstrates the Java Collection Framework, specifically 'Stack', to store
 * a series of integers. Integers are entered into the console input 1 at a time, as
 * the program sorts the integers from smallest to largest as the program runs, rather than perform the 
 * full sort at the end.
 * 
 * @author Nicholas Conant-Hiley
 * @version 2.0
 * @since 06-16-2025
 */

 
public class StackList {
    /**
     * * ----------------------------main----------------------------
     * The main method is the entry point for the program. It initializes a Stack to store
     * integers entered by the user. Numbers are added to the list while maintaining its sorted order.
     * The input loop continues until the user enters 'q'. Finally it prints out the complete sorted
     * list after the input is terminated.
     * @param args Command line arguments (not utilized)
     */
        public static void main(String [] args) {

        // Initialize Stack to store integers.
        Stack<Integer> stack = new Stack<>();
        ///////////////////////////////////////////////////////
        //Scanner for receiving input
        Scanner scanner = new Scanner(System.in);
        //Print statment instructions
        System.out.println("Enter an interger and press enter (press 'q')");

        //Loop to continously read input.
        //has.next() checks for available token.
        while (scanner.hasNext()) {
            //if next token has an integer, insert it into the sorted stack.
            if (scanner.hasNextInt()) {
                // Calls nexr input
                int number = scanner.nextInt();
                //Calls helper method insertSorted.
                // insertSorted(linkList, number);
                insertIntoStack(stack, number);

                // FIX -------------------------
            }
            /////////////////////
            // if next token is not an integer store it as a string
            else {
                String input = scanner.next();
                // Checks to see if the quit input is entered.
                if (input.equalsIgnoreCase("q")){ 
                    break;
                }
                else {
                    System.out.println("Invalid Entry");
                }
        }   
    }
    // Closes scanner to prevent resource leaks.
    scanner.close();
    // Prints the final sorted list
    System.out.println("Final sorted Numbers: " + stack);
    ////// FIX -----------
        

    }

    /**
     * ----------------------------Insert Into Stack----------------------------
     * 
     * Inserts an Integer entered by the user into a Stack, using a temporary stack
     * (temp) and sorts the integers from smallest to largest.
     * 
     * @param stack the Stack into which the numbers will be sorted
     * @param number the integer value to be inserted.
     */

    private static void insertIntoStack(Stack<Integer> stack, int number) {
        Stack<Integer> temp = new Stack<>();
            while (!stack.empty() && stack.peek() > number) {
                temp.push(stack.pop());
            }

            stack.push(number);

            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }

            System.out.println("Added " + number + " | Stack now: " + stack);
    }

}

