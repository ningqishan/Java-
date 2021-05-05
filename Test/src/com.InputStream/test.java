import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import org.junit.Test;
public class test {
    @Test
    public void InputStreamP() throws IOException{
        File filee = new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.InputStream\\text.txt");
        filee.createNewFile();
        FileInputStream file = new FileInputStream(filee);
        InputStreamReader inputstream = new InputStreamReader(file,"utf-16");
        int len;
        char []array = new char[9];
        while((len = inputstream.read(array))!=-1){
            String str = new String(array,0,len);
            System.out.println(str);
        }
        inputstream.close();
    }
    @Test
    public void InputStreamO() throws IOException{
        File file1 = new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.InputStream\\text1.txt");
        File file2 = new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.InputStream\\text2.txt");
        //读取文件text1的内容并且写入到文件file2当中
        file1.createNewFile();
        file2.createNewFile();

        FileInputStream fin = new FileInputStream(file1);
        FileOutputStream fon = new FileOutputStream(file2);
        //分别对这两个文件对象进行写入和写出
        InputStreamReader ffin = new InputStreamReader(fin,"utf-8");
        OutputStreamWriter ffon = new OutputStreamWriter(fon,"utf-16");
        int len;
        char [] array = new char[9];
        while((len=ffin.read(array))!=-1){
            String str = new String(array,0,len);
            ffon.write(str);
        }
        ffin.close();
        ffon.close();
    }
}