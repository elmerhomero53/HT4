package com.company;

public abstract class Calculadora
        implements iCalculadora{
    static boolean INSTANCE_FLAG = false;


    /**
     * Se aplica el Singleton
     * @throws SingletonException
     */
    public Calculadora() throws SingletonException
    {
        if (INSTANCE_FLAG)
            throw new SingletonException("Solamente puede crear una instancia de Calculos.");
        else
            INSTANCE_FLAG = true; //set flag for 1 instance
    }

    public void finalize()
    {
        INSTANCE_FLAG = false; //clear if destroyed
    }

    @Override
    public double suma(double a, double b) {
        return a+b;
    }

    @Override
    public double resta(double a, double b) {
        return a-b;
    }

    public double multiplicar(double a, double b) {
        return a*b;
    }

    public double dividir(double a, double b) {
        if(b != 0) {
            return a/b;
        }
        else {
            return 0;
        }
    }
}
