import java.util.ArrayList;
import java.util.Iterator;
public class Test1 {
    public static void main(String[] args) throws Exception {
    //     ArrayList list = new ArrayList();
    //     for(int i  =1;i<10;i++){
    //         list.add(i);
    //     }
    //     list.add("宁启山");
    //     for(Object i:list){
    //         System.out.println((Integer)i);
    //     }
    // }
/**
 * 以上的写法不能保证数据的安全，如果这个迭代器不使用泛型
 * 为了保证数据的安全性，我们可以指定这个迭代器的类型，也就是
 * 使用泛型，指定这个集合的类型。
 */  

    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i  =1;i<=4;i++)
        list.add(i);
    Iterator<Integer> iterator = list.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
/**
 * 以上的写法使用了泛型，指定该容器能装的数据类型
 * 保证了数据类型的安全，集合，接口或者集合类在jdk5.0时
 * 都修改为带泛型结构，在实例化集合类时，可以指定泛型的类型
 * 泛型的类型必须是类，不能是基本的数据类型，可以是包装类
 * 如果实例化时没有指明泛型的类型，默认为Ojbect类型
 */
    }
}
