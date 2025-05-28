
public class Main
{
	public static void main(String[] args) {
		int arr[] = {45, 10, 77, 86, 05};
		int aux = 0;
		
		//laço para ordenar o array
		for(int i = 0; i < 5; i++){
		    for(int j = 0; j < 5; j++){
		        if(arr[i] < arr[j]){
		            aux = arr[i];
		            arr[i] = arr[j];
		            arr[j] = aux;
		        }
		    }
		}
		
		System.out.println("Array ordenado: ");
		for (int i = 0; i < 5; i++){
		    System.out.println(arr[i]);
		}
	}
}