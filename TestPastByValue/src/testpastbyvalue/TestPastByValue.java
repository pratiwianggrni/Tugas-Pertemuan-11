/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testpastbyvalue;

/**
 *
 * @author Pratiwi Anggraeni Abidin
 */
public class TestPastByValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int i = 10;
 System.out.println(i);
 test(i);
 System.out.println(i);
 }
 public static void test(int j){
 j = 33;
    }
}
