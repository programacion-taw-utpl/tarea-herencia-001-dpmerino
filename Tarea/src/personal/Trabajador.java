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
public class Trabajador extends Persona{
    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_hora;
    public Trabajador(String n, String a, int e, long c, int cs,int ht, int cxh) {
        super(n, a, e, c);
        setCS(cs);
        setHT(ht);
        setCxH(cxh);
    }
    public void setCS(int cs){
        costo_seguro = cs;
    }
    public int getCS(){
        return costo_seguro;
    }
    public void setHT(int ht){
        horas_trabajadas = ht;
    }
    public int getHT(){
        return horas_trabajadas;
    }
    public void setCxH(int cxh){
        costo_por_hora = cxh;
    }
    public int getCxH(){
        return costo_por_hora;
    }
    public int obtener_sueldo(){
        int sueldo;
        sueldo = ((getHT()*getCxH())+getCS());
        return sueldo;
    }
    @Override
    public String toString(){
        return String.format("\t%s\n"
                + "Seguro: $%d\n"
                + "Horas Trabajadas: %d\n"
                + "Valor por Hora: $%s\n"
                + "Sueldo: $%s\n",super.toString(),getCS(),getHT(),getCxH(),obtener_sueldo());
    }
}
