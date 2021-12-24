
package retotecnicosofka;

import java.util.ArrayList;

/**
 *
 * @author Fernando Quiceno G.
 */
public class Opcion {
    
    private int pregunta;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    private int respuesta;
    
    private ArrayList<Opcion> listaOpciones;

 
    
    public Opcion(int pregunta,String op1,String op2,String op3,String op4,int respuesta){
        
        this.pregunta = pregunta;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.respuesta = respuesta;
        listaOpciones = new ArrayList();
    }

   public Opcion(){
       
   }
   
   
   //Deveulve lista de Opciones de acuerdo a la pregunta
   
   public Opcion getBuscarOpciones(int pregunta){
       
       ArrayList<Opcion> listaOpciones = darListaOpciones();
       Opcion darOpciones = new Opcion();
       
       for(int i=0; i<listaOpciones.size();i++){
           
           if(listaOpciones.get(i).getPregunta() == pregunta){
               
               darOpciones = listaOpciones.get(i);
           } 
       }
       return darOpciones; 
   }
   
   
   public int getPregunta(){
       return pregunta;
   }
   
   
   public int getRespuesta(){
       return respuesta;
   }
   
   
   public String getOpcion1(){
       return op1;
   }
   
   
   public String getOpcion2(){
       return op2;
   }
   
   
   public String getOpcion3(){
       return op3;
   }  
   
   
   public String getOpcion4(){
       return op4;
   }   
   
   
    public ArrayList<Opcion> darListaOpciones(){
        
        ArrayList<Opcion> listaOpciones = new ArrayList();
        //Preguntas Categoria 1
        Opcion opciones1 = new Opcion(1,"1- Actriz,Modelo,Profesora","2- Actriz,Modelo,Presentadora,Productora","3- Presentadora,Ingeniera,Profesora","4- Actriz,Arquitecta,Modelo",2);
        Opcion opciones2 = new Opcion(2,"1- Carlos Villagran","2- Horacio Gomez Bolaño","3- Roberto Gomez Bolaño","4- Edgar Vivar",3);
        Opcion opciones3 = new Opcion(3,"1- Vikingos","2- Lucifer","3- La Casa de Papel","4- Black Mirror",3);
        Opcion opciones4 = new Opcion(4,"1- Maluma","2- Juanes","3- Joe Arroyo","4- J balvin",4);
        Opcion opciones5 = new Opcion(5,"1- Kraken","2- Jarabe de Palo","3- Aterciopelados","4- Los Yetis",1);
        
        //Preguntas Categoria 2
        Opcion opciones6 = new Opcion(6,"1-James Rodrigrez ","2-Radamel Falcao ","3-Juan Cuadrado ","4- Balanta",2);
        Opcion opciones7 = new Opcion(7,"1- Alemania","2- Argentina","3- Brasil","4- Italia",1);
        Opcion opciones8 = new Opcion(8,"1- Liverpool","2- Barcelona","3- Bayer Munich","4- Real Madrid",4);
        Opcion opciones9 = new Opcion(9,"1- James Rodriguez ","2- Radamel Falcao","3- Cristiano Ronaldo","4- Lionel Messi",1);
        Opcion opciones10 = new Opcion(10,"1- Italia","2- Australia","3- Colombia","4- Argentina",3);

        //Preguntas Categoria 3
        Opcion opciones11 = new Opcion(11,"1- Massachesetts","2- Pennsylvania","3- New York","4- Miami",3);
        Opcion opciones12 = new Opcion(12,"1- Esparta","2- Tebas","3- Volos","4- Atenas",4);
        Opcion opciones13 = new Opcion(13,"1- Tibet y Nepal","2- India y China","3- Nepal y China","4- Russia y Mongolia",1);
        Opcion opciones14 = new Opcion(14,"1- Maputo","2- Morrumbala","3- Mocuba","4- Nampula",1);
        Opcion opciones15 = new Opcion(15,"1- Alemania","2- España","3- Italia","4- Francia",4);
        
        //Preguntas Categoria 4
        Opcion opciones16 = new Opcion(16,"1- La Gravedad","2- La Fuerza Nuclear","3- Fuerza Magnetica","4- La Presion",1);
        Opcion opciones17 = new Opcion(17,"1- Los Jovenes","2- Los Ancianos","3- Las Mujeres","4- Los Niños",4);
        Opcion opciones18 = new Opcion(18,"1- Isaac Newton","2- Charles Darwin","3- Galileo Galilei","4- Albert Einstein",4);  
        Opcion opciones19 = new Opcion(19,"1- Tisis","2- Tubercolosis","3- Lepra","4- Gastritis",2);
        Opcion opciones20 = new Opcion(20,"1- Nikola Tesla","2- Galileo Galilei","3- Thomas Edison","4- Isaac Newton",2);
        
        //Preguntas Categoria 5
        Opcion opciones21 = new Opcion(21,"1- 1969","2- 1939","3- 1973","4- 1965",1);
        Opcion opciones22 = new Opcion(22,"1- 1940","2- 1939","3- 1945","4- 1941",3);
        Opcion opciones23 = new Opcion(23,"1- Apócrifos","2- Falsos","3- Apostólicos","4- Codices",1);  
        Opcion opciones24 = new Opcion(24,"1- Machu Picchu","2- Chichen Itza","3- Escandinavia","4- Estocolmo",1);
        Opcion opciones25 = new Opcion(25,"1- El Torah","2- El coran","3- La Biblia","4- Cien Años de Soledad",3);
        
        //Se añaden objetos de opciones a una lista
        listaOpciones.add(opciones1);
        listaOpciones.add(opciones2);
        listaOpciones.add(opciones3);
        listaOpciones.add(opciones4);
        listaOpciones.add(opciones5);
        listaOpciones.add(opciones6);
        listaOpciones.add(opciones7);
        listaOpciones.add(opciones8);
        listaOpciones.add(opciones9);
        listaOpciones.add(opciones10);
        listaOpciones.add(opciones11);
        listaOpciones.add(opciones12);
        listaOpciones.add(opciones13);
        listaOpciones.add(opciones14);
        listaOpciones.add(opciones15);
        listaOpciones.add(opciones16);
        listaOpciones.add(opciones17);
        listaOpciones.add(opciones18);
        listaOpciones.add(opciones19);
        listaOpciones.add(opciones20);
        listaOpciones.add(opciones21);
        listaOpciones.add(opciones22);
        listaOpciones.add(opciones23);
        listaOpciones.add(opciones24);
        listaOpciones.add(opciones25);
        
        return listaOpciones;
    }
      
    
}
