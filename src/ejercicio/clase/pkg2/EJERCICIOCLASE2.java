/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.clase.pkg2;

import logica.Controlador;
import modelo.Archivo;
import vista.Vista;

/**
 *
 * @author Nicolas Herrera
 */
public class EJERCICIOCLASE2 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Vista a = new Vista();
        Archivo b = new Archivo();
        Controlador c = new Controlador(b, a);
        
    }
    
}
