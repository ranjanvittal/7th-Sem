class ExpressionTester{
   public static void main(String [] a){
      new realMain().mainFunction();
   }
}
class c1{
   boolean real;
   
   public void callFunction(){
      boolean unreal;
      c1 ob1;
      int[] arr;
      arr=new int[1];
      arr[0]=5;
      ob1=this;
      
      unreal=!real;
      
         if(real & real)
            System.out.println(1);
         else{
            System.out.println(0);
            if(unreal&unreal)
               System.out.println(1);
            else{
               
            }
               System.out.println(8+9);
               System.out.println(8-9);
               System.out.println(8*9);
               System.out.println(arr[0]);
               ob1.real=true;
               ob1.callFunction();
         }
      
   }
}
class realMain{

   public void mainFunction(){
      
      c1 c1Object1;
      
      c1Object1=new c1();
      c1Object1.real=false;
      c1Object1.callFunction();
      
   }
}