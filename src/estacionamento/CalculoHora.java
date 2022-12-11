package estacionamento;

import java.util.Scanner;

public class CalculoHora {

	public static void main(String[] args) {
	
//		13. Construa um algoritmo para calcular o valor a ser pago pelo período de estacionamento do
//		automóvel (PAG). O usuário entra com os seguintes dados: hora (HE) e minuto (ME) de entrada,
//		hora (HS) e minuto (MS) de saída. Sabe-se que este estacionamento cobra hora cheia, ou seja, se
//		passar um minuto ele cobra a hora inteira. O valor cobrado pelo estacionamento é:
//		•R$ 4,00 para 1 hora de estacionamento
//		•R$ 6,00 para 2 horas de estacionamento
//		•R$ 1,00 por hora adicional (acima de 2 horas)
	
	Scanner sc = new Scanner(System.in);
	
	int horaEntrada, minutoEntrada, horaSaida, minutoSaida;
	
	
	//Essas validações também podem ser feitas com if mas o wihile ajuda a encutar o cdógio e o processamento 
	System.out.println("Informe a hora de entrada: ");
	horaEntrada = sc.nextInt();
	while (horaEntrada > 23 || horaEntrada < 0) {
		System.out.println("Digite uma hora válida");

		System.out.println("Informe a hora de entrada: ");
		horaEntrada = sc.nextInt();
	}

	System.out.println("Informe o minuto de entrada: ");
	minutoEntrada = sc.nextInt();
	while (minutoEntrada > 59 || minutoEntrada < 0) {
		System.out.println("Digite um minuto válido");

		System.out.println("Informe o minuto de entrada: ");
		horaEntrada = sc.nextInt();
	}

	System.out.println("Informe a hora de saída: ");
	horaSaida = sc.nextInt();
	while (horaSaida > 23 || horaSaida < 0) {
		System.out.println("Digite uma hora válida");

		System.out.println("Informe a hora de saída: ");
		horaEntrada = sc.nextInt();
	}

	System.out.println("Informe o minuto de saída: ");
	minutoSaida = sc.nextInt();
	while (minutoSaida > 59 || minutoSaida < 0) {
		System.out.println("Digite uma hora válida");

		System.out.println("Informe o minuto de saída: ");
		horaEntrada = sc.nextInt();
	}
	
	int calculoHora = Math.abs(horaSaida - horaEntrada);
	int calculoMinuto = Math.abs(minutoSaida - minutoEntrada);
	
	if(calculoHora ==  0 && calculoMinuto > 0) { //se forem apenas alguns minutos
		System.out.println("4");
	} else if(calculoHora == 1 && calculoMinuto < 59){ //se for até 1h e 59m
		System.out.println("4");
	} else if(calculoHora > 1 ) { //Se passar de 1h
		System.out.println("6");
	} else if(calculoHora > 2) { //Se passar de 2h
		int horaMais = 6 + 1;
		System.out.println("Após duas horas é cobrado 6h +1 real por cada hora a mais.");
		System.out.println(horaMais);
  }
	sc.close();
  }

}
