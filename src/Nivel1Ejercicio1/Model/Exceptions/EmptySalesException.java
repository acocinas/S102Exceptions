package Nivel1Ejercicio1.Model.Exceptions;

public class EmptySalesException extends Exception{
    public EmptySalesException(){
        super("Para hacer una venta primero tienes que añadir productos");
    }
}
