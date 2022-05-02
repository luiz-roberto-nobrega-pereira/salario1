package aulasalario;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
					
		System.out.println("Informe o seu salário atual: ");
		double salarioAtual = sc.nextDouble();
		double novoSalario = salarioAtual + (salarioAtual*5/100);
		if(salarioAtual <= 1212) {
			System.out.printf("Seu novo salário vai ser de R$ %.2f",novoSalario);
			
		}
		else if(salarioAtual <= 2212) {
			System.out.printf("Seu novo salário vai ser de R$ %.2f",novoSalario);
						
		}
		else {
			System.out.printf("Seu novo salário vai ser de R$ %.2f",novoSalario);
			
		}
		
		sc.close();

	}

}
