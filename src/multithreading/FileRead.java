import java.io.*;
import java.util.*;
class Read implements Runnable{
	Thread t;
	BufferedReader br;
	ArrayList<String> inputs;
	static boolean turn=false;
	boolean val;
	Read(BufferedReader br,boolean val,String name){
		this.br=br;
		this.val=val;
		inputs = new ArrayList<String>();
		t=new Thread(this,name);
		t.start();
	}
	public void run(){
		while(true){
			synchronized(br){
				while(val==turn){
					try{
						br.wait();
					}catch(InterruptedException ie){}
				}
				try{
					String read = br.readLine();
					if(read==null){
						turn=val;
						br.notify();
						break;
					}
					inputs.add(read);
					turn=val;
					br.notify();
				}catch(Exception e){}
			}
		}
	}
}
class FileRead{
	public static void main(String args[])throws Exception{
		File f=new File("readme.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		Read r1=new Read(br,true,"First");
		Read r2=new Read(br,false,"Second");
		try{
			r1.t.join();
			r2.t.join();
			System.out.println("Thread 1 reads:-");
			display(r1.inputs);
			System.out.println("Thread 2 reads:-");
			display(r2.inputs);
		}catch(InterruptedException e){}
	}
	static void display(ArrayList<String> arr){
		int l=arr.size();
		for(int i=0;i<l;i++)
			System.out.println(arr.get(i));
	}
}