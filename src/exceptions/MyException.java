class MyException extends Exception{
	public String toString(){
		return "This is my exception";
	}
}

class ExceptionDemo{
	static{
		System.out.println("In static");
	}
	public static void main(String args[]){
		System.out.println("In main");
		try{
			throwException();
			int a=0;
			int b=10/a;
		}catch(MyException myex){
			System.out.println(myex);
		}catch(ArithmeticException ae){
			System.out.println(ae);
		}
		finally{
			System.out.println("In finally block");
		}
	}
	static void throwException()throws MyException{
		throw new MyException();
	}
}