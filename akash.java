

public class rectangle {
	//area = length * breatdth
	//perimeter = 2 * (length + breadth)
//2)	Write a java program to calculate the area and perimeter of a Circle / Rectangle / Square. (Use constructor)	
	int length;
	int breadth;
	public rectangle()
	{}
	
	rectangle (int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void area()
	{
		System.out.println("The area of rectangle is:"+ length * breadth);
	}
	void perimeter()
	{
		System.out.println("The perimeter of rectangle"+ 2*(length+breadth));
	}

	public static void main(String[] args) {
		rectangle r = new rectangle (2, 4);
		r.area();
		r.perimeter();

	}

}

