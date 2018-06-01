/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
import java.util.*;
/**
 *
 * @author alumno
 */
public class Gasto implements Pagado {
    protected LocalDate fecha;
    protected String descripcion;
    protected double importe;
    protected String localizacion;
    protected boolean pagar=false;

    public Gasto(LocalDate fecha, String descripcion, double importe, String localizacion, boolean pagar) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.importe = importe;
        this.localizacion = localizacion;
        this.pagar = pagar;
        
        if (pagar==true){
            importe=0;
        }
        
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

    @Override
    public void pagar() {
        pagar=true;
        importe=0;
    }

    @Override
    public String toString() {
        return " Fecha del evento: " + fecha + "\n Descripcion del evento: " + descripcion + "\n Importe=" + importe + "\n Localizacion del evento: " + localizacion + "\n Pagado: " + (pagar?"Si":"No");
    }
    
    
    
}
