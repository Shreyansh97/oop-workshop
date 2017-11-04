class A{
	int i,j;
	show(){
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
}
class B extends A{
	int k;
	void show(){
		// super.show();
		System.out.pritnln("k = "+k);
	}
}
class SimpleInheritanceDemo{
	public static void main(String args[]){
		A sup = new A();
		B sub = new B();

		sup.i=5;
		sup.j=20;
		sub.k=30;
		sup.show();
		sub.show();

		// sub.i=50;
		// sub.j=100;
		// sub.k=500;
		// sub.show();
	}
}