/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego;

/**
 *
 * @author user
 */
public abstract class personaje {
    private int vida;
    private int energia;
    private int nombre;
    private int atentado;
    public personaje(){
    
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getAtentado() {
        return atentado;
    }

    public void setAtentado(int atentado) {
        this.atentado = atentado;
    }
    
}
