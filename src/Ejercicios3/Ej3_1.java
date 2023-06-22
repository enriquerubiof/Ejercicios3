package Ejercicios3;

import java.util.Scanner;

public class Ej3_1
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el número a calcular:");
		int num = teclado.nextInt();
		
		while (num < 1 || num > 10)
		{
			System.out.println("El número debe ser entero entre 1 y 10:");
			num = teclado.nextInt();
		}
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(num + " * " + i + " = " + num * i);
		}
		teclado.close();
	}

}
