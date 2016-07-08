class PowerTest1{
 static void power(double m,int n){
   double ans = 1.0;

   for(int i=0;i <n;i++){
   ans *=m;
   }
  System.out.println(m+"‚Ì"+n+"æ‚Í"+ans+"‚Å‚·B");
  }

  public static void main(String args[]){
   power(2.3,8);
   power(16.9,4);
}
}
   