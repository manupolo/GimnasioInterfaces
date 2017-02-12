/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author diego
 */
public interface interfazCliente {
    public DefaultListModel listClientes();
    public String nombreCliente(String nombre);
    public List datosCliente(String dni);
    
        
    
      
    
}
