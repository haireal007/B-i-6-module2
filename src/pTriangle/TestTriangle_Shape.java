package pTriangle;

import java.util.Scanner;

public class TestTriangle_Shape {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("nhập 3 cạnh của tam giác:");
        double side1 = Integer.parseInt(input.nextLine());
        double side2 = Integer.parseInt(input.nextLine());
        double side3 = Integer.parseInt(input.nextLine());
        Triangle triangle = new Triangle(side1,side2,side3);
if(side1+side2>side3||side1+side3>side2||side3+side2>side1){
    System.out.println("chu vi tam giac: "+triangle.getPerimeter());
    System.out.println("dien tich tam giac: " + triangle.getArea());
}


    }
}
