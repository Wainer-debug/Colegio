package edu.colegio.modelo;

public class Operaciones {

    private int numHijos = 0;
    private int precioMatri = 0;
    private int precioMensua = 0;
    private int precioSociedad = 0;
    private int totalDescuento = 0;
    private int totalPagar = 0;

    public Operaciones() {
    }


    public void opResultadoPagarSinDescuento() {
        this.totalPagar = (this.precioMatri + this.precioMensua + this.precioSociedad);
    }

    public void opResultadoPagarConDescuento() {
        if (this.numHijos >= 4) {
            this.totalDescuento = (int) (0.3 * this.totalPagar);
        } else if (this.numHijos == 3) {
            this.totalDescuento = (int) (0.25 * this.totalPagar);
        } else if (this.numHijos == 2) {
            this.totalDescuento = (int) (0.1 * this.totalPagar);
        } else if (this.numHijos == 1) {
            this.totalDescuento = (int) (0.0 * this.totalPagar);
        }
        
        this.totalDescuento = this.totalPagar - this.totalDescuento;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public int getPrecioMatri() {
        return precioMatri;
    }

    public void setPrecioMatri(int precioMatri) {
        this.precioMatri = precioMatri;
    }

    public int getPrecioMensua() {
        return precioMensua;
    }

    public void setPrecioMensua(int precioMensua) {
        this.precioMensua = precioMensua;
    }

    public int getPrecioSociedad() {
        return precioSociedad;
    }

    public void setPrecioSociedad(int precioSociedad) {
        this.precioSociedad = precioSociedad;
    }

    public int getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(int totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }

    
}
