package PTB12;

import java.util.Scanner;

public class PTB12 {
	public static void PhuongTrinhBac1() {
	     System.out.println("\nPHUONG TRINH BAC 1");
	     double a, b;
	     Scanner kb = new Scanner(System.in);
	     System.out.println("Nhap a: ");
	     a=kb.nextDouble();
	     System.out.println("Nhap b: ");
	     b=kb.nextDouble();
	     if (a==0) {
	         System.out.println("Vo nghiem");
	     }
	     else {
	         double x;
	         x=-b/a;
	         System.out.println("x = "+x);
	     }
	 }
	 public static  void PhuongTrinhBac2() {
	     System.out.println("\nPHUONG TRINH BBAC 2");
	     double a, b, c;
	     Scanner kb = new Scanner(System.in);
	     System.out.println("Nhap a: ");
	     a=kb.nextDouble();
	     System.out.println("Nhap b: ");
	     b=kb.nextDouble();
	     System.out.println("Nhap c: ");
	     c=kb.nextDouble();
	     if (a==0) {
	         if (b==0) {
	             System.out.println("Vo nghiem");
	         }
	         else {
	             System.out.println("Phuong trinh tro thanh phuong trinh bac 1.");
	             double x1;
	             x1=-c/b;
	             System.out.println("x = "+x1);
	         }
	     }
	     else {
	         double delta=b*b-4*a*c;
	         if (delta<0) {
	             System.out.println("Vo nghiem");
	         }
	         else if (delta==0) {
	             double x1=(-b)/(2*a);
	             System.out.println("Nghiem kep x1 = x2 = "+x1);
	         }
	         else if (delta>0) {
	             double x1, x2;
	             x1=(-b+Math.sqrt(delta))/(2*a);
	             x2=(-b-Math.sqrt(delta))/(2*a);
	             System.out.println("x1 = "+x1+"\nx2 = "+x2);
	         }
	     }
	 }
	 public static void HePhuongTrinh2An() {
	     System.out.println("\nHE PHUONG TRINH 2 AN");
	     double a1, a2, b1, b2, c1, c2;
	     Scanner kb = new Scanner(System.in);
	     System.out.println("Nhap a1: ");
	     a1=kb.nextDouble();
	     System.out.println("Nhap b1: ");
	     b1=kb.nextDouble();
	     System.out.println("Nhap c1: ");
	     c1=kb.nextDouble();
	     System.out.println("Nhap a2: ");
	     a2=kb.nextDouble();
	     System.out.println("Nhap b2: ");
	     b2=kb.nextDouble();
	     System.out.println("Nhap c2: ");
	     c2=kb.nextDouble();
	     double D, Dx, Dy;
	     D=a1*b2-a2*b1; Dx=b1*c2-b2*c1; Dy=c1*a2-c2*a1;
	     if (D==0) {
	         if (Dx==0 && Dy==0) {
	             System.out.println("Vo so nghiem");
	         }
	         else {
	             System.out.println("Vo nghiem");
	         }
	     }
	     else {
	         double x, y;
	         x=Dx/D; y=Dy/D;
	         System.out.println("x = "+x+"\ny = "+y);
	     }
	 }
	 public static void main(String[] args) {
		 PTB12 pt=new PTB12();
	     PTB12.PhuongTrinhBac1();
	     PTB12.PhuongTrinhBac2();

	 }
}
