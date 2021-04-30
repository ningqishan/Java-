public class OverClass<T>{ //这是一个泛型类
    private T over; //设置泛型对象
    public T getOver(){  //这是一个泛型方法
        return over; //返回泛型对象
    }
    public void setOver(T over){
        this.over = over; //设置泛型对象
    }
    public static void main(String[] args){
        OverClass<Boolean> over1 = new OverClass<Boolean>(); //新建一个泛型对象，这个对象是一个Boolen类型的对象
        OverClass<Float>over2 = new OverClass<Float>();  //新建第二个泛型对象,这个对象是一个Float类型的对象
        over1.setOver(true); //将这个对象作为参数传入到set方法当中
        over2.setOver(12.3f);//将这个float类型的对象传入到set方法当中
        Boolean b = over1.getOver(); //返回这个方法的值
        Float f = over2.getOver(); //返回这个方法的值
        System.out.println(b); //输出这个对象
        System.out.println(f);//输出这个对象
    }
}

/**
 * 总结：
 * 本程序自定义了一个泛型类，而且定义了一个范型变量，泛型类的命名规范是：类名<T>
 * 里面这个参数T就类似Ojbect对象，在get和set方法当中传入的都是T对象作为参数。
 * 新建一个泛型类对象的命名规范是：
 * 类名<对象类型> 对象名 = new 类名<对象类型>();
 */