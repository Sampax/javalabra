/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytesti;

/**
 *
 * @author SampaX
 */
public class Arraytesti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] eka = {1,2,3,4};
        int[] toka = eka;
        int[] kolmas = new int[4];
        kolmas=eka;
        System.out.println("eka"+eka[0]);
        System.out.println("toka"+toka[0]);
        System.out.println("kolmas"+kolmas[0]);
        eka[0]=5;
         System.out.println("eka"+eka[0]);
        System.out.println("toka"+toka[0]);
        System.out.println("kolmas"+kolmas[0]);       
    }
}
