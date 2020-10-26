/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocorte;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class EjercicioCorte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("n: ");
       int n = sc.nextInt();
       
       System.out.print("Cantidad productos: ");
       int cantidadProductos = sc.nextInt();
       
       PromocionDescuento pc = new PromocionDescuento(n,cantidadProductos);
       
       pc.pedirProductos();
       
       System.out.println("Total: " + pc.getTotal());
       System.out.println("Descuento: " + pc.getDescuento());
       System.out.println("Por pagar: " + pc.porPagar());
       

    }
    
}
