/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmsc141_rule30;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author StephenRey
 */
public class Cmsc141_rule30 {

    public static void main(String[] args) {
        ArrayList<Character> line = new ArrayList<>();
        ArrayList<Character> base_line = new ArrayList<>();

        int iterations = 30, size = 30; // default no. of iterations and the size

        //* this portion is where user is asked to input a value for number of iterations and size //
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of iterations:");
        iterations = scan.nextInt();
        System.out.println("Enter size of a line:");
        size = scan.nextInt();
        //------------------------------------------------------------------------------------------//
        System.out.println("--------------RULE 30------------");

        // initialization of the two arraylists (base_line and the line)//
        for (int i = 0; i <= size; i++) {
            base_line.add('0');
            line.add('0');
        }

        base_line.set((size / 2), '1'); // setting the first line
        for (int c = 0; c < size; c++) {   // printing the first line (1st iteration)
            System.out.print(base_line.get(c));
        }
        System.out.println("");

        // conditions for the succeeding iterations 
        for (int i = 1; i < iterations - 1; i++) {
            for (int j = 1; j < size; j++) {

                if (base_line.get(j - 1).equals('0') == true && base_line.get(j).equals('0') == true && base_line.get(j + 1).equals('1') == true
                        || base_line.get(j - 1).equals('0') == true && base_line.get(j).equals('1') == true && base_line.get(j + 1).equals('0') == true
                        || base_line.get(j - 1).equals('0') == true && base_line.get(j).equals('1') == true && base_line.get(j + 1).equals('1') == true
                        || base_line.get(j - 1).equals('1') == true && base_line.get(j).equals('0') == true && base_line.get(j + 1).equals('0') == true) {
                    line.set(j, '1'); // set value of line at index j to 1
                } else {
                    line.set(j, '0'); // set value of line at index j to 0

                }
            }

            for (int cc = 0; cc < size; cc++) { // printing the line generated 
                System.out.print(line.get(cc));
                base_line.set(cc, line.get(cc)); // setting the line generated to be the next base_line
            }
            System.out.println("");

        }
        System.out.println("---------------------------------");
    }

}
