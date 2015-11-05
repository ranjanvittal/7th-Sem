class ElementOfArgument{
   public static void main(String [] a){
      new realMain().mainFunction();
   }
}
class c1{
   boolean real;
   c2 c4; 
   public void callFunction(c3 object){
      int aux;
      aux=object.a;
      aux=aux-15;
      if(aux<1)
         real=true;
      else
         real=false;
   }
}
class c2{
   int a;
}
class c3 extends c2{}
class realMain{

   public void mainFunction(){
      
      boolean b1;
      c1 c1Object1;
      c3 c3Object1;
      c1Object1=new c1();
      c3Object1=new c3();
      c3Object1.a=15;
      c1Object1.real=false;
      c1Object1.callFunction(c3Object1);
      b1=c1Object1.real;
      if(b1)
         System.out.println(1);
      else
         System.out.println(0);
   }
}