


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Collections;

/** 
 * Module 04: Assignment 01 - Project 04 - Linked List and Collections Framework
 * 
 * <p> This program demostrates the Java Collection Framework, specifically 'LinkedList', to store
 * a series of integers. Integers are entered into the console input 1 at a time, as
 * the program sorts the integers from smallest to largest as the program runs, rather than perform the 
 * full sort at the end.
 * 
 * @author Nicholas Conant-Hiley
 * @version 1.0
 * @since 06-10-2025
 */

 
public class SortedList {
    /**
     * * ----------------------------main----------------------------
     * The main method is the entry point for the program. It initializes a LinkedList to store
     * integers entered by the user. Numbers are added to the list while maintaining its sorted order.
     * The input loop continues until the users enters 'q'. Finally it prints out the complete sorted
     * list after the input is terminated.
     * @param args Command line arguments (not utilized)
     */
        public static void main(String [] args) {
        // Initialize LinkedList to store integers.
        LinkedList<Integer> linkList = new LinkedList<>();
        //Scanner for receiving input
        Scanner scanner = new Scanner(System.in);
        //Print statment instructions
        System.out.println("Enter an interger and press enter (press 'q')");

        //Loop to continously read input.
        //has.next() checks for available token.
        while (scanner.hasNext()) {
            //if next token has an integer, store in linked list.
            if (scanner.hasNextInt()) {
                // Calls nexr input
                int number = scanner.nextInt();
                //Calls helper method insertSorted.
                insertSorted(linkList, number);
            }
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
    System.out.println("Final sorted Numbers: " + linkList);
        

    }

    /**
     * ----------------------------inserSorted----------------------------
     * Inserts a given interger into a LinkedList while maitaining the list's
     * ascending sorted order. This method uses a ListIterator for efficient 
     * traversal and insertion, which is suitable for LinkedLists. This method is
     * 
     * @param list the LinkedList into which the numbers will be sorted
     * @param number number the integer value to be inserted into a sorted order.
     */
    private static void insertSorted(LinkedList<Integer> list, int number) {
        //Uses ListIterator to traverse and modify list
        ListIterator<Integer> it = list.listIterator();

        //while loop iterated through the list until a number greater or equal
        // to the new number or until the list if ended.
        while (it.hasNext()) {
            // Gets the element without advancing the iterator
            if (it.next() >= number) {
                // if the integer is greater or equal it advaces the iterator back to positon one

                
                it.previous();
                break;
            }
        }
        // Insert the number at the current positon of the iterator.
        // if the loop is finished the iterator will be at the end and will
        // append the number to the end of the list.
        it.add(number);
        //Prints out the most recently added number and prints the current list.
        System.out.println("Added " + number + "Current list: " + list);
    }
}
