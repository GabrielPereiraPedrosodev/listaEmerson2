package pctExercicio24;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner receba = new Scanner(System.in);
	    
		System.out.println("Digite ");
		idade = receba.nextInt();
	
		
		if(idade== 20) {
			System.out.println("Sua idade é maior que 60 é pode usar a fila prioritaria");
		}else if (idade== 10)  {
			System.out.println("Sua idade é menor que 10 é pode usar a fila prioritaria");
		}else {
				System.out.println("Sua idade é maior de 10 , porem menor que 60 , então não podera usar a fila prioritaria");
		
		
		
		
		
		
		}

	}

}
