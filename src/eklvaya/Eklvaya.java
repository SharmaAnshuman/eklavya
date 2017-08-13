/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eklvaya;

import sun.security.util.PropertyExpander;

/**
 * @author Anshuman Sharma
 */
public class Eklvaya {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(STD_D_clearing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STD_D_clearing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STD_D_clearing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STD_D_clearing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try
        {
            
            Welcome wel = new Welcome();  
            wel.setVisible(true);
            wel.setTitle("Welcome To Eklavya");
            Thread.sleep(7000);
            wel.setVisible(false);
            Home hom = new Home();
            hom.setVisible(true);
            hom.setTitle("Home");
            hom.setResizable(false);
            
        }
        catch(InterruptedException x)
        {
           // System.out.println("Error ");
        }
       
    }
    
}
