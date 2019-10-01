class VolumeOfBox
{
	double width;
	double height;
	double depth;
	public static void main(String[] args)
	{
		
		VolumeOfBox b = new VolumeOfBox(2.4,3.4,5.6);
		double volume = b.volumeOfBox(); 
		System.out.println("volume of box is "+volume);
	}
	
	//initializing the instance variables
 	public VolumeOfBox(double width,double height,double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	
	}
	
	//caluculating the volume of box
	public double volumeOfBox()
	{
		double volume = width*height*depth;
		return volume;
	}
}
