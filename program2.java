import java.io.*;

class EvenProd{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array size");
		
		int size = Integer.parseInt(br.readLine());
		
		int arr[]= new int[size];
		int prod = 1;
		
		System.out.println("Enter array elements");
		
		for(int i = 0; i<arr.length; i++){
			
			arr[i] = Integer.parseInt(br.readLine());
			
			if(arr[i]%2 == 0){
				
			prod = prod*arr[i];
		}
	}
	System.out.println("Output = "+ prod);
}
}