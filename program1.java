import java.io.*;

class PrintSum{

	public static void main(String[] args)throws IOException{
		
		int sum = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of array");
		
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter array Element");
		
		for(int i = 0; i<size; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
			
			if(arr[i]%2 == 1){
				
				sum = sum +arr[i];
			}
		}
		System.out.println("Sum = " + sum);
	}
}