import java.util.Scanner;

public class celsiusFahrenheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em celsius:");
		double celsius = scanner.nextDouble();
		
		double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
		
		System.out.print("A temperatura em fahrenheit é:" + fahrenheit);

	}

}