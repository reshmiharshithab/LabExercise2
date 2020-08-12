package labexercise2;
import java.io.*;
class book
{
String name;
Author author;
double price;
int qty=0;
book(String n,Author au,double p)
{
name=n;
price=p;
author=au;

}
book(String n,Author au,double p,int q)
{
name=n;
price=p;
author=au;
qty=q;
}
String getName()
{
return name;
}
Author getAuthor()
{
return author;
}
double getPrice()
{
return price;
}
void setPrice(int p1)
{
price=p1;
}
int getQty()
{
return qty;
}
void setQty(int q)
{
qty=q;
}
public String toString()
{
return "Book Name : "+name+" Author :"+author+" Price : "+price+" Quantity : "+qty;
}
}
class Author
{
String name;
String gender;
String email;
Author(String n,String g,String e)
{
name=n;
gender=g;
email=e;
}
public String toString()
{
return "Name : "+name+"  Email : "+email+" Gender : "+gender;
}
public static void main(String args[])
{


Author a1=new Author("AAA","F","Gmail");
System.out.println("Authors :\n"+a1);

book in =new book("BBB",a1,100);
book in2 =new book("DDD",a1,200,2);

System.out.println("\nAuthor info  :\n");
System.out.println(in.getAuthor());
System.out.println("Written books : "+in.getName());

System.out.println("\nAuthor info  :\n"+in2.getAuthor());
System.out.println("Written books : "+in2.getName());
}

}