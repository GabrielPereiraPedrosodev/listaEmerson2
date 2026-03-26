package pctExercicio20;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner receba = new Scanner(System.in);
	    
		System.out.println("Digite sua idade");
		idade = receba.nextInt();
	
		
		if(idade>=65) {
			System.out.println("Sua idade é maior que 65 é pode se aposentar");
		}else if (idade<18)  {
			System.out.println("Sua idade é menor que 18 é não pode se aposentar");
		}else {
				System.out.println("Sua idade é maior que 18 porem menor que 65");
		
		
		
		
		
		}

	}

}
