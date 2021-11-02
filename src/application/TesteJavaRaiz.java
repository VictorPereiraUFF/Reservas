package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Horario;
import entities.HorarioResort;

public class TesteJavaRaiz {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Horario> list = new ArrayList <>();
		
		System.out.println("Quantas reservas serão feitas?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Resort ou Hotel?");
			
			char ch = sc.next().charAt(0);
			System.out.print("Digite seu nome: ");
			sc.nextLine();
			String Nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Número do quarto: ");
			int quarto = sc.nextInt();
			System.out.print("Data de entrada: ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data de saída: ");
			Date checkOut = sdf.parse(sc.next());
			System.out.println("Qual o valor da reserva?");
			double valorReserva = sc.nextDouble();
			if (ch == 'R') {
				System.out.println("Qual o valor do resort?");
				double valorResort = sc.nextDouble();
				list.add(new HorarioResort(Nome, quarto, checkIn, checkOut, valorReserva, valorResort));
			}
			else {
				list.add(new Horario(Nome, quarto, checkIn, checkOut, valorReserva));
			}
			
			System.out.println();
			System.out.println("Reservas: ");
			for (Horario H : list) {
				System.out.println(H.getNome() + ", Quarto: " + H.getQuarto() + ", Entrada: " + H.getCheckIn() + ", Saída: " + H.getCheckOut());
				System.out.println("Valor a ser pago: R$" + String.format("%.2f", H.conta()));
			}
			
		}
		
		sc.close();
	}

}
