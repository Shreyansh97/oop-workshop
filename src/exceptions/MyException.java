class MyException extends Exception{
	public String toString(){
		return "This is my exception";
	}
}

class ExceptionDemo{
	public static void main(String args[]){
		try{
			throw new MyException();
		}catch(MyException myex){
			System.out.println(myex);
		}finally{
			System.out.println("In finally block");
		}
	}
}