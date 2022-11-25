/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Nicolas Herrera
 */
public class Vista extends JFrame
{
    private Color rojoClaro;
    private Color blancoClaro;
    final static String ingresoDatosPanel = "CardTable";
    final static String resultadosPanel = "CardData";
    GridBagConstraints gbc = new GridBagConstraints();
    
    private JPanel jpContenido;
    private JPanel jpResultados;
    private JPanel jpIngresoDatos;
    private JLabel lblPalabra;
    private JTextField txfPalabra;
    private JLabel lblNombreArchivo;
    private JLabel lblCantidadPalabras;
    private JLabel lblCantidadLineas;
    private JLabel lblCantidadPalabra;
    private JTextField txfMontoPrestamo;
    private JButton btnAgregarArchivo;
    private JButton btnNuevo;
   
    
    public Vista()
    {
        inicializarComponentes();
    }
    
    private void inicializarComponentes()
    {
        setTitle("PRESTAMO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,700);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        //Componentes Adicionales
        
        rojoClaro = new Color(244,110,81);
        blancoClaro = new Color(250,250,250);
        
        //Componentes JFrame
        
        jpContenido = new JPanel();
        jpContenido.setLayout(new CardLayout());
        
        //Componentes jpResultados
        
        jpResultados = new JPanel();
        jpResultados.setLayout(new GridBagLayout());
        jpResultados.setBackground(Color.white);
        
        lblNombreArchivo = new JLabel("NOMBRE ARCHIVO: ", SwingConstants.CENTER);
        lblNombreArchivo.setFont(new Font("Arial", 1, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        jpResultados.add(lblNombreArchivo, gbc);
        
        lblCantidadLineas = new JLabel("CANTIDAD DE LINEAS: ", SwingConstants.CENTER);
        lblCantidadLineas.setFont(new Font("Arial", 1, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        jpResultados.add(lblCantidadLineas, gbc);
        
        lblCantidadPalabras = new JLabel("CANTIDAD DE PALABRAS: ", SwingConstants.CENTER);
        lblCantidadPalabras.setFont(new Font("Arial", 1, 20));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        jpResultados.add(lblCantidadPalabras, gbc);
        
        lblCantidadPalabra = new JLabel("PALABRA: ", SwingConstants.CENTER);
        lblCantidadPalabra.setFont(new Font("Arial", 1, 20));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        jpResultados.add(lblCantidadPalabra, gbc);
        
        btnNuevo = new JButton("Nuevo");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.CENTER;
        jpResultados.add(btnNuevo, gbc);
        
        // Componentes jpIngresoDatos
        
        jpIngresoDatos = new JPanel();
        jpIngresoDatos.setLayout(new GridBagLayout());
        jpIngresoDatos.setBackground(blancoClaro);
        
        lblPalabra = new JLabel("Palabra", SwingConstants.CENTER);
        lblPalabra.setFont(new Font("Arial", 1, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jpIngresoDatos.add(lblPalabra, gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jpIngresoDatos.add(Box.createGlue(), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jpIngresoDatos.add(Box.createGlue(), gbc);
        
        txfPalabra = new JTextField(SwingConstants.CENTER);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jpIngresoDatos.add(txfPalabra, gbc);
       
        btnAgregarArchivo = new JButton("Nuevo archivo");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.NONE;
        jpIngresoDatos.add(btnAgregarArchivo, gbc);
        
        //Adicion de los Jpanel a jpContenido y JFrame
        
        jpContenido.add(jpIngresoDatos, ingresoDatosPanel);
        jpContenido.add(jpResultados, resultadosPanel);
        
        this.getContentPane().add(jpContenido, BorderLayout.CENTER);
        setVisible(true);
    }
    
    public String getPalabra()
    {
        return txfPalabra.getText();
    }
    
    /*public int getArchivo()
    {
        return Integer.parseInt(txfCantidadMeses.getText());
    }*/
    
    public void addBtnAgregarArchivoListener(ActionListener listenControles)
    {
        btnAgregarArchivo.addActionListener(listenControles);
    }
    
    public void addBtnNuevoListener(ActionListener listenControles)
    {
        btnNuevo.addActionListener(listenControles);
    }
    
    public void displayErrorMessage(String erroMessage)
    {
        JOptionPane.showMessageDialog(this, erroMessage);
    }
    
    public File getArchivo()
    {
        File archivo = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt", "text");
        fileChooser.setFileFilter(filtro);
        
        int seleccion= fileChooser.showOpenDialog(this);
        if(seleccion != JFileChooser.CANCEL_OPTION)
        {
            archivo = fileChooser.getSelectedFile();
        }
        
        return archivo;
    }
    
    public void actualizarCantidadPalabras(int auxCantidadPalabras)
    {
        lblCantidadPalabras.setText("CANTIDAD DE PALABRAS: " + auxCantidadPalabras);
    }
    
    public void actualizarCantidadPalabra(String auxPalabra ,int auxCantidadPalabra)
    {
        if(!auxPalabra.equals(""))
        {
            lblCantidadPalabra.setText(auxPalabra + ": " + auxCantidadPalabra);
        }
        else
        {
            lblCantidadPalabra.setText("NO SE ELIGIO NINGUNA PALABRA");
        }   
    }
    
    public void actualizarCantidadLineas(int auxCantidadLineas)
    {
        lblCantidadLineas.setText("CANTIDAD DE LINEAS: " + auxCantidadLineas);
    }
    
    public void actualizarNombreArchivo(String auxNombreArchivo)
    {
        lblNombreArchivo.setText("NOMBRE ARCHIVO: " + auxNombreArchivo);
    }
    
    public void pagResultados()
    {
        CardLayout a = (CardLayout)jpContenido.getLayout();
        a.show(jpContenido, resultadosPanel);
    }
    
    public void pagIngresoDatos()
    {
        txfPalabra.setText("");
        CardLayout a = (CardLayout)jpContenido.getLayout();
        a.show(jpContenido, ingresoDatosPanel);
    }     
}
