class DivideByZero2{
   public static void main(String[] args){
   int a = 10;

   try{
        a = a / 0;
   }catch(Exception e){
   System.out.println("��O���������܂���");//��O����
   }catch(ArithmeticException e){
      System.out.println("0�ŏ��Z���܂���");
  }
}
}
