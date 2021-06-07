class Product{
	int pcode;
	String pname;
	double price;
	}
class P01{
	public static void main(String args[]){
		Product p1= new Product();
		Product p2= new Product();
		Product p3= new Product();
		p1.pcode=001;
		p1.pname="soap";
		p1.price=20.00;
		p2.pcode=002;
		p2.pname="mop";
		p2.price=70.00;
		p3.pcode=001;
		p3.pname="brush";
		p3.price=30.00;
		if(p1.price<p2.price && p1.price<p3.price){
			System.out.println("Soap has the lowest price");
		}
		else if(p2.price<p3.price && p2.price<p1.price){
			System.out.println("Mop has the lowest price");
		}
		else{
			System.out.println("brush has the lowest price");
		}
	}
}