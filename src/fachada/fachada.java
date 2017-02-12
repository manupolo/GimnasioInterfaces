/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import modelo.interfazCliente;
import modelo.modeloCliente;

/**
 *
 * @author diego
 */
public class fachada {
    
    //--------Clientes---------------//
    
    private interfazCliente cliente = new modeloCliente();
    
    
    public DefaultListModel listClientes(){
        return cliente.listClientes();
    }
    public String nombreCliente(String dni) {
        return cliente.nombreCliente(dni);
    }
     public List datosCliente(String dni){
           return cliente.datosCliente(dni);
     }
    
    
    
}
