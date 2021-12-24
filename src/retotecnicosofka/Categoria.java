
package retotecnicosofka;

import java.util.ArrayList;

/**
 *
 * @author Fernando Quiceno G.
 */
public class Categoria {
    
    private int nivel;
    private String nombre;
    private ArrayList categorias;
    
    
    public Categoria(String nombre,int nivel){
        
        this.nombre = nombre;
        this.nivel = nivel;
        categorias = new ArrayList<Categoria>();
        
    }

    public Categoria() {
    }
    
    
    public String getNombreporRonda(int ronda){
       
        String categoria = null;
        ArrayList<Categoria> lista = getListaCategorias();
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getNivel() == ronda){
               categoria = lista.get(i).getNombre();
            }
        }
      
       return categoria;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    
    public int getNivel(){
        return nivel;
    }

    
    public ArrayList <Categoria> getListaCategorias(){
        
        ArrayList<Categoria> categorias = new ArrayList();
        //Objetos Categorias
     
       Categoria categoria1 = new Categoria("Entretenimiento",1);
       Categoria categoria2 = new Categoria("Deportes",2);
       Categoria categoria3 = new Categoria("Geografia",3);
       Categoria categoria4 = new Categoria("Ciencia",4);
       Categoria categoria5 = new Categoria("Historia",5);
       
       //Añade a la coleccion de Objetos las categorias que existen
       categorias.add(categoria1);
       categorias.add(categoria2);
       categorias.add(categoria3);
       categorias.add(categoria4);
       categorias.add(categoria5);
       
       return categorias;
       
    }
}
