class TakeCareOfDynamicType {
   public static void main(String [] a){
      new realMain().mainFunction();
   }
}
class c1{
   int real;
   
   public void dynamism( int a){
      int a_aux;
      a_aux= a;
      real=0;
      System.out.println(a_aux);
   }
}
class c2 extends c1{
   
   public void dynamism( int a){
      int a_aux;
      a_aux= a;
      real=5;
      System.out.println(a_aux);
   }
   
}
class c3 extends c1{
   
   public void dynamism( int a){
      int a_aux;
      a_aux= a;
      real=10;
      System.out.println(a_aux);
   }
}
class realMain{

   public void mainFunction(){
      
      c2 c1Object1;
      c3 c1Object2;
      c1 c1Object3;
      c1 c1Object4;
      
      c1Object1=new c2();
      c1Object2=new c3();
      c1Object1.dynamism(1);
      c1Object2.dynamism(2);
      c1Object3=new c3();
      c1Object3.dynamism(3);
      c1Object4=new c2();
      c1Object4.dynamism(4);
      
      System.out.println(c1Object1.real);
      System.out.println(c1Object2.real);
      System.out.println(c1Object3.real);
      System.out.println(c1Object4.real);
      
   }
}