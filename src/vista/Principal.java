/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCategoria;
import javax.swing.JOptionPane;
import modelo.Categoria;
/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        ControladorCategoria contCategoria = new ControladorCategoria();//Creamos un objeto controlador categoría
        
        Categoria objCategoria = new Categoria("1", "Lácteos", "Activo"); //Creamos un objeto categoría
        
        
        contCategoria.setCategoria(objCategoria); //Llamamos al método para registrar un categoría
        contCategoria.setCategoria(new Categoria("2", "Ropa", "Activo"));
        contCategoria.setCategoria(new Categoria("3", "Tecnología", "Activo"));
        contCategoria.setCategoria(new Categoria("4", "Linea Blanca", "Activo"));
       
        
        for (Categoria categoria : contCategoria.listarCategorias()) {
            System.out.println("Categoria: " + categoria.toString());
        }
        
        ///Probando método posicion
        System.out.println("La categoria se encuentar en la posición: " + contCategoria.posicion("3"));
        
        //Probando método eliminar
        if(contCategoria.eliminarCategoria("2")==true){
            JOptionPane.showMessageDialog(null, "El registro fue eliminado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null, "El registro no existe");
        }
        
        //Probamos el método modificar
        contCategoria.modificarCategoria(contCategoria.posicion("1"), "LACTEOS");
        
        for (Categoria categoria : contCategoria.listarCategorias()) {
            System.out.println("Categoria: " + categoria.toString());
        }
    }
    
}
