
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
public class Grupo extends Gasto {
    protected int componentes;
    protected Estilo estilo;
  
            
    public enum Estilo {Rock,Pop,Soul,Funky}

    public Grupo(int componentes, Estilo estilo, LocalDate fecha, String descripcion, double importe, String localizacion, boolean pagar) {
        super(fecha, descripcion, importe, localizacion, pagar);
        this.componentes = componentes;
        this.estilo = estilo;
        if (estilo==Estilo.Soul) {
              super.importe*=1.1;
            }
     
    }

    public int getComponentes() {
        return componentes;
    }

    public void setComponentes(int componentes) {
        this.componentes = componentes;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
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
