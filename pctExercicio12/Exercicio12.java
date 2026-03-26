package pctExercicio12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner receba = new Scanner(System.in);
	    
		System.out.println("Digite sua idade");
		idade = receba.nextInt();
	
		
		if(idade<12) {
			System.out.println("Você é criança");
		} else if(idade<17){
			System.out.println("Você é adolecente ");
		} else {
				System.out.println("Você é adulto");
		
		
		
		
		
		}
		

	}

}
