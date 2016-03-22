/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import javax.swing.JOptionPane;

/**
 *
 *  * @author jose clavijo
 */
public class consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Equivalente romano = new Equivalente();
        JOptionPane.showMessageDialog(null, "escriba el numero romano");
        String numero;
        numero=JOptionPane.showInputDialog("Ingrese un numero ROMANO");
        String pro=romano.Proceso(numero);
        JOptionPane.showMessageDialog(null, "Su resultado en numeros Equivalente es: "+pro);
    }
    
}
