package com.sathya.jdbc;

import java.util.List;

public class ProductMain1 {

	public static void main(String[] args) {
		ProductDao dao=new ProductDao();
		//table Creation
		int createResult=dao.createProducttable();
		System.out.println("table creation statuse.."+createResult);
	}

}
class ProductMain2{
public static void main(String[] args) {
 ProductDao dao=new ProductDao();
 product product1=new product();
 product1.setProId("Pd2450");
 product1.setProName("sugar");
 product1.setProPrice(234.7);
 int result=dao.saveProduct(product1);
 if(result==1) {
  System.out.println("Data inserted successfully...."+result);
 }
 else
 {
  System.out.println(" Data insertion fail check once....."+result);
 }
}
}
class ProductMain3{
public static void main(String[] args) {
 ProductDao dao=new ProductDao();
 product product2=new product();
 product2.setProId("Pd2467");
 product2.setProName("salt");
 product2.setProPrice(278.7);
 int result=dao.saveProduct(product2);
 if(result==1) {
  System.out.println("Data inserted successfully...."+result);
 }
 else
 {
  System.out.println(" Data insertion fail check once....."+result);
 }
}
}
class ProductMain4{
public static void main(String[] args) {
 ProductDao dao=new ProductDao();
 product product3=new product();
 product3.setProId("Pd2678");
 product3.setProName("rice");
 product3.setProPrice(260.7);
 int result=dao.saveProduct(product3);
 if(result==1) {
  System.out.println("Data inserted successfully...."+result);
 }
 else
 {
  System.out.println(" Data insertion fail check once....."+result);
 }
   }
}
   class ProductMain5{
     public static void main(String[]args) {
      ProductDao dao = new ProductDao();
      product product = dao.findById("Pd2450");
      if(product!=null) {
       System.out.println("product available..");
       System.out.println(product.getProId()+" "+product.getProName()+" "+product.getProPrice());
      }
      else {
       System.out.println("product not available...");
      }
     
     }
    }
   class ProductMain6{
    public static void main(String[] args) { 
     ProductDao dao = new ProductDao();
     List<product> products = dao.findAll();
     products.forEach(product->System.out.println(product));
    }
   }
   
   class ProductMain7{
     public static void main(String[] args) { 
      ProductDao dao = new ProductDao();
      int count = dao.updateProduct(200, 5);
      System.out.println("updated records count.."+count);
     }
    }
   class ProductMain8 {
    public static void main(String[] args) { 
     ProductDao dao = new ProductDao();
     int count = dao.deleteProductById("Pd2450");
     System.out.println("delete records count.."+count);
    }
   }
   class ProductMain9 {
    public static void main(String[] args) { 
     ProductDao dao = new ProductDao();
     int count = dao.deleteProductByPrice(200);
     System.out.println("delete records count.."+count);
    }
   }
   class ProductMain10 {
    public static void main(String[] args) { 
     ProductDao dao = new ProductDao();
     int count = dao.droptable();
     System.out.println("Table is dropped status...."+count);
    }
   }
   
   


