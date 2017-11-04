interface A{
	void meth1();
	void meth2();
}

interface B extends A{
	void meth3();
}

class C implements B{
	public void meth1(){
		System.out.println("Meth1");
	}
	public void meth2(){
		System.out.println("Meth2");
	}
	public void meth3(){
		System.out.println("Meth3");
	}
}

class InterfaceExtendsDemo{
	public static void main(String args[]){
		C ob=new C();
		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}