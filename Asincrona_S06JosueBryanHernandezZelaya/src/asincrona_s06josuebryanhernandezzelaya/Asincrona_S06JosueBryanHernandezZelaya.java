/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asincrona_s06josuebryanhernandezzelaya;
// iMPORTACION SWING y AWT
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
        
       

/**
 * Ejercicio: Cree una aplicacion java y copie el siguiente código en el método Main principal
 * Agregar una JLabel con su nombre y JButton con el título Progra 3
 */
public class Asincrona_S06JosueBryanHernandezZelaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contenedores
        JFrame frame = new JFrame("Mi primer JFrame");
        JLabel label = new JLabel("Josue Bryan Hernandez Zelaya");
        JPanel panel = new JPanel ();
        JButton button = new JButton("Progra 3");
        
        panel.add(button);
        frame.setSize(400,200);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.add(label, BorderLayout.BEFORE_FIRST_LINE);
    }
    
}

//Josue Bryan Hernandez Zelaya 
