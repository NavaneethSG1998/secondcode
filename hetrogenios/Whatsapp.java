class Whatsappv1 
{
	void status()
	{
      System.out.println("able to uplod send phots");
	}
}
class Whatsappv2 extends whatsappv1
{
	void appale()
	{
		System.out.println("able to uplod send photo,video,mog,gif,song");
	}
}
class Mainclass
{
    public static void main(String[] args) 
	{
		System.out.println("aaaaaaaaaaaa");
		Whatsappv1 x =new Whatsappv2();
			x.status();
			/*System.out.println("bbbbbbbbb");
           Whatsappv1 c=(Whatsappv1)x;
			c.appale();
			c.status();*/
	}
}
