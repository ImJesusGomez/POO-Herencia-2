package usuarioprincipal;

public class UsuarioTarjeta extends Usuario{
    
    //Atributos
    private int numeroTarjetaCredito;
    
    //Constructor
    public UsuarioTarjeta(String nombre, int edad, boolean sexo, int numeroTarjetaCredito){
        super(nombre, edad, sexo);
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }
    
    //Metodos 
    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }
    
    public void pagar(){
        System.out.println("Pagando con tarjeta de credito");
    }
    
}
