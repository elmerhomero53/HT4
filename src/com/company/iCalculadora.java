/**
 * Esta clase es la interface de nuestra clase calculadora
 * @author Daniela Batz
 * @author Jose Ramos
 */
public interface iCalculadora{
    /**
     * Este parametro devuelve la suma de dos enteros
     */
    public double suma(double a, double b);
    /**
     * Este parametro devuelve la resta de dos enteros
     */
    public double resta(double a, double b);

    /**
     * Este parametro devuelve la multiplicación de dos numeros double
     */
    public double multiplicacion(double a, double b);

    /**
     * Este parametro devuelve la division de dos double
     */
    public double division(double a, double b);
}
