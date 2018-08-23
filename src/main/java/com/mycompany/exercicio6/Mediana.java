package com.mycompany.exercicio6;

public class Mediana {
   
    public double getMediana(double[] numeros){
        if (numeros.length % 2 != 0) {
            return numeros[numeros.length/2];
        }
        
        return 0;
    }
}
