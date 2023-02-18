package br.com.uniamerica.atividade02;

import java.text.DecimalFormat;

public class Subtracao implements Calculadora {
    public double calcular(double a, double b){

        double valor = a-b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return Double.valueOf(decimalFormat.format(valor).replace(",", "."));
    }
}
