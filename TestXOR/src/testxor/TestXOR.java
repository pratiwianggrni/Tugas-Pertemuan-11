/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testxor;

/**
 *
 * @author Pratiwi Anggraeni Abidin
 */
public class TestXOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean val1 = true;
 boolean val2 = true;
 System.out.println(val1 ^ val2);
 val1 = false;
 val2 = true;
 System.out.println(val1 ^ val2);

 val1 = false;
 val2 = false;
 System.out.println(val1 ^ val2);
 val1 = true;
 val2 = false;
 System.out.println(val1 ^ val2);
    }
}
