class Box
{
	double width;
	double height;
	double depth;
	Box() 
	{
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	Box(double w, double h, double d)
	{
		System.out.println("Constructing Box");
		width = w;
		height = h;
		depth = d;
	}
	Box(Box b) 
	{
		System.out.println("Constructing Box");
		width = b.width;
		height = b.height;
		depth = b.depth;
	}
	double volume()
	{
		return width * height * depth;
	}
	protected void finalize()
	{
		System.out.println("Box Destroyed");
	}
}
class BoxDemo3
{
	public static void main(String args[])
	{
		Box mybox1 = new Box();
		Box mybox2 = new Box(3, 6, 9);
		Box mybox3 = new Box(mybox1);
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		vol = mybox3.volume();
		System.out.println("Volume is " + vol);
	}
}
