
package controlador;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Categoria;

public class ControladorCategoria {
    ArrayList<Categoria> listCategoria = new ArrayList<>();
    ArrayList<Categoria> listCategoriaBusq = new ArrayList<>();
    
    public boolean setCategoria(Categoria objCategoria){
        try {
            listCategoria.add(objCategoria);
            return true;
        } catch (Exception e) {
            return false;
        }
    }   
    
    public ArrayList<Categoria> listarCategorias () throws Exception{
        try {
            return listCategoria;
        } catch (Exception e) {
            throw new Exception("No se pudo realizar la operación: "+e.toString());
        }
    }
    
    //Método buscar posicion
    public int posicion(String valor){
      int pos=-1;
        for (int i=0; i < listCategoria.size(); i++) {
            if(listCategoria.get(i).getIdCategoria()==valor){
                pos=i;
            }
        }
        return pos;
    }
    //Método eliminar
    public boolean eliminarCategoria(String id){
        for (int i = 0; i < listCategoria.size(); i++) {
            if(listCategoria.get(i).getIdCategoria()==id){
                listCategoria.remove(i);
            }
        }
        return true;
    }
    //Método modificar
    public void modificarCategoria(int pos, String nombre){
        listCategoria.get(pos).setNombre(nombre);
    }
    
    public ArrayList<Categoria> buscarCategoria(int item, String parametro){
        System.out.println("Valor Item: " + item);
        System.out.println("VAlor parametro: "+parametro);
//        int itm = Integer.parseInt(item);
           switch (item){
            case 1: System.out.println("Llego al parametro 1");
                for (int i = 0; i < listCategoria.size(); i++) {
                    if(listCategoria.get(i).getIdCategoria()==parametro){
                        listCategoriaBusq.add(listCategoria.get(i));
                    }
                }
                break;
            case 2: System.out.println("Llego al parametro 2");
                for (int i = 0; i < listCategoria.size(); i++) {
                    if(listCategoria.get(i).getNombre()==parametro){
                        System.out.println("Estoy en el controlador: " + i);
                        listCategoriaBusq.add(listCategoria.get(i));
                    }
                }
                for (Categoria categoria : listCategoriaBusq) {
                    System.out.println("Listando la listara: " + categoria.toString());
                }
                break;
            case 3: System.out.println("Llego al parametro 3");
                for (int i = 0; i < listCategoria.size(); i++) {
                    if(listCategoria.get(i).getEstado()==parametro){
                        listCategoriaBusq.add(listCategoria.get(i));
                    }
                }
                break;
        }
        return listCategoriaBusq;
    }

    
}
