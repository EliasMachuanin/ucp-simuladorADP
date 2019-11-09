/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author sala 23 - pcs 16
 */
public class Proceso implements Comparable<Proceso>{
    
    private int id;
    private String nombre;
    private double instante_entrada;
    private double duracion;
    private boolean seleccionado;

    public Proceso(){
        this.setId(0);
        this.setNombre(null);
        this.setInstante_entrada(0);
        this.setDuracion(0);
        this.setSeleccionado(false);
    }
    
    public Proceso(int id, String nombre){
        this.setId(id);
        this.setNombre(nombre);
        this.setInstante_entrada(0);
        this.setDuracion(0);
        this.setSeleccionado(false);
    }
    
    public Proceso(int id, String nombre, double instante_entrada, double duracion){
        this.setId(id);
        this.setNombre(nombre);
        this.setInstante_entrada(instante_entrada);
        this.setDuracion(duracion);
        this.setSeleccionado(false);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getInstante_entrada() {
        return instante_entrada;
    }

    public void setInstante_entrada(double instante_entrada) {
        this.instante_entrada = instante_entrada;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    public void mostrar() {
        System.out.println(""+this.getId());
        System.out.println(this.getNombre());
        System.out.println(""+this.getInstante_entrada());
        System.out.println(""+this.getDuracion());
    }

    /**
     * @return the seleccionado
     */
    public boolean isSeleccionado() {
        return seleccionado;
    }

    /**
     * @param seleccionado the seleccionado to set
     */
    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    @Override
    public int compareTo(Proceso o) {
        if(this.getInstante_entrada()<o.getInstante_entrada()){
            return -1;
        }
        else if(this.getInstante_entrada()>o.getInstante_entrada()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
        