import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

class Lister2{
  public static void main(String[] args){

  FileReader fr =null;
  FileWriter fw =null;

  try{
      fr = new FileReader(args[0]);
}catch(Exception e){
  System.out.println("ファイルが見つかりません");
  System.exit(0);
}

 try{
  fw = new FileWriter(args[0]+".list");
}catch(Exception e){
System.out.println("ファイルが見つかりません");
  System.exit(0);
}

try{
   Scanner sin = new Scanner(fr);
   PrintWriter out =new PrintWriter(fw);
   int i=1;
   while(sin.hasNext()){
   String s =sin.nextLine();
   out.println(i+":"+s);
    i++;
}
fw.close();
}catch(Exception e){
System.out.println("ファイル出力中にエラーが発生しました。");
  System.exit(0);
}
}
}
