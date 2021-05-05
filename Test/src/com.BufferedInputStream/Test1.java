import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class Test1 { @Test
     public void BufferedInputStream1(){
        BufferedInputStream bufferin = null;
         try{
           File file = new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.BufferedInputStream\\9.png");
             file.createNewFile();
             FileInputStream  fileinputstream = new FileInputStream(file);
    
             bufferin = new BufferedInputStream(fileinputstream);
    
            int len;
             byte []array = new byte[5];
             while((len = bufferin.read(array))!=-1){
                 String str = new String(array,0,len);
        }
       }catch(IOException e){
             e.printStackTrace();
         }finally{

           try {
                bufferin.close();
           } catch (IOException e) {
                 e.printStackTrace();
             }
     }

     }
     @Test
     public void copyBufferedInputStreamSoOn(){
         BufferedInputStream finput = null;
        BufferedOutputStream finout = null;
         try{
             finput = new BufferedInputStream(new FileInputStream(new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.BufferedInputStream\\6.png")));
             finout = new BufferedOutputStream(new FileOutputStream(new File("B.png")));
             int len;
             byte[]array = new byte[8];
             while((len = finput.read(array))!=-1){
               finout.write(len);
             }
           
         }catch(IOException e){
             e.printStackTrace();
     }finally{
             try{
                 if(finout!=null)
                     finout.close();
     }catch(IOException e){
                 e.printStackTrace();
             try{
                if(finput!=null)
                    finput.close();
             }catch(IOException t){
                 t.printStackTrace();
               }
            }

     }
 }

    @Test
    public void jiamiBufferd(){
        BufferedInputStream buin = null;
        BufferedOutputStream buoi = null;
        try{
            buin = new  BufferedInputStream(new FileInputStream("D:\\ProgramOfJava\\IO\\Test\\src\\com.BufferedInputStream\\6.png"));
            buoi = new BufferedOutputStream(new FileOutputStream("D:\\ProgramOfJava\\IO\\Test\\src\\com.BufferedInputStream\\7.png"));
    
            byte []array = new byte[8];
            int len;
            while((len = buin.read(array))!=-1){
                for(int i = 0;i<len;i++){
                    array[i] = (byte) (array[i]^i); 
                }
                for(int i = 0;i<len;i++){
                    buoi.write(array[i]);
                }
            }
        }catch(IOException e){

        }finally{
            try{
                if(buin!=null)
                    buin.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                if(buoi!=null)
                    buoi.close();  
            }catch(IOException e){
                e.printStackTrace();
            }
  
        }
    }
}
