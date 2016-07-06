class EvenOddTest1{

  static void check(int n){
  System.out.println(n+"‚Í");
  if(n%2 == 0){
   System.out.println("‹ô”‚Å‚·");  
   }else{
System.out.println("Šï”‚Å‚·");
}
}
public static void main(String[] args){
  for(int i=0;i<9;i++){
check(i);
}
}
}