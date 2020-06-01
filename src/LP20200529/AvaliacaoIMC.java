package LP20200529;


import java.util.Scanner;

import java.text.DecimalFormat;


public class AvaliacaoIMC {

	
	static float calculoIMCs (float pesos, float alturas) {
		float IMCs = pesos / (alturas * alturas);
		return IMCs;
			
	}
	
	static String diagnosticos (float IMCs) {
		
		String result = null;
		
		if(IMCs <= 18.5) 
			result = "Abaixo do peso";
	
			if(18.5 < IMCs && IMCs <= 24.9) 
				result = "Peso Nomal";
		
				if(25 <= IMCs && IMCs <= 29.9) 
					result = "Acima do peso ou com Sobrepeso";
			
					if(30 <= IMCs && IMCs <= 34.9)
						result = "Obesidade (Grau I)";
					
						if(35 <= IMCs && IMCs <= 39.9)
							result = "Obesidade severa (Grau II)";
					
							if(IMCs >= 40)
								result = "Obesidade mórbida (Grau III)";
								
					return result;
				}				
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("0.00");
	
		
		Scanner infos = new Scanner(System.in);
		
		int tam = 60;
		String[] pacientes = new String[tam];
		float[] pesos = new float[tam];
		float[] alturas = new float[tam];
		float[] IMCs = new float[tam];
		String[] diagnosticos = new String[tam];
		
		
		System.out.println("O Índice de Massa Corporal (IMC) é o parâmetro adotado pela Organização Mundial de Saúde "
				+ "para calcular o peso ideal de cada indivíduo. \n"
				+ "Este sistema tem a capacidade de calcular o IMC de até 60 pacientes e gerar um relatório com seus "
				+ "respectivos diagnósticos. \n" 
				+ "Para isto, basta preencher os dados dos pacientes pedidos a seguir.");
		
		
		System.out.println(" ");
		
		
		
		for(int i=0; i<tam; i++) {
			
			System.out.println("Cadastre aqui o nome da " + (i+1) + "ª pessoa: ");
			pacientes[i] = infos.next();			
		}
		
		
		
		for(int i=0; i<tam; i++) {
			
			System.out.println(" ");
			
			System.out.println("Digite o peso da " + (i+1) + "ª pessoa: ");
			pesos[i] = infos.nextFloat();
			
			System.out.println("Digite a altura da " + (i+1) + "ª pessoa: ");
			alturas[i] = infos.nextFloat();
		}
		
		
		
		for(int i=0; i<tam; i++) {
			IMCs[i] = calculoIMCs(pesos[i], alturas[i]);
								
		}
		
	
		for(int i=0; i<tam; i++) {
			diagnosticos[i] = diagnosticos(IMCs[i]);
			
		}
		
		
		System.out.println(" ");
		
		System.out.println("  -------------- RELATÓRIO DE SAÚDE DAS PESSOAS AVALIADAS --------------  ");
			
		System.out.println(" ");
		
			for(int i = 0; i<tam; i++) {
				
				System.out.println((i+1) + "ª Pessoa: " + pacientes[i] + " -> Peso: " + pesos[i] + 
						" | IMC: " + df.format(IMCs[i]) + "kg/m2" + " | Diagnóstico: " + diagnosticos[i]);
						
				
			}

	  }

}
