import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import org.junit.Test;
public class Test1 {
    private static InputStreamReader fr;
    public void testFileReader(){
         File file =  new File("hello.txt");
         System.out.println(file.getAbsolutePath());
    }
    public static void main(String[] args){
        //1、实例化File对象，指明要操作的文件
        File file =  new File("hello.txt");
        //2、提供一个具体的流，这里是一个文件输入流
        try {
            FileReader fr = new FileReader(file);
            //3、返回读入的一个字符，如果达到文件末尾，则返回-1
            System.out.println(file.getAbsolutePath());//输出这个文件的路径
            // int data = fr.read();
            // while(data!=-1){
            //     System.out.println((char)data);
            //     data = fr.read();
            // }
            // fr.close();
            //以上用的是方式一来进行文件读写
    
            int data;
            while((data = fr.read())!=-1){
                System.out.println((char)data);
            } 
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }  finally{
            try {
                if(fr!=null)
                    fr.close();   
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    /**
 * 注意：
 * 1、读入的文件必须要存在，否则就会报FileNotFoundException
 * 2、对于异常的处理，为了保证流资源一定可以执行关闭操作，需要try-catch-finally进行处理
 * 3、关于read的理解：返回读入的一个字符。如果到达文件末尾，则返回-1
 */
    //下面对read()操作升级：使用read的重载方法
    @Test
    public void testFileReader1() throws IOException{
        //1、File类的实例化
        File file  = new File("hello.txt");
        //2、FileReader流的实例化
        FileReader fr = new FileReader(file);
        //3、读入操作
        char[] cbuf = new char[5];
        int len;
        while((len  =fr.read(cbuf))!=-1){
            // for(int i = 0;i<len;i++){
            //     System.out.println(cbuf[i]);
            // }
            //1、上面是一种写法

            String str = new String(cbuf,0,len);
            System.out.println(str);

            //上面也是一种方法

        }
        fr.read(cbuf);
        //4、资源的关闭
        fr.close();
    }

    @Test
    public void testFileWriter() throws IOException{
        File file  = new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.Fil_io1\\hello2.txt");
        //以上在绝对路径下创建文件
        file.createNewFile();
        //1、以上提供File类对象，指明写出的文件

        FileWriter fi = new FileWriter(file);
        //2、创建一个文件写入对象

        fi.write("java!\n");
        fi.write("java1!\n");
        fi.close();
        //3、写入对象调用writer 对File类对象进行写入
    }
    @Test
    public void testFileReaderFileWriter(){
        FileReader fre = null;
        FileWriter frw = null;
        try{
            File file1 = new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.Fil_io1\\hello3.txt");
            File file2 = new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.Fil_io1\\hello4.txt");
            file1.createNewFile();
            file2.createNewFile();
            //以上创建两个File文件对象，指明要写入和写出的文件
    
            fre = new FileReader(file1);
            frw = new FileWriter(file2);
            //上面创建输入流和输出流对象
            
            fre.read();
            frw.write("sasasasasasasasssssssss");
            char[] cbuf = new char[5];
            int len;
            while((len = fre.read(cbuf) )!=-1){
                frw.write(cbuf,0,len);
                //System.out.println(cbuf[i]);
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
            // fre.close();
            // frw.close();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                 if(frw!=null)
                     frw.close();
             }catch(IOException e){
                 e.printStackTrace();
             }
             try{
                if(fre!=null)
                    fre.close();
             }catch(IOException e){
                 e.printStackTrace();
            }
        }
        //以上两条语句是创建输入流和输出流对象
        
    }
}