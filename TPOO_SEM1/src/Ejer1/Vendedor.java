
package Ejer1;

/**
 *
 * @author UPN
 */
public class Vendedor {
    //Atributos
    String Nombre;
    double SueldoBase;
    double Venta1;
    double Venta2;
    double Venta3;
    //Metodos
    double CalculoComision(){
    return (Venta1+Venta2+Venta3)*0.10;
    }
    double CalculoSueldoTotal(){
    return SueldoBase+CalculoComision();
    }
    String MostrarInformacion(){
        return "Nombre: "+Nombre+
                "\nSueldo Base: "+SueldoBase+
                "\nVenta N°1: "+Venta1+
                "\nVenta N°2: "+Venta2+
                "\nVenta N°3: "+Venta3+
                "\nComisión: "+CalculoComision()+
                "\nSueldo Total: "+CalculoSueldoTotal();
    }
}
