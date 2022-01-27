
package Programm;
import ComplexMath.*;
//import Programm.*;
public class sxcsc {
      public static void main(String[] args) {
         float a=4, b=9, c=7, d=8;
    
       ComplexNumber c1 =new ComplexNumber (a,b);//создается первое комплексное число, в него передаются действительная и мнимая части
       ComplexNumber c2 =new ComplexNumber (c,d);//создается второе комплексное число, в него передаются действительная и мнимая части
      ComplexNumber c3 =new ComplexNumber ();//создается третье комплексное число
       c3=c3.Divide(c1,c2);//производится деление с1 и с2, результат записывается в виде комплексного числа с3
       c3.Print();//вывод с3
       c3.GetType();//выводится тип числа с3
}
}