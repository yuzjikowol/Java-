class EvenOddTest1{

  static void check(int n){
  System.out.println(n+"は");
  if(n%2 == 0){
   System.out.println("偶数です");  
   }else{
System.out.println("奇数です");
}
}
public static void main(String[] args){
  for(int i=0;i<9;i++){
check(i);
}
}
}