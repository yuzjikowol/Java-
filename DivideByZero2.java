class DivideByZero2{
   public static void main(String[] args){
   int a = 10;

   try{
        a = a / 0;
   }catch(Exception e){
   System.out.println("例外が発生しました");//例外処理
   }catch(ArithmeticException e){
      System.out.println("0で除算しました");
  }
}
}
