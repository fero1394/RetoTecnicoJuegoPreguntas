
package retotecnicosofka;

import java.util.ArrayList;

/**
 *
 * @author Fernando Quiceno G.
 */
public class Pregunta {
    
    private String contenidoPregunta;
    private ArrayList<Pregunta> listaPreguntas;
    private int numero;
    private int ronda;
    
    //Constructor
    public Pregunta(int numero,int ronda,String contenidoPregunta){
       
        this.numero = numero;
        this.ronda = ronda;
        this.contenidoPregunta = contenidoPregunta;
    }
    
    
    public Pregunta(){
        
    }
 
    
   public int getRonda(){
       return ronda;
   }
        
        
   public int getNumero(){
       return numero;
   }    
        
   
   public String getContenido(){
       return contenidoPregunta;
   }
   
 
   public ArrayList<Pregunta> getListaPreguntas(){
       
       ArrayList<Pregunta> listaPreguntas = new ArrayList();

       //Preguntas de la primera Categoria
       Pregunta pregunta1 = new Pregunta(1,1,"¿Cual es la profesion de Sofia Vergara?");
       Pregunta pregunta2 = new Pregunta(2,1,"¿Cual es el nombre del actor que representa al chavo del ocho?");
       Pregunta pregunta3 = new Pregunta(3,1,"¿Cual es la serie de netflix, donde sus personajes usan nombres de ciudades?");
       Pregunta pregunta4 = new Pregunta(4,1,"¿Nombre artistico de Jose Alvaro Osorio?");
       Pregunta pregunta5 = new Pregunta(5,1,"¿Quien interpreta la cancion de rock llamada 'vestido de cristal'?");
       
       //Preguntas de la segunda Categoria
       Pregunta pregunta6 = new Pregunta(6,2,"¿A que jugador colombiano lesionaron antes del mundial de Brasil 2014?");
       Pregunta pregunta7 = new Pregunta(7,2,"¿Hasta el mundial de Rusia 2018 cual es la seleccion que mas finales ha judado?");
       Pregunta pregunta8 = new Pregunta(8,2,"¿Que club del futbol fue campeon de la UEFA Champion League 4 veces en 5 años?");
       Pregunta pregunta9 = new Pregunta(9,2,"¿Que jugador de futbol dejo y regreso al el equipo de futbol español Real Madrid?");
       Pregunta pregunta10 = new Pregunta(10,2,"¿Pais potencia en patinaje?");
       
       //Preguntas de la tercera Categoria
       Pregunta pregunta11 = new Pregunta(11,3,"¿En cual estado podrias encontrar la estatua de la libertad?");
       Pregunta pregunta12 = new Pregunta(12,3,"¿Cual es la ciudad principal de Grecia?");
       Pregunta pregunta13 = new Pregunta(13,3,"¿Cuales son los dos paises que estan entre el monte Everst?");
       Pregunta pregunta14 = new Pregunta(14,3,"¿Capital de mozambique?");
       Pregunta pregunta15 = new Pregunta(15,3,"¿En que pais esta ubicado el Arco del Triunfo?");
       
       //Preguntas de la cuarta Categoria
       Pregunta pregunta16 = new Pregunta(16,4,"¿Que fuerza nos mantiene en la tierra sin ser expulsados hacia el espacio exterior?");
       Pregunta pregunta17 = new Pregunta(17,4,"¿Cual es la especialidad del medico pediatra?");
       Pregunta pregunta18 = new Pregunta(18,4,"¿Que fisico descubrio y demostro la teoria de la relativida?");
       Pregunta pregunta19 = new Pregunta(19,4,"¿Como se llama la enfermedad bacteriana que afecta pricipalmente a los pulmones?");
       Pregunta pregunta20 = new Pregunta(20,4,"¿Aquien se le atribuye el invento del telescopio?");
       
       //Preguntas de la quinta Categoria
       Pregunta pregunta21 = new Pregunta(21,5,"¿En que año el hombre piso la luna por primera vez?");
       Pregunta pregunta22 = new Pregunta(22,5,"¿En que año fue el fin de la segunda guerra mundial?");
       Pregunta pregunta23 = new Pregunta(23,5,"¿Con que nombre se conoce los evangelios que no estan en el nuevo testamento?");
       Pregunta pregunta24 = new Pregunta(24,5,"¿Cual fue la ciudad de los incas?");
       Pregunta pregunta25 = new Pregunta(25,5,"¿Cual libro duro mas de 1500 años en escribirse?");
       
       
       listaPreguntas.add(pregunta1);
       listaPreguntas.add(pregunta2);
       listaPreguntas.add(pregunta3);
       listaPreguntas.add(pregunta4);
       listaPreguntas.add(pregunta5);
       listaPreguntas.add(pregunta6);
       listaPreguntas.add(pregunta7);
       listaPreguntas.add(pregunta8);
       listaPreguntas.add(pregunta9);
       listaPreguntas.add(pregunta10);
       listaPreguntas.add(pregunta11);
       listaPreguntas.add(pregunta12);
       listaPreguntas.add(pregunta13);
       listaPreguntas.add(pregunta14);
       listaPreguntas.add(pregunta15);
       listaPreguntas.add(pregunta16);
       listaPreguntas.add(pregunta17);
       listaPreguntas.add(pregunta18);
       listaPreguntas.add(pregunta19);
       listaPreguntas.add(pregunta20);
       listaPreguntas.add(pregunta21);
       listaPreguntas.add(pregunta22);
       listaPreguntas.add(pregunta23);
       listaPreguntas.add(pregunta24);
       listaPreguntas.add(pregunta25);

       return listaPreguntas;
       
   }
   
      //Genera una lista de preguntas simplificada 
    //de acuerdo a la ronda que se esta jugando
    public ArrayList<Pregunta> getListaporRonda(int ronda){
        
        ArrayList<Pregunta> lista = getListaPreguntas();
        ArrayList<Pregunta> listaporRonda = new ArrayList();
        
        for(int i = 0;i<lista.size();i++){
            
            if(lista.get(i).getRonda() == ronda){
                
                listaporRonda.add(lista.get(i));
            }
        }
        return listaporRonda;
    }
}
