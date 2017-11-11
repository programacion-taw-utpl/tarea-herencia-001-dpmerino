/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;

import personal.Trabajador;

/**
 *
 * @author diegomerino
 */
public class EmpresaPrivada extends Empresa{
    private double ventas_mensual_fijo;
    private int numero_sucursales;
    
    public EmpresaPrivada(String n, String s, String c, Trabajador[] t, double vmf,int ns) {
        super(n, s, c, t);
        setVmF(vmf);
        setNS(ns);
    }
    public void setVmF(double vmf){
        ventas_mensual_fijo = vmf;
    }
    public double getVmF(){
        return ventas_mensual_fijo;
    }
    public void setNS (int ns){
        numero_sucursales = ns; 
    }
    public int getNS (){
        return numero_sucursales;
    }
    @Override
    public String toString(){
        String cadena="";
        for (int i = 0; i < trabajadores.length; i++) {
            cadena+=String.format("%d)%s\n",i+1,getTrabajadores()[i].toString());
        }
        return String.format("%s\n"
                + "Ventas: %s\n"
                + "Sucursales: %s\n"
                + "Lista Trabajadores: \n\n%s\n",super.toString(),getVmF(),getNS(),cadena);
    }
}
