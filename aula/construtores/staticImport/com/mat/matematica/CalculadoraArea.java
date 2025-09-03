package com.mat.matematica;


public class CalculadoraArea {

   public static final double PI = 3.14;

   public static double calcularArealCirculo(double raio) {
	return raio * raio * CalculadoraArea.PI;
    }

    public static double calcularAreaQuadrado(double mediaDoLado) {

	return mediaDoLado * mediaDoLado;


    }
}