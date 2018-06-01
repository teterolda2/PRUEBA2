
import java.time.LocalDate;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Charanga extends Gasto {
    
    protected String lugar;
    protected int instrumentos;


    public Charanga(String lugar, int instrumentos, LocalDate fecha, String descripcion, double importe, String localizacion, boolean pagar) {
        super(fecha, descripcion, importe, localizacion, pagar);
        this.lugar = lugar;
        this.instrumentos = instrumentos;
        for (int i = 0; i < instrumentos; i++) {
           super.importe +=20;
        }
     
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(int instrumentos) {
        this.instrumentos = instrumentos;
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
