package com.mycompany.exercicio6;

import java.util.Arrays;

public class Mediana {
    
    public void verificVetor (double[] numeros) throws Exception {
        if (numeros == null || numeros.length <= 0) {
            throw new Exception();
        }
    }
    public double getMediana(double[] numeros) {
        Arrays.sort(numeros);
        if (numeros.length % 2 == 0) {
            return (numeros[numeros.length / 2] + numeros[numeros.length / 2 - 1]) / 2;
        } else {
            return numeros[numeros.length / 2];
        }
    }

    public double getMedia(double[] numeros) {
        return Arrays.stream(numeros).sum() / numeros.length;
    }

    public double getMenorValor(double[] numeros){
        Arrays.sort(numeros);
        return numeros[0];
    }

    public double getMaiorValor(double[] numeros) {
        Arrays.sort(numeros);
        return numeros[numeros.length -1];
    }

    public double getNumeroAcimaMedia(double[] numeros) {
        double media = getMedia(numeros);
        double acima = 0.0f;
        for (int i = 0; i < numeros.length; i++) {
            if (media < numeros[i]) {
                acima++;
            }
        }
        return acima;
    }

    public double getNumeroAbaixoMedia(double[] numeros){
        double media = getMedia(numeros);
        double abaixo = 0.0f;
        for (int i = 0; i < numeros.length; i++) {
            if (media > numeros[i]) {
                abaixo++;
            }
        }
        return abaixo;
    }

    public double getDesvioPadrao(double[] numeros){
        double media = getMedia(numeros);
        double somatoria = 0.0f;
        for (int i = 0; i < numeros.length; i++) {
            somatoria += Math.pow(numeros[i]-media, 2); 
        }
        return Math.sqrt(somatoria / (numeros.length-1));
    }

    public double getQntMaioresNumeros(double[] numeros) {
        int qnt = 0;
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeros[numeros.length -1 ])
                qnt ++;
        }
        return qnt;
    }

    public double getQntMenoresNumeros(double[] numeros) {
        int qnt = 0;
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeros[0])
                qnt ++;
        }
        return qnt;
    }
}
