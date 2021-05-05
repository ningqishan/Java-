import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class Test2 {
    @Test
    public void FileInputStreamOutputStream(){
        FileInputStream fileInput = null;        
        try{
            File file = new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.FileInputStream\\hello5.txt");
            file.createNewFile();

            fileInput = new FileInputStream(file);
            byte [] cbuf = new byte[5];
            int len;
            while((len = fileInput.read(cbuf))!=-1){
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
    
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(fileInput!=null)
                    fileInput.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    @Test
    public void tt(){
        System.out.print(21);
    }
}
