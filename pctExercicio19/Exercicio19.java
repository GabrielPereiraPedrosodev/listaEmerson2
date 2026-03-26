package pctExercicio19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota;
		Scanner receba = new Scanner(System.in);
	    
		System.out.println("Digite sua nota");
		nota = receba.nextInt();
	
		
		if(nota>9) {
			System.out.println("Você está aprovado (ecelente)");
		}if(nota>=7) {
			System.out.println("Você está aprovado ");
		} else if((nota<7) && nota>5){
			System.out.println("Você está de recuperação ");
		} else {
				System.out.println("Você está reprovado");
		
		
		
		
		
		
		
		}
	}

}
