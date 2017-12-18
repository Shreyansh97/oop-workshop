import java.io.*;
class Demo{
	public static void main(String args[]){
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		try{
			String s=br.readLine();
			int a=0;
			int b=10;
			int c=b/a;
		}catch(IOException e){
			System.out.println("IO Exception");
		}catch(ArithmeticException ae){
			System.out.println("ArithmeticException");
		}catch(Exception e){
			System.out.println("Some general Exception");
		}
	}
}