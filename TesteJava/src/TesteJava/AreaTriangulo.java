package TesteJava;
import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[]args) {
		double x;
		double y;
		double A;
	Scanner l = new Scanner(System.in);
	System.out.println("Area do triangulo.");
	System.out.println("digite o primeiro cateto: ");
	x = l.nextDouble();
	System.out.println("digite o segundo cateto: ");
	y = l.nextDouble();
	CalculaArea.calcula = new CalculaArea();
	A = CalculaArea.calcula(x,y);
	System.out.printf("Area=  %.2f %n", A);
	
	}
	

}
