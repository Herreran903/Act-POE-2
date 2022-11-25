/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.StringTokenizer;

/**
 *
 * @author Nicolas Herrera
 */
public class Archivo implements  Serializable
{
    public static final long serialVersionUID = 1L;
    private File archivo;
    private String nombre;
    private int cantidadPalabras;
    private int cantidadLineas;
    private int cantidadPalabra;

    public Archivo() 
    {
        this.archivo = null;
    }

    public File getArchivo() 
    {
        return archivo;
    }

    public void setArchivo(File archivo) 
    {
        this.archivo = archivo;
    }

    public int getCantidadPalabras() 
    {
        return cantidadPalabras;
    }
    
    public int getCantidadPalabra() 
    {
        return cantidadPalabra;
    }

    
    public int getCantidadLineas() 
    {
        return cantidadLineas;
    }

    public void setCantidadPalabras(int cantidadPalabras) 
    {
        this.cantidadPalabras = cantidadPalabras;
    }
    
    public void setCantidadPalabra(int cantidadPalabras) 
    {
        this.cantidadPalabra = cantidadPalabras;
    }
    
    public void setCantidadLineas(int cantidadLineas) 
    {
        this.cantidadLineas = cantidadLineas;
    }
    
    public void contarPalabras() throws IOException 
    {
        int palabras = 0;
        FileReader fr = new FileReader( getArchivo() );
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while( (linea = br.readLine()) != null)
        {
            StringTokenizer st = new StringTokenizer(linea, " ");
            int total = st.countTokens();
            palabras+= total;
        }   
        setCantidadPalabras(palabras);
    }
    
    public void buscarPalabra(String palabra) throws IOException 
    {
        int palabras = 0;
        FileReader fr = new FileReader( getArchivo() );
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while( (linea = br.readLine()) != null)
        {
            StringTokenizer st = new StringTokenizer(linea, " ");
            int total = st.countTokens();
            String auxPalabra = "";
            for(int i = 0; i < total; i++)
            {
                auxPalabra = st.nextToken();
                if(auxPalabra.equals(palabra))
                {
                    palabras++;
                }
            }
        }   
        setCantidadPalabra(palabras);
    }
    
    public void contarLineas() throws IOException 
    {
        int lineas = 0;
        FileReader fr = new FileReader( getArchivo() );
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while( (linea = br.readLine()) != null)
        {
            lineas++;
        }   
        setCantidadLineas(lineas);
    } 
    
    public void asignarNombre() throws IOException 
    {
        this.nombre = archivo.getName();
        System.out.println(archivo.getName());
    } 
    
    public String getNombre()
    {
        return nombre;
    } 
}
