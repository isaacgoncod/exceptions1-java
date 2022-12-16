package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Main {

//	o Metodo main nao ira tratar o erro(forma muito ruim de tratar o erro);
	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Numero do Quarto: ");
		int number = scan.nextInt();

		System.out.print("Check-in data (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(scan.next());

		System.out.print("Check-Out data (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(scan.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("A data de check-out deve vir depois da data de check-in");
		}

		scan.close();
	}

}
