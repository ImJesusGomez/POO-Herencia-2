package usuarioprincipal;

import java.io.*;

public class UsuarioPrincipal {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //Creamos un objeto tipo UsuarioEfectivo
        System.out.println("USUARIO EFECTIVO");
        System.out.println("Dame los datos del usuario");

        System.out.println("Nombre: ");
        String nombre1 = teclado.readLine();

        System.out.println("Edad");
        int edad1 = Integer.parseInt(teclado.readLine());

        System.out.println("Sexo (Masculino/Femenino)");
        String sexo = teclado.readLine();
        String masculino = "Masculino";
        
        boolean sexo1;

        if (sexo.equalsIgnoreCase(masculino)) {
            sexo1 = true;
        } else {
            sexo1 = false;
        }

        System.out.println("Cantidad de Pago:");
        double cantPago = Double.parseDouble(teclado.readLine());

        UsuarioEfectivo user = new UsuarioEfectivo(nombre1, edad1, sexo1, cantPago);
        System.out.println("Datos del usario:");
        System.out.println("Nombre: " + user.getNombre());
        System.out.println("Edad: " + user.getEdad());
        if (sexo1 == true) {
            System.out.println("Sexo Masculino");
        } else {
            System.out.println("Sexo Fememino");
        }

        System.out.println("Cantidad de Pago: " + user.getCantidadPago());

        user.pagar();
        
        System.out.println("----------------------------------------------------");

        //Creamos un objeto tipo UsuarioTarjeta
        System.out.println("USUARIO TARJETA");
        System.out.println("Dame los datos del usuario");

        System.out.println("Nombre: ");
        String nombre2 = teclado.readLine();

        System.out.println("Edad");
        int edad2 = Integer.parseInt(teclado.readLine());

        System.out.println("Sexo (Masculino/Femenino)");
        String newsexo = teclado.readLine();
        
        String newmasculino = "Masculino";
        boolean sexo2;
        
        if (newsexo.equalsIgnoreCase(newmasculino)) {
            sexo2 = true;
        } else {
            sexo2 = false;
        }

        System.out.println("Numero de tarjeta:");
        int numTarjeta = Integer.parseInt(teclado.readLine());

        UsuarioTarjeta newUser = new UsuarioTarjeta(nombre2, edad2, sexo2, numTarjeta);
        System.out.println("Datos del usario:");
        System.out.println("Nombre: " + newUser.getNombre());
        System.out.println("Edad: " + newUser.getEdad());
        if (sexo2 == true) {
            System.out.println("Sexo Masculino");
        } else {
            System.out.println("Sexo Fememino");
        }

        System.out.println("Cantidad de Pago: " + newUser.getNumeroTarjetaCredito());

        newUser.pagar();
    }
}
