class Complex{
	double real,img;
}
class P03{
	public static void main(String args[]){
		Complex c1= new Complex();
		Complex c2= new Complex();
		c1.real=2.5;
		c1.img=3;
		c2.real=4.6;
		c2.img=5.2;
		double sumr=c1.real+c2.real;
		double sumi=c1.img+c2.img;
		System.out.println("Sum is"+sumr+"+"+sumi+"i");
	}
}