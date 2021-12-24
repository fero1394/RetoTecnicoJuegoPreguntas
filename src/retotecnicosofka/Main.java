
package retotecnicosofka;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Fernando Quiceno G.
 */
public class Main {
    
    public static void main(String [] arg) throws IOException{
        
        Scanner entrada = new Scanner(System.in);
        int op,opcion;
        
        //Preparo objeto preguntas
        Pregunta pregunta = new Pregunta();

        //Preparo objeto de Categorias
        Categoria categoria = new Categoria();
 
        //Lista simplificada de preguntas y opciones por ronda
        ArrayList<Pregunta> lista = new ArrayList();
    
        //Generar pregunta aleatoria
        Random random = new Random();
        int aleatoria;
        Pregunta preguntaAleatoria;
        Opcion opciones = new Opcion();
    
        Premio premio = new Premio();
        int dinero = 0;
        int acomulado = 0;
        String nombre;
        
        
        //MENU INICIAL
        System.out.print("----------MENU---------\n"
                + "Seleccione la opcion de la accion que desees realizar\n"
                + "1- Empezar a Jugar\n"
                + "2- Mostrar Datos Historicos\n"
                + "3- Salir\n");
    
        op = entrada.nextInt();
    
    
        switch (op) {
            
            case 1:
                int ronda = 1;
                
                System.out.println("REGISTRO DE JUGADOR\n"
                                   +"INGRESE SU NOMBRE: ");
                nombre = entrada.next();
                
                Jugador jugador = new Jugador(nombre,acomulado);
                
                 
                for(int i=0;i<5;i++){
                    
                    //Genero numero aleatorio
                    aleatoria = random.nextInt(0+5)+0;
                   
                    //Genera una lista de preguntas que pertenecen a la ronda actual
                    lista = pregunta.getListaporRonda(ronda);
                    
                    //Escoge una pregunta aleatoria de la lista generada
                    preguntaAleatoria = lista.get(aleatoria);
                    
                    //Escoje las opciones que le pertenece a la pregunta escogida aleatoria
                    opciones = opciones.getBuscarOpciones(preguntaAleatoria.getNumero());
                    
                    //Selecciona el premio que ofrece cada ronda
                    dinero = premio.getPremioporRonda(ronda);                    

    
                    //INICIO JUEGO DE PREGUNTAS
                    System.out.println("Categoria: "+categoria.getNombreporRonda(ronda)+"\n"
                            +"Pregunta "+(i+1)+"\n\n"
                            +"En esta ronda hay un premio de: "
                            +dinero
                            +" Dolares\n\n"
                            +preguntaAleatoria.getContenido()+"\n"
                            +opciones.getOpcion1()+"\t\t"+opciones.getOpcion2()+"\n"
                            +opciones.getOpcion3()+"\t\t"+opciones.getOpcion4()+"\n"
                                    +"5- Retirarse");
                    
                    opcion = entrada.nextInt();
                    
                    if(opcion == opciones.getRespuesta()){
                        
                        acomulado += dinero;
                        System.out.println("\n\n!!!!!! FELICITACIONES "+jugador.getNombre() +" GANASTE¡¡¡¡¡¡ "+dinero+" Dolares\n"
                                +"TU ACOMULADO ES DE: "+acomulado+" Dolares\n\n");
                        
                        jugador.setAcomulado(acomulado);
                        
                        ronda++;
                    }
                    else if(opcion == 5){
                        System.out.println("\n"+jugador.getNombre()+" TE LLEVAS UN ACOMULADO DE: "+acomulado
                        +"\n EL JUEGO HA TERMINADO.");
           
                        
                        break;
                    }else if((opcion < 1) || (opcion > 5)){
                        
                        System.out.println("LA OPCION NO EXISTE");
                    }
                    else{
                        
                        System.out.println("!!!!PERDISTE TU ACOMULADO DE "+acomulado+" Dolares\n"
                                +"EL JUEGO HA TERMINADO.");
                        jugador.setAcomulado(0);
                        
                        break;
                    }    
                }
                jugador.setGuardarDatos(jugador.getNombre(), jugador.getAcomulado());
                break;
                
                
            case 2:
                
                Jugador jugador1 = new Jugador();
                jugador1.getDatosGuardados();
                break;
                
            
            case 3:
                System.out.println("HASTA PRONTO");
                break;
                
                
                
            default:
                
                System.out.println("LA OPCION NO EXISTE");
                
                break;
        }
    }   
}
