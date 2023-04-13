/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopractica;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel Arriola
 */
public class Conexion {
     
  public Connection esatblecerConnection(){
       Connection conectar=null;
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
       
          conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/Usuario","root","joelarriola");
          if(conectar!=null){
          JOptionPane.showMessageDialog(null,"CONEXION EXITOSA");
          }
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "ERROR AL CONONECTAR, error"+e.toString());
      }
      return conectar;
  }
  
}
 //String Cadena="jdbc:mysql://localhost:3306/Usuario","root","joelarriola";