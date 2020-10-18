/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author Miguel
 */
public class Comprueba {
    
    public static boolean validar(String cadena){
        double num;
        try
        {
            num = Double.parseDouble(cadena);
            return true;
        }
        catch(Exception err)
        {
            return false;
        }
    }
    
}
