package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Esta clase permite gestionar el saldo, realizar ingresos y retiros,
 * y consultar el tipo de interés asociado a la cuenta.
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
    /**
     * Número de la cuenta bancaria.
     */
    private String cuenta;
    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;
    /**
     * Tipo de interés aplicado a la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros de la clase CCuenta.
     *
     * @param nombre Nombre del titular de la cuenta.
     * @param cuenta Número de la cuenta bancaria.
     * @param saldo Saldo inicial de la cuenta.
     * @param tipoInterés Tipo de interés aplicado a la cuenta.
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInterés) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInterés = tipoInterés;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre El nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de la cuenta bancaria.
     *
     * @return El número de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de la cuenta bancaria.
     *
     * @param cuenta El número de la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta.
     *
     * @param saldo El saldo actual.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     *
     * @return El tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés aplicado a la cuenta.
     *
     * @param tipoInterés El tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return El saldo actual.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     *
     * @param cantidad La cantidad a ingresar (debe ser mayor o igual a 0).
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad La cantidad a retirar (debe ser mayor que 0 y menor o igual al saldo).
     * @throws Exception Si la cantidad es negativa o mayor que el saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
