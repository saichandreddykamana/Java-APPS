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
public class MenuInputException extends RuntimeException {

    /**
     * Creates a new instance of <code>MenuInputException</code> without detail
     * message.
     */
    public MenuInputException() {
        System.out.println("please provide valid input(1-3)");
    }

    /**
     * Constructs an instance of <code>MenuInputException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MenuInputException(String msg) {
        super(msg);
    }
}
