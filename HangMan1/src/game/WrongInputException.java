/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author user
 */
public class WrongInputException extends RuntimeException {

    /**
     * Creates a new instance of <code>WrongInputException</code> without detail
     * message.
     */
    public WrongInputException() {
        System.out.println("Enter only single character at a time");
    }

    /**
     * Constructs an instance of <code>WrongInputException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public WrongInputException(String msg) {
        super(msg);
    }
}
