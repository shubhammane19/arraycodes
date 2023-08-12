import java.io.*;

class VowelsDemo{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char arr[] = new char[7];
		
		System.out.println("Enter 7 elements");
		for(int i = 0; i<arr.length; i++){
			
			arr[i] = (char)br.read();
			br.skip(2);
		}
		System.out.println("Output :");
		for(int i = 0; i<arr.length; i++){
			
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
				
				System.out.println(arr[i] + " ");
			}
		}
	}
}