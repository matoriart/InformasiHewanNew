/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author user
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassY SX = new ClassY();
        ClassX SC = new ClassX();
        SC.name();
        SC.food();
        SC.type();
        SC.character();
        SC.weight();
        
        System.out.println("====================");
        System.out.println("Informasi yang anda ketik\n");
        SC.show();
        System.out.println("====================");
        switch(SC.nama) {
            case "kelinci" :
                SX.Jinak();
                break;
            case "ayam" :
                SX.Jinak();
                break;
            case "burung" :
                SX.Jinak();
                break;
            case "ular" :
                SC.Buas();
                break;
            case "harimau" :
                SC.Buas();
                break;
            case "singa" :
                SC.Buas();
                break;
            default:
                
        }
        
    }
    
}
