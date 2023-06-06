package org.test;

public class A {
	 int id = 10;

 private  void m1() {
	 int id = 100;
System.out.println(id);
}
 private  void m2() {
System.out.println(id);
 }
 public static void main(String[] args) {
	 
	 A a = new A();
	 a.m1();
	 a.m2();
	 
	 A a1 = new A();
	 a1.m2();
	 a1.m1();
  }
}


