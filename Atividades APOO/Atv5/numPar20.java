import java.util.Scanner;

public class numPar20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
    for(int i = 0; i <= 20; i++) {
    	if (i % 2 <= 0) {
    		System.out.print(" " + i + ",");
    	}
    }
	}

}