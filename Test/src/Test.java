class human{
    public void human_is(){
        System.out.println("I am human!");
    }
}
class man extends human {
    @Override
    public void human_is(){
        System.out.println("I anm a new human and I am man!");
    }
    public void man_is(){
        System.out.println("I am man!");
    }
}
public class Test{
    public static void main(String[] args) {
        //human human2 = new human();
        human human1 = new man();//向上转型
        human1.human_is();//输出I anm a new human and I am man!
        man man1 = (man)human1;
        man1.human_is();//输出I anm a new human and I am man!
        man1.man_is();
    }
}
