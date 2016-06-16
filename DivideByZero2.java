class DivideByZero2{
   public static void main(String[] args){
   int a = 10;

   try{
        a = a / 0;
   }catch(Exception e){
   System.out.println("—áŠO‚ª”­¶‚µ‚Ü‚µ‚½");//—áŠOˆ—
   }catch(ArithmeticException e){
      System.out.println("0‚ÅœZ‚µ‚Ü‚µ‚½");
  }
}
}
