package ComplexMath;
interface INum {//Интерфейс INum, в котором объявлены четыре метода 
   public void Add(float x, float y);
   public void Subtract(float x, float y);
   public void Divide(float x, float y);
   public void Multiply(float x, float y);
}

 public class Number implements INum{//Класс Number, реализующий интерфейс  INum 
     public Number (float i){//поле real_part для хранения действительной части 
         real_part = i;
     }
     
     public Number (){}
     
     @Override//добавляет возможность перезаписи метода
    public void Add(float x, float y){
            float z=x+y;
    }
     @Override
    public void Subtract(float x, float y){
        float z=x-y;
    }
     @Override
    public void Divide(float x, float y){
       double z=x/y;
            try{ z=x/y;   //обработчик исключений
    } catch(Exception e){
    System.out.println("Ошибка "+e);
    }
    }
     @Override
    public void Multiply(float x, float y){
        float z=x*y;
    }

    public void Print(){
        System.out.println("z = 0");
    }
    public void isEqual(float x, float y){  
            if (x==y){
    System.out.println("Числа равны");
    }
    else{
    System.out.println("Числа не равны");        
    }      
    }
    
    public float GetA()//метод для извлечения действительной части из комплексного числа
    {
        return real_part;
    }
    private float real_part;
    
}

