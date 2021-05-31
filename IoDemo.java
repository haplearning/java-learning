import java.io.*;


public class IoDemo{
    public static void main(String[] args) throws IOException{

        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println(br.read());
        // do{
        //     c =(char) br.read();
        //     System.out.println(c);
        // }while (c!='q');
        // System.out.println(br.readLine());
        
        InputStream f = new FileInputStream("E:/Markdown/待看.txt");
        InputStreamReader fr = new InputStreamReader(f,"gbk");
        // f.readAllBytes();
        // int size = f.available();
        // for (int i=0;i<size;i++){
        //     System.out.print((char)f.read());
        // }
        // System.out.println(f.readAllBytes());
        while (fr.ready()){
            System.out.print((char) fr.read());
        }
    }
}