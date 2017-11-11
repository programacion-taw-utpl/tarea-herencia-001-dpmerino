/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;
import personal.*;
/**
 *
 * @author diegomerino
 */
public class Empresa {
    private String nombre;
    private String siglas;
    private String cuidad;
    Trabajador [] trabajadores;
    
    public Empresa(String n, String s, String c, Trabajador[] t){
        setNombre(n);
        setSiglas(s);
        setCiudad(c);
        setTrabajadores(t);
    }
    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setSiglas(String s){
        siglas = s;
    }
    public String getSiglas(){
        return siglas;
    }
    public void setCiudad(String c){
        cuidad = c;
    }
    public String getCuidad(){
        return cuidad;
    }
    public void setTrabajadores (Trabajador [] t){
        trabajadores = t;
    }
    public Trabajador [] getTrabajadores(){
        return trabajadores;
    }
    @Override
    public String toString(){
    return String.format("Empresa: %s\n"
            + "Siglas: %s\n"
            + "Cuidad: %s\n",getNombre(),getSiglas(),getCuidad());    
    }
}
