import java.net.URL;
import java.net.MalformedURLException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class URLtest{
    public static void main(String[] args){
    try{
    URL u =new URL("http://www.gihyo.co.jp/");
    InputStream in = u.openStream();
    InputStreamReader is = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(is);
    String s;
 
    while ((s = br.readLine()) != null){
    System.out.println(s);
    }
}catch(MalformedURLException e){
}catch(IOException e){
}
}
}