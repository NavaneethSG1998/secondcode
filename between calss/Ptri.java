class sample
{
	void sec(int b,int h)
	{
		double area=0.5*b*h;
        System.out.println(area);
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		 s.sec(6,6);

	}
}
