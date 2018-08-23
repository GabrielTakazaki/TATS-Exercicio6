package com.mycompany.exercicio6;

public class Mediana {
   
    public double getMediana(double[] numeros) throws Exception{
        if (numeros == null || numeros.length <= 0) {
            throw new Exception();
        }
        else if (numeros.length % 2 != 0) {
            return numeros[numeros.length/2];
        }
        
        return 0;
    }
}
