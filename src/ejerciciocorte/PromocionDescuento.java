
package ejerciciocorte;

import java.util.Scanner;

public class PromocionDescuento{
    //ATRIBUTOS
    private int n; //cada cuanto se aplica el descuento
    private int cantidadProductos;
    private int total;
    private int descuento;
    private float porcentajeDescuento = 0.20f; //20 / 100 = 0.20 * producto
    
    private int contador = 1;

    //CONSTRUCTOR
    public PromocionDescuento(int n, int cantidadProductos) {
        this.n = n;
        this.cantidadProductos = cantidadProductos;
    }
    
    //METODOS
    
    public void aplicarDescuento(int precioProducto){
        float productoConDescuento = 0;
        if (this.porcentajeDescuento >= 0.05) {
            productoConDescuento = precioProducto * this.porcentajeDescuento;
            this.descuento += Math.floor(productoConDescuento);
        }else{
            this.descuento += precioProducto;
            System.out.println("no mas descuento");
        }

        if (this.contador >= this.n) {
            this.porcentajeDescuento /= 2;
            this.contador = 1;
        }
        else{
            this.contador++;
        }
        System.out.println("El descontado: " + Math.floor(productoConDescuento));
    }
    
    public void pedirProductos(){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= this.cantidadProductos; i++) {
            System.out.print("Precio producto " + i + ": ");
            int costo = sc.nextInt();
            aplicarDescuento(costo);
            this.total += costo;
        }
    }
    
    public int porPagar(){
        int pagoConDescuento = this.total - this.descuento;
        return pagoConDescuento;
    }
    
    
    //ENCAPSULAMIENTO
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public int getTotal() {
        return total;
    }

    public int getDescuento() {
        return descuento;
    }
    
    
    
}
