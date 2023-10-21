
package usuarioprincipal;

public class UsuarioEfectivo extends Usuario{
    
    //Atributos
    private double cantidadPago;
    
    //Constructor
    public UsuarioEfectivo(String nombre, int edad, boolean sexo, double cantidadPago){
        super(nombre, edad, sexo);
        this.cantidadPago = cantidadPago;
    }
    
    //Metodos
    public double getCantidadPago() {
        return cantidadPago;
    }

    public void setCantidadPago(double cantidadPago) {
        this.cantidadPago = cantidadPago;
    }
    
    public void pagar(){
        System.out.println("Pagando en efectivo");
    }
    
}
