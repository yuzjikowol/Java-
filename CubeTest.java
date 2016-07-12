class CudeTest{
  static long square(int n){
   return n * n;
 }

static long cube(int n){
  return n * square(n);
} 

public static void main(String[] args){
  for(int i=0;i<10;i++){
    System.out.println(i+"‚Ì3æ‚Í"+cube(i)+"‚Å‚·");
}
}
}