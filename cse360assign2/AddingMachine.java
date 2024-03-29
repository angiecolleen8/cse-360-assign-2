/***
 * Name: Angela Foley
 * CSE 360, Assignment 2
 * This file contains class AddingMachine.
 * Github: https://github.com/angiecolleen8/cse-360-assign-2/blob/master/cse360assign2/AddingMachine.java
 */

package cse360assign2;

/***
 * Class AddingMachine has methods that perform various algebraic calculations, and tracks the calculation history.
 */
public class AddingMachine {

    private int total;
    private String transactionHistory;

    /***
     * Constructor. transactionHistory is the string that records all calculations.
     */
    public AddingMachine() {
        total = 0;  // not needed - included for clarity
        transactionHistory = "0";
    }

    /***
     * @return the current running total
     */
    public int getTotal() {
        return total;
    }

    /***
     * @param value is added to the total variable
     */
    public void add(int value) {
        total += value;
        transactionHistory = transactionHistory + " + " + value;
    }

    /***
     * @param value is subtracted from the total variable
     */
    public void subtract(int value) {
        total -= value;
        transactionHistory = transactionHistory + " - " + value;
    }

    /***
     * @return a hisotry of the calculation transactions, from the initial 0 value to the last input. Displays the
     * normal operators and values
     */
    public String toString() {
        return transactionHistory;
    }

    /***
     * Clears the current total variable and transaction history
     */
    public void clear() {
        total = 0;
        transactionHistory = "0";
    }
}


