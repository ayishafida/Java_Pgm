/* Define a class 'product' with data members pcode, pname, and price. Create 3 objects of the class and find the product having the lowest price*/


class P01{
    int pcode;
    String pname;
    double price;
}
public class LowPrice{
    public static void main(String[] args) {
        P01 p1=new product();
        P01 p2=new product();
        P01 p3=new product();
        p1.pcode=101;
        p1.pname="TV";
        p1.price=15000;
        p2.pcode=102;
        p2.pname="Radio";
        p2.price=8000;
        p3.pcode=103;
        p3.pname="DVD";
        p3.price=10000;
       if ((p1.price<p2.price) && (p1.price<p3.price))
        {
            System.out.println("lowest price is : "+p1.price);
        }
        else if ((p2.price<p1.price) && (p2.price<p3.price))
        {
            System.out.println("lowest price is : "+p2.price);

        }
        else
        {
            System.out.println("lowest price is : "+p3.price);
        }   
    }
  }