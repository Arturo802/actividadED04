package cuentas;
/**
 * Clase principal para probar la clase CCuenta.
 * Esta clase contiene el método main, que es el punto de entrada de la aplicación,
 * y métodos para realizar operaciones de prueba con la clase CCuenta.
 */
public class Main {

    /**
     * Método principal de la aplicación.
     *
     * @param args Los argumentos de la línea de comandos en la main (no se utilizan).
     */
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: " + saldoActual);

        // Operaciones de ingreso y retiro
        operativa_cuenta(cuenta1, 2500);
        
        // Muestra el saldo final
        System.out.println("El saldo final es: " + cuenta1.estado());
    }

    /**
     * Método para realizar operaciones de ingreso y retiro en una cuenta.
     * @param cuenta La cuenta en la que se realizarán las operaciones.
     * @param cantidad La cantidad de dinero para las operaciones.
     */
    private static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            cuenta.retirar(cantidad);
            System.out.println("Retiro de " + cantidad + " realizado.");
        } catch (Exception e) {
            System.out.println("Error al retirar: ");
        }

        try {
            cuenta.ingresar(cantidad);
            System.out.println("Ingreso de " + cantidad + " realizado.");
        } catch (Exception e) {
            System.out.println("Error al ingresar: ");
        }
    }
}