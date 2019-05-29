import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraIMC {
	public static void main(String[] args) {
		double peso, altura, imc;
		Scanner leia = new Scanner(System.in);
		// a linha abaixo configura o separador
		// formatando no java para mostrar uma casa decimal
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.print("Digite o peso");
		peso = leia.nextDouble();
		System.out.print("Digite a altura");
		altura = leia.nextDouble();
		imc = peso / (altura * altura);
		System.out.println("IMC:" + formatador.format(imc));
        // Para criar um intervalo usamos o operador AND (&&)
		if (imc < 18.5) {
			System.out.println("ABAIXO DO PESO");
		}else if (imc >= 18.5 && imc < 25) {
			System.out.println("PESO NORMAL");	
		}else if (imc < 25 && imc < 30) {
				System.out.println("ACIMA DO PESO");
		}else {
			
				System.out.println("OBESO");
		leia.close();
	}

}

}






