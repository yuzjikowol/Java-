import java.util.Scanner;
import java.io.FileReader;

class PrintList{
  public static void main(String[] args){
  FileReader fr = null;
  
  try{
      fr = new FileReader(args[0]);
    }catch(Exception e){
    System.out.println("�t�@�C����������܂���");
    System.exit(0);
    }

    Scanner sin = new Scanner(fr);
    while(sin.hasNext()){
       String s =sin.nextLine();
       System.out.println(s);
       }
}
}