/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public interface interfazCliente {
    public DefaultListModel listClases(String dni);
    public String nombreCliente(String nombre);
    public DefaultTableModel listarClientes();
    public boolean añadirCliente(String dni, String nombre, String apellidos, Date fechaNacimiento, String direccion, int codPostal, String ciudad, int telefono, String correo);
    public boolean eliminarCliente(String dni);
        
    
      
    
}
