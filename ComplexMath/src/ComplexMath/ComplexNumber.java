
package ComplexMath;

import Programm.Type;

public class ComplexNumber extends Number{//Класс ComplexNumber, унаследованный от  класса Number
    
    private float imaginary_part;

    public ComplexNumber() {
    }
    
  public float GetB()//метод для извлечения мнимой части из комплексного числа
    {
        return imaginary_part;
    }
    public ComplexNumber(float i, float i0) {//создается комплексное число 
       super(i);//в котором хранится действительная
       imaginary_part = i0;// и мнимая части
       
    }
    public void Add(float a,float b, float c, float d){//метод сложения, когда передают действительные и мнимые части двух комплексных чисел
    float x=(a+c); float y=(b+d);
    }
    public void Add(float b, float d){//метод сложения, когда передают только действительные части двух комплексных чисел
    super.Add(b,d);//использует реализацию метода из главного класса Number
    }
    public ComplexNumber Add (ComplexNumber c1, ComplexNumber c2) {//метод сложения, когда передают два комплексных чисела
    float x=(c1.GetA()+c2.GetA()); float y=(c1.GetB()+c2.GetB());//c1.getA() c1.getB()- действительная и мнимая часть первого комплексного числа,c2.getA() c2.getB() - второго
    return new ComplexNumber(x, y);//возвращает новое комплексное число
}
    public void Subtract(float a,float b, float c, float d){
     float x=(a-c); float y=(b-d);
    }
    public void Subtract(float b, float d){
    super.Subtract(b,d);
    }
    public ComplexNumber Subtract (ComplexNumber c1, ComplexNumber c2) {
    float x=(c1.GetA()-c2.GetA()); float y=(c1.GetB()-c2.GetB());
    return new ComplexNumber(x, y);
    }

    public void Divide(float a,float b, float c, float d){
    float x=(a*c+b*d)*(c*c+d*d); float y=(b*c-a*d)/(c*c+d*d);
     try{ y=(b*c-a*d)/(c*c+d*d);   
    } catch(Exception e){
    System.out.println("Ошибка "+e);
    }
    }
    public void Divide(float b, float d){
    super.Divide(b,d);
    }
    public ComplexNumber Divide (ComplexNumber c1, ComplexNumber c2) {
    float x=((c1.GetA()*c2.GetA()+c1.GetB()*c2.GetB())*(c2.GetA()*c2.GetA()+c2.GetB()*c2.GetB())); float y=((c1.GetB()*c2.GetA()-c1.GetA()*c2.GetB())/(c2.GetA()*c2.GetA()+c2.GetB()*c2.GetB()));
    try{ y=((c1.GetB()*c2.GetA()-c1.GetA()*c2.GetB())/(c2.GetA()*c2.GetA()+c2.GetB()*c2.GetB()));   
    } catch(Exception e){
    System.out.println("Ошибка "+e);
    }
    return new ComplexNumber(x, y);
    }
    
    public void Multiply(float a,float b, float c, float d){
    float x=(a*c-b*d); float y=(b*c+a*d);
    }
    public void Multiply(float b, float d){
    super.Multiply(b,d);
    }
    public ComplexNumber Multiply (ComplexNumber c1, ComplexNumber c2) {
    float x=(c1.GetA()*c2.GetA()-c1.GetB()*c2.GetB()); float y=(c1.GetB()*c2.GetA()+c1.GetA()*c2.GetB());
    return new ComplexNumber(x, y);
    }
    
    public void Print(float x, float y){//вывод комплексного числа, когда передают действительную и мнимую части
    System.out.println("z="+x+"+i*"+y);
    }
    public void Print(){//вывод комплексного числа
    System.out.println("z = "+GetA()+" + i*"+GetB());
    }
    
    public void isEqual(float a,float b, float c, float d){//проверка на равенство
    if ((a==c)&&(b==d)){
    System.out.println("Числа равны");
    }
    else{
    System.out.println("Числа не равны");        
    }
    }
    public void isEqual(float b, float d){
        super.isEqual(b, d);
    }
    public void isEqual(ComplexNumber c1, ComplexNumber c2){
    if ((c1.GetA()==c2.GetA())&&(c2.GetB()==c1.GetB())){
    System.out.println("Числа равны");
    }
    else{
    System.out.println("Числа не равны");        
    }
    }
   
      public void GetType (){//проверка какого типа является число
if ((GetA()!=0) && (GetB()!=0)) {
    Type.NumType v = Type.NumType.COMPLEX;
    System.out.println(v);
}
if (GetB()==0)  {
    Type.NumType v = Type.NumType.REAL;
    System.out.println(v);
}
if ((GetA()==0) && (GetB()!=0)) {
     Type.NumType v = Type.NumType.IMAGINARY;
    System.out.println(v);
    }
    }
}