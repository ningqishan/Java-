public class App<T> {
    private T[] array;
    public void setT(T[]array){
        this.array = array;
    }
    public T[] getT(){
        return array;
    }
    public static void main(String[] args) throws Exception {
        App<String> a = new App<String>();
        String [] array = {"宁启山","任安全","史子玉"};
        a.setT(array);
        for(int i  =0;i<a.getT().length;i++){
            System.out.println(a.getT()[i]);
        }
    }
}
/**
 * 总结：这里定义了一个泛型数组；
 */