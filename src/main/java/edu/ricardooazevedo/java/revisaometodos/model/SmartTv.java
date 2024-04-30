package edu.ricardooazevedo.java.revisaometodos.model;

/**
 *
 * @author ricar
 */
public class SmartTv {

    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("Tv ligada");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("Tv desligada");
    }

    public void aumentarVolume() {
        if (this.ligada == true) {
            if(this.volume >= 100){
                System.out.println("Volume Maximo!");
            }else{
                this.volume++;
            System.out.println("Volume Atual: " + getVolume());
            }
        } else {
            System.out.println("A Tv se encontra Desligada!");
        }
    }

    public void diminuirVolume() {
        if (this.ligada == true) {
            if(this.volume <= 0){
                System.out.println("Volume Minimo!");
            }else{
                this.volume--;
            System.out.println("Volume Atual: " + getVolume());
            }
        } else {
            System.out.println("A Tv se encontra Desligada!");
        }
    }
    
    public void adiantarCanal(){
        if (this.ligada == true){
            if(this.canal >= 1 && this.canal <= 5){
                this.canal++;
                System.out.println("Canal atual: "+getCanal());
            }else {
                this.canal = 1;
            }
        }else{
            System.out.println("A Tv se encontra Desligada!");
        }
    }
    
    public void voltarCanal(){
        if (this.ligada == true){
            if(this.canal >= 1 && this.canal <= 5){
                this.canal--;
                System.out.println("Canal atual: "+getCanal());
            }else {
                this.canal = 1;
            }
        }else{
            System.out.println("A Tv se encontra Desligada!");
        }
    }
}
