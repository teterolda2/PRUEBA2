
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Almuerzo extends Gasto{
    
    protected Tipo tipoalmuerzo;
    protected String plato1;
    protected int numasistentes;
    protected int menuinfantil;
   
            
    public enum Tipo {Cena,Mediodia}
    
    public Almuerzo(Tipo tipoalmuerzo, String plato1, int numasistentes, int menuinfantil, LocalDate fecha, String descripcion, double importe, String localizacion, boolean pagar) {
        super(fecha, descripcion, importe, localizacion, pagar);
        this.tipoalmuerzo = tipoalmuerzo;
        this.plato1 = plato1;
        this.numasistentes = numasistentes;
        this.menuinfantil = menuinfantil;
        if (numasistentes>100) {
                super.importe *=1.15;
            }
      
    }

    public Tipo getTipoalmuerzo() {
        return tipoalmuerzo;
    }

    public void setTipoalmuerzo(Tipo tipoalmuerzo) {
        this.tipoalmuerzo = tipoalmuerzo;
    }

    public String getPlato1() {
        return plato1;
    }

    public void setPlato1(String plato1) {
        this.plato1 = plato1;
    }

    public int getNumasistentes() {
        return numasistentes;
    }

    public void setNumasistentes(int numasistentes) {
        this.numasistentes = numasistentes;
    }

    public int getMenuinfantil() {
        return menuinfantil;
    }

    public void setMenuinfantil(int menuinfantil) {
        this.menuinfantil = menuinfantil;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
    
    
}
