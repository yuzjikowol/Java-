class StringObjectTest{
 public static void main(String[] args){

 char c ="Hello.".charAt(1);
 
 System.out.println("Hello.の1文字目は"+c+"です。");
 
 	String s2 = "Hello.".toLowerCase();
 	System.out.println("Hello.を小文字にすると"+s2+"です。");
 	
 	String s3 = "Hello.".toUpperCase();
 	System.out.println("Hello.を大文字にすると"+s3+"です。");
 }
}