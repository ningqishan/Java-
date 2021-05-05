import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;
public class Test1 {
    /**
     * 序列化的过程：将内存中的java对象保存到磁盘当中或者通过网络传输出去
     * 使用ObjectOutputStream来实现
     * @throws IOException
     * @throws FileNotFoundException
     */
    @Test
    public void ObjectInputStream1(){
        ObjectOutputStream  fo = null;
        try{
            File file = new File("D:\\ProgramOfJava\\IO\\Test\\src\\com.ObjectInputStream\\a.dat");
            file.createNewFile();
            fo = new ObjectOutputStream(new FileOutputStream(file));
            fo.writeObject(new String("我爱宋红康老师！"));
            fo.flush();
            fo.writeObject(new person("宁启山",12,"男"));
            fo.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    /**
     * 下面这个过程叫做反序列化：将磁盘文件中的对象还原为内存中的一个Java对象
     */
    @Test
    public void testObject(){
        ObjectInputStream str = null;
        try{
            str = new ObjectInputStream(new FileInputStream("D:\\ProgramOfJava\\IO\\Test\\src\\com.ObjectInputStream\\a.dat"));
            Object obj = str.readObject();
            String str1 = (String)obj;
            person person1 = (person)str.readObject();
            System.out.println(str1);
            System.out.println(person1);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }finally{
            try {
                str.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
