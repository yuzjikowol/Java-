class SquareTest2{  //引数を2乗を返すメソッド戻り値はlong型にする
  static long square(int n){
   return n*n;
}
public static void main(String[] args){
       for(int i=0;i<10;i++){
       System.out.println(i+"の2乗は"+square(i)+"です");
        }
   }
}