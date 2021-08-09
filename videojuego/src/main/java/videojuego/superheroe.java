/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego;
import java.util.List;

/**
 *
 * @author user
 */
public class superheroe extends personaje implements atentado{
    
    private List<objetMoviles> mochila;
    
    
    
    public superheroe(){
    
    }

    public List<objetMoviles> getMochila() {
        return mochila;
    }

    public void setMochila(List<objetMoviles> mochila) {
        this.mochila = mochila;
    }

    @Override
    public String violencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
