package com.driver;

class Product{
    public int product(int x, int y) {
        return x*y;
    }
    public int product(int x, int y, int z){
        return x*y*z;
    }
    public double product(double x, double y) {
        return x*y;
    }
}
public class Main {
    public static void main(String[] args) {
        Product p1=new Product();
        int result1=p1.product(2,3);
        int result2=p1.product(2,3,5);
        double result3=p1.product(4.5,2.5);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}