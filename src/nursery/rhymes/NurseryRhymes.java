/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nursery.rhymes;

/**
 *Daniel Cruz
 * P-2
 * Mr.Larrubia
 * Nursery Rhymes
 * @author 19075
 */
public class NurseryRhymes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        farm("cow", "moo");
        
        
        
        
    }
    public static void farm(String animal, String sound){
        
        System.out.println("Old Macdonald had a farm \n"
                 + "e-i-e-i-o \n"
                 + "And on that farm he had a" + animal +" \n"
                 + "e-i-e-i-o \n"
                 + "With a " + sound + sound + "here \n"
                 + "And a " + sound + sound +"there \n" + sound
                 + "Everywhere a " + sound + sound + "\n"
                 + "e-i-e-i-o");
       
        
        
        
}
}