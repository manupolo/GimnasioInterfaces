/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author diego
 */
public class modeloCliente extends conexion implements interfazCliente {
    
    
    public modeloCliente(){
        
    }
    
    
    
  @Override
 public DefaultListModel listClientes()
{
    DefaultListModel model = new DefaultListModel();
        try {
           PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT * from cliente");
           ResultSet res = pstm.executeQuery();
            
            while (res.next()) //go through each row that your query returns
            {
                String itemCode = res.getString("dni"); //get the element in column "item_code"
                model.addElement(itemCode); //add each item to the model
            }
            
            
            res.close();
            pstm.close();
          } catch (SQLException ex) {
            Logger.getLogger(modeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       return model;
}

    @Override
    public String nombreCliente(String dni) {
        String resultado = null;
        
        try {
           PreparedStatement pstm = this.getConexion().prepareStatement( "SELECT nombre from cliente where dni='" + dni + "'");
           ResultSet res = pstm.executeQuery();
            
            while (res.next()) 
            {
                resultado = res.getString("nombre"); 
                
            }
            res.close();
            pstm.close();
          } catch (SQLException ex) {
            Logger.getLogger(modeloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       return resultado;
}
    @Override
     public List datosCliente(String dni) {
           List lista = new ArrayList<cliente>();

           try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT dni, nombre, apellidos, fechaNacimiento, direccion, codPostal, ciudad, telefono, correo from cliente where dni ='" + dni + "' " );
            ResultSet res = pstm.executeQuery();
            
            while(res.next()){
                
            String dni2= res.getString("dni");
            String nombre= res.getString("nombre");
            String apellidos= res.getString("apellidos");
            Date fechaNacimiento = res.getDate("fechaNacimiento");
            String direccion= res.getString("direccion");
            int codPostal= res.getInt("codPostal");
            String ciudad= res.getString("ciudad");
            int telefono= res.getInt("telefono");
            String correo= res.getString("correo");
            
            
            cliente c = new cliente();
            
            c.setDni(dni2);
            c.setNombre(nombre);
            c.setApellidos(apellidos);
            c.setFechaNacimiento(fechaNacimiento);
            c.setDireccion(direccion);
            c.setCodPostal(codPostal);
            c.setCiudad(ciudad);
            c.setTelefono(telefono);
            c.setCorreo(correo);
            
            lista.add(c);
            
            }
            res.close();
            pstm.close();
           }catch(SQLException ex){
               Logger.getLogger(modeloCliente.class.getName()).log(Level.SEVERE, null, ex);
               
           }  
            return lista;
        
        }
}

 




    
    

