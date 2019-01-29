
import java.util.Scanner;

public class Rational 
{
  private int numerator;
  private int denominator;
 
 public Rational(int num)
 {
  this(num, 1);
 }
 
 public Rational()
 {
  numerator = 0;
  denominator = 1;
 }
 
 public Rational(int num, int den)
 {
  numerator = num;
  denominator = den;
 }
 
 public int getNumerator()
 {
  return numerator;
 }
 
 public int getDenominator()
 {
  return denominator;
 }
 
 public void setNumerator(int value)
 {
  numerator = value;
 }
 
 public void setDenominator(int value)
 {
  denominator = value;
 }
 
 public Rational inputRational()
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter numerator: ");
  numerator = input.nextInt();
  System.out.println("Enter denominator: ");
  denominator = input.nextInt();
  return new Rational(numerator, denominator);
 }
 
 private int GCD(int m, int n)
 {
  int r;
  while (n != 0)
  {
   r = m % n;
   m = n;
   n = r;
  }
  return m;
 }
 
 private void reducer(int m, int n)
 {
  int GCD = this.GCD(this.numerator, this.denominator);
  if(GCD > 1)
  {
   this.numerator = this.numerator / GCD;
   this.denominator = this.denominator / GCD;
  }
 }
 
 public String toString()
 {
  return (" " + numerator + " / " + denominator + " ");
 }

 public Rational Add(Rational f)
 {
 Rational Answer = new Rational(numerator * f.denominator + f.numerator * denominator
   , f.denominator * denominator);
 Answer.reducer(numerator, denominator);
 return Answer;
 }
 
 public void Substract(Rational f1, Rational f2)
 {
  Rational one = new Rational(f1.numerator * f2.denominator - f2.numerator 
      * f1.denominator, f1.denominator * f2.denominator);  
  one.reducer(numerator, denominator);
  System.out.println(one);
 }
 
 public Rational Multiply(Rational f)
 {
  Rational Answer = new Rational(numerator * f.numerator, f.denominator * denominator);
  Answer.reducer(numerator, denominator);
  return Answer;
 }
 
 public void Divide(Rational f1, Rational f2)
 {
  Rational one = new Rational(f1.numerator * f2.denominator, f1.denominator * f2.numerator);
  one.reducer(numerator, denominator);
  System.out.println(one);
 }
 
 public static double RationalValue(Rational f1, Rational f2)
 {
  return (double)(f1.getNumerator() * f2.getDenominator()) 
    / (f1.getDenominator() * f2.getNumerator());
 }
 
 public static void main(String[] argv) 
 {
  Rational F1 = new Rational();
  Rational F2 = new Rational();
  Rational F3 = new Rational();
  
  F1.inputRational();
  F2.inputRational();
  
  System.out.println("F1: " + F1);
  System.out.println("F2: " + F2);
  
  System.out.println(F1 + " + " + F2 + " =" + F1.Add(F2));
  
  
  System.out.print(F1 + " - " + F2 + " =");
  F3.Substract(F1, F2);
  
  F3 = F1.Multiply(F2);
  System.out.println(F1 + " * " + F2 + " =" + F3);
  
  System.out.print(F1 + " : " + F2 + " =");
  F3.Divide(F1, F2);
  
  System.out.println(F1.numerator + " / " + F1.denominator 
    + " / " + F2.numerator + " / " + F2.denominator + " = " + Rational.RationalValue(F1, F2));
  
  System.out.println("Change F1's new numerator to 2 and F2's denominator to 5.");
  F1.numerator = 2;
  System.out.println("F1's new numerator: " + F1.numerator);
  F2.denominator = 5;
  System.out.println("F2's new denominator: " + F2.denominator);
 }
}

// http://www.cs.berkeley.edu/~jrs/61bf98/labs/lab2/Fraction.java
// http://www.coderanch.com/t/599872/java/java/code-find-greatest-common-divisor
