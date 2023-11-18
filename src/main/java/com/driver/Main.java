package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int x = p.product(10,20);
        int y = p.product(20,50,30);
        double z = p.product(5.6, 8.9);

        System.out.println(x+" "+y+" "+z);
    }
    public static class Product{
        public int product(int x, int y)
        {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }

    }
}