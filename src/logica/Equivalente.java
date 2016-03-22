/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.swing.JOptionPane;

/**
 *
 *@author  * @author jose clavijo
 */
public class Equivalente 
{
    private String numero_romano;
    private char digito = ' ';
    private int romano_final=0;
    private int dig_anterior=0;
    public String Proceso(String numero_romano)
    {
        this.numero_romano=numero_romano;
        this.numero_romano=this.numero_romano.toUpperCase();
        char num_Rom[] = {' ','I','V','X','L','C','D','M'};
        int valor_equivalente[]={0,1,5,10,50,100,500,1000};
        for (int i=0;i<this.numero_romano.length();i++)
        {
            digito = this.numero_romano.charAt(i);
            for (int j=0;j<num_Rom.length;j++)
            {
                if (digito == num_Rom[j])
                {
                    this.romano_final=this.romano_final+valor_equivalente[j];
                    if (dig_anterior < valor_equivalente[j])
                    {
                        this.romano_final=this.romano_final - dig_anterior*2;
                        dig_anterior = valor_equivalente[j];
                    }
                    else
                    {
                        dig_anterior=valor_equivalente[j];
                    }
                }
            }
        }
        String resultado =Integer.toString(this.romano_final);
        return resultado;
    }
}
