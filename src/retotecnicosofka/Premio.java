
package retotecnicosofka;

import java.util.ArrayList;

/**
 * @author Fernando Quiceno G.
 */
public class Premio {

    private int ronda;
    private int dinero;
    
    
    public Premio(int ronda,int dinero){
        
        this.ronda = ronda;
        this.dinero = dinero;
    }
    
    public Premio(){
        
    }
    
    public ArrayList<Premio> getListaPremio(){
        
        ArrayList listapremios = new ArrayList();
        
        Premio premio1 = new Premio(1,1500);
        Premio premio2 = new Premio(2,15500);
        Premio premio3 = new Premio(3,55000);
        Premio premio4 = new Premio(4,120000);
        Premio premio5 = new Premio(5,210000);
        
        
        listapremios.add(premio1);
        listapremios.add(premio2);
        listapremios.add(premio3);
        listapremios.add(premio4);
        listapremios.add(premio5);
        
        return listapremios;
    }
    
    public int getRondaPremio(){
        return ronda;
    }
    
    public int getPremio(){
        return dinero;
    }
    
    
    public int getPremioporRonda(int ronda){
        
        ArrayList<Premio> lista = new ArrayList();
        lista = getListaPremio();
        int premio = 0;
        
        for(int i=0;i<lista.size();i++){
            
            if(lista.get(i).getRondaPremio() == ronda){
                
                premio = lista.get(i).getPremio();
            }
        }
        return premio;
    }
}
