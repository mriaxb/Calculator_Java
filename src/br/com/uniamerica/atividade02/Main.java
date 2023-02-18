package br.com.uniamerica.atividade02;

public class Main {
    public static void main(String args[]){
        Soma soma = new Soma();
        System.out.println("soma = " + soma.calcular(2.2, 2.0));

        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println("multiplicação = " + multiplicacao.calcular(2.2, 2.0));

        Subtracao subtracao = new Subtracao();
        System.out.println("subtração = " + subtracao.calcular(2.2, 2.0));

        Divisao divisao = new Divisao();
        System.out.println("divisão = " + divisao.calcular(2.2, 2.0));
    }
}
