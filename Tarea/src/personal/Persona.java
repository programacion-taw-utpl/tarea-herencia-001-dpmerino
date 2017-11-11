/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author diegomerino
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private long ci;
    
    public Persona(String n,String a,int e,long c){
        setNombre(n);
        setApellido(a);
        setEdad(e);
        setCI(c);
        
    }
    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String a){
        apellido = a;
    }
    public String getApellido(){
        return apellido;
    }
    public void setEdad(int e){
        edad = e;
    }
    public int getEdad(){
        return edad;
    }
    public void setCI(long c){
        ci = c;
    }
    public long getCI(){
        return ci;
    }
    @Override
    public String toString(){
        return String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "%d años de edad\n"
                + "CI: %d",getNombre(),getApellido(),getEdad(),getCI());
    }
}
