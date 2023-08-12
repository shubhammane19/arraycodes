import java.io.*;

class Divby5{

		public static void main(String[] args)throws IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter array size");
			
			int size = Integer.parseInt(br.readLine());
			
			int arr[] = new int[size];
			
			System.out.println("Enter array Elements");
				
			for(int i = 0; i<size; i++){
				
				arr[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("The elements divisible by 5 are:");
			for(int i=0; i<arr.length; i++){
				
				if(arr[i]%5==0){
					
					System.out.println(arr[i]+ " ");
				}
			}
			System.out.println();
		}

}