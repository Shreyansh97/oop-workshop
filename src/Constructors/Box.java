package Constructors;

class Box {
    double width;
    double height;
    double depth;

    Box(){
        System.out.println("Constructing Box");
        width=10;
        height=10;
        depth=10;
    }

    double volume(){
    	return width*height*depth;
    }
}
