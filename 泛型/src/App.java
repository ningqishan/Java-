public class App {
    private Object b; //定义Object类型得成员变量
    private Object getB(){ //设置相应得get方法
        return b;
    }
    public void setB(Object b){ //设置相应得set方法
        this.b = b;
    }
    public static void main(String[] args) throws Exception {
        App t = new App();//向上转型操作
        t.setB(new Boolean(true));//
        System.out.println(t.getB());
        t.setB(new Float(12.30));
        Float f = (Float)(t.getB());//向下转型操作
        System.out.println(f);
        t.setB(new Double(8.9999));
        Double d = (Double)(t.getB());
        System.out.println(d);
    }
}
/**
 * 对这个程序得解释：
 * 这个程序得主要目的是向程序员展示根据传入得对象类型不同而
 * 输出相对应得类型，上述得初始值传入是一个Ojbect类型的对象，
 * 而在Main函数中，我定义了别的类型对象，比如一个float类型的
 * 对象，把这个对象作为参数传入到set方法，为什么把这个float对象
 * 作为参数传入到Ojbect类型的函数中没事呢？因为Ojbect类型是一切
 * 对象的父类，这个Ojbect对象可转换为任意的对象，比如转换为int类型
 * 对象，double类型对象等等。
 */
