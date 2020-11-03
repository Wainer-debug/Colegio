package edu.colegio.controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import edu.colegio.modelo.Operaciones;

@Named(value = "calcularSession")
@SessionScoped
public class calcularSession implements Serializable {

    private Operaciones objOp = new Operaciones();
    
    public calcularSession() {
    }
    
    public void resultadoPagarSin() {
        objOp.opResultadoPagarSinDescuento();
    }
    
    public void resultadoPagarCon() {
        objOp.opResultadoPagarConDescuento();
    }
    
    public Operaciones getObjOp() {
        return objOp;
    }

    public void setObjOp(Operaciones objOp) {
        this.objOp = objOp;
    }
    
}
