class DivideByZero{
   public static void main(String[] args){
   int a = 10;

   try{
        a = a / 0;
   }catch(ArithmeticException e){
      System.out.println("0�ŏ��Z���܂���");//��O����
  }
}
}
