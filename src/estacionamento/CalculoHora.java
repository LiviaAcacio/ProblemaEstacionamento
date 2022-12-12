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
	
	int horaEntrada, minutoEntrada, horaSaida, minutoSaida, conta = 4;
	
	
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
		System.out.println("O valor a ser pago é: " + conta);
	} else if(calculoHora == 1 && calculoMinuto < 59){ //se for até 1h e 59m
		System.out.println("O valor a ser pago é: " +(conta + 2));
	} else if(calculoHora > 2 && calculoMinuto > 0 && calculoMinuto < 59) { //Se passar de 2h
		
		conta = (conta + 2) + (calculoHora -  2) * 1; 
		
		System.out.println("Após duas horas é cobrado R$6,00 +1 real por cada hora excedente.");
		System.out.println(conta);
  }
	sc.close();
  }

}
