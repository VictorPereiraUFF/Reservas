package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import reserva.Reserva;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		try {
			System.out.print("Digite o número do quarto a ser reservado: ");
			int numeroQuarto = sc.nextInt();
			System.out.print("Digite a data de entrada da reserva: ");
			Date dataEntrada = sdf.parse(sc.next());
			System.out.print("Digite a data de saída da reserva: ");
			Date dataSaida = sdf.parse(sc.next());
			System.out.println();
			
			Reserva reserva = new Reserva(numeroQuarto, dataEntrada, dataSaida);
			
			System.out.println("Você deseja atualizar sua reserva? ");
			System.out.print("Digite 1 para sim e 0 para não: ");
			int resposta = sc.nextInt();
			
			if (resposta == 1) {
				System.out.print("Digite a nova data de entrada: ");
				Date dataEntradaAtualizada = sdf.parse(sc.next());
				System.out.print("Digite a nova data de saída: ");
				Date dataSaidaAtualizada = sdf.parse(sc.next());
				
	
				reserva.atualizarReserva(dataEntradaAtualizada, dataSaidaAtualizada);
				System.out.println("Dados da reserva atualizada: " + reserva);
				System.out.println("Aproveite a sua estadia!");
	
			}
	
			else {
				System.out.println("Dados da reserva: " + reserva);
				System.out.println("Aproveite a sua estadia!");
			}
		}
		catch (ParseException e) {
			System.out.println("Erro: data inválida!");
		}
		
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
