class EvenOddTest1{

  static void check(int n){
  System.out.println(n+"��");
  if(n%2 == 0){
   System.out.println("�����ł�");  
   }else{
System.out.println("��ł�");
}
}
public static void main(String[] args){
  for(int i=0;i<9;i++){
check(i);
}
}
}