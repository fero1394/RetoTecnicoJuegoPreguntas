
package retotecnicosofka;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fernando Quiceno G.
 */
public class Jugador {

    private String nombre;
    private int acomulado;
    
    public Jugador(String nombre,int acomulado){
        
        this.nombre = nombre;
        this.acomulado = acomulado;
    }
    
    public Jugador(){
        
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public int getAcomulado(){
        return acomulado;
    }
    
    public void setAcomulado(int acomulado){
        this.acomulado = acomulado;
    }
    
    
    public void setGuardarDatos(String nombre,int acomulado){
        
        try {
            FileWriter writer = new FileWriter("src\\retotecnicosofka\\DatosJugador.txt",true);
            writer.write(nombre + " tuvo un acomulado de:  "  + acomulado + "\n");
            writer.close();
            System.out.println("Se guardaron los datos correctamente");
        }catch (IOException e) {
            System.out.println("Ocurrio un Error");
            e.printStackTrace();
            }    
    }
    
    
    public void getDatosGuardados() throws FileNotFoundException, IOException{
      
        try{FileReader reader=new FileReader("src\\retotecnicosofka\\DatosJugador.txt");
            //Leemos el fichero y lo mostramos por pantalla
            int valor=reader.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=reader.read();
            }
            //Cerramos el stream
            reader.close();
  
        }catch (IOException e){
            System.out.println("Error E/S: "+e);
        }  
    }
} 
    
    

