class CanYouHandleTooManyFunctionCalls{
   public static void main(String [] a){
      new realMain().mainFunction();
   }
}
class c1{
   int a;
   boolean real;
   public void callFunction(c3 object){
      int aux;
      int one;

      c3 c3Object1;
            a=object.a;
      one=0;
      c3Object1=object;
      aux=object.a;
      object.a=aux-1;
      a=a-1;
      
      
      if(one<aux)
      {  
         real=false;
         object.callFunction(this);
         aux=a;
      }
      else{}
      real=true;
   }
}
class c2{
   int a;
}
class c3 extends c2{
   
   public void callFunction(c1 object){
      
   int aux;
      int one;
      

      c1 c3Object1;
      one=0;    
      a=object.a;
      c3Object1=object;
      aux=object.a;
      object.a=aux-1;
      a=a-1;
      
      if(one<aux)
      {  
      
         c3Object1.callFunction(this);
         aux=a;
      }
      else{}
      
      object.real=false;
   }
}
class realMain{

   public void mainFunction(){
      
      boolean b1;
      c1 c1Object1;
      c3 c3Object1;
      c1Object1=new c1();
      c3Object1=new c3();
      c3Object1.a=0;
      c1Object1.real=false;
      c1Object1.callFunction(c3Object1);
      b1=c1Object1.real;
      if(b1)
         System.out.println(1);
      else
         System.out.println(0);
   }
}