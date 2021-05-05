import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;
/**
 * 1、RandomAccessFile直接继承于java.lang.Object类，实现DataInput和DataOutput接口
 * 2、RandomAccessFile既可以作为一个输入流，也可以作为一个输出流 
 */
public class Test1 {
    @Test
    public void RandomAccessFileTest() throws IOException{
        RandomAccessFile  f1 = new RandomAccessFile("D:\\ProgramOfJava\\IO\\Test\\src\\com.RandomAcession\\1.png","r");
        RandomAccessFile  f2 = new RandomAccessFile("D:\\ProgramOfJava\\IO\\Test\\src\\com.RandomAcession\\2.png","rw");
        
        int len;
        byte [] array = new byte[9];
        while((len=f1.read(array))!=-1){
            String str = new String(array,0,len);
            f2.writeBytes(str);
        }
        f1.close();
        f2.close();
    }

    @Test
    public void RandonAccessFile2() throws IOException{
        File ff = new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.RandomAcession\\1.txt");
        ff.createNewFile();
        RandomAccessFile f1 = new RandomAccessFile("D:\\ProgramOfJava\\IO\\Test\\src\\com.RandomAcession\\1.txt","r");
        RandomAccessFile f2 = new RandomAccessFile("D:\\ProgramOfJava\\IO\\Test\\src\\com.RandomAcession\\2.txt","rw");

        int len;
        byte[] array = new byte[8];
        while((len = f1.read(array))!=-1){
            String str = new String(array,0,len);
            f2.writeBytes(str);
        }
        f1.close();
        f2.close();
    }
}
