/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import laempresa.EmpresaPrivada;
import personal.Trabajador;
/**
 *
 * @author diegomerino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trabajador[] trabajadores = new Trabajador[2];
        //public Trabajador(String n, String a, int e, long c, int cs,int ht, int cxh)
        trabajadores[0]= new Trabajador("Ana Luisa","Velez Alcivar",30,12903939,100,40,10);
        trabajadores[1]= new Trabajador("Mario Anibal","Vela Narvaez",35,212889,100,50,10);
        
        //public EmpresaPrivada(String n, String s, String c, Trabajador[] t, double vmf,int ns)
        EmpresaPrivada empresa = new EmpresaPrivada("Soluciones Software","SS's","Loja",trabajadores,200000,12);
        System.out.println(empresa);
    }
    
}
