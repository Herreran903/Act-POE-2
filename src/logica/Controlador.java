/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Archivo;
import vista.Vista;

/**
 *
 * @author Nicolas Herrera
 */
public class Controlador 
{
    private final Archivo modelo;
    private final Vista vista;

    public Controlador(Archivo auxModelo, Vista auxVista) 
    {
        this.modelo = auxModelo;
        this.vista = auxVista;
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
        this.vista.addBtnAgregarArchivoListener(new AgregarArchivoListener());
        this.vista.addBtnNuevoListener(new NuevoListener());
    }
    
    
    class AgregarArchivoListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            File archivo = null;
            String nombreArchivo = "";
            String palabra = "";
            int cantidadPalabras = 0;
            int cantidadPalabra = 0;
            int cantidadLineas = 0;
            if(e.getActionCommand().equalsIgnoreCase("Nuevo archivo"))
            {
                try
                {
                    archivo = vista.getArchivo();
                    palabra = vista.getPalabra();
                    if(archivo != null)
                    {
                        modelo.setArchivo(archivo);
                        modelo.asignarNombre();
                        modelo.contarPalabras();
                        modelo.buscarPalabra(palabra);
                        modelo.contarLineas();
                        nombreArchivo = modelo.getNombre();
                        cantidadPalabras = modelo.getCantidadPalabras();
                        cantidadPalabra = modelo.getCantidadPalabra();
                        cantidadLineas = modelo.getCantidadLineas();
                        vista.actualizarNombreArchivo(nombreArchivo);
                        vista.actualizarCantidadPalabras(cantidadPalabras);
                        vista.actualizarCantidadPalabra(palabra, cantidadPalabra);
                        vista.actualizarCantidadLineas(cantidadLineas);
                        vista.pagResultados();
                    }   
                } 
                catch(NumberFormatException ex)
                {
                    vista.displayErrorMessage("Necesita ingresar 2 numeros");
                } catch (IOException ex) 
                {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
           }  
        } 
    }
    
    class NuevoListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getActionCommand().equalsIgnoreCase("Nuevo"))
            {
                vista.pagIngresoDatos();
            }
        }
     }
}
