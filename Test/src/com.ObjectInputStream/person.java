import java.io.Serializable;
import java.util.Objects;
/**
 * person需要满足如下的要求，方可序列化
 * 1、需要实现接口：Serializable
 * 2、当前类提供一个全局常量
 * 3、除了当前类person需要Serializable之外
 */
public class person implements Serializable {
    public static final long serialVersionUID = 89898988942L;
    private String name;
    private int age;
    private String sex;
 

    public person() {
    }

    public person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public person name(String name) {
        setName(name);
        return this;
    }

    public person age(int age) {
        setAge(age);
        return this;
    }

    public person sex(String sex) {
        setSex(sex);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof person)) {
            return false;
        }
        person person = (person) o;
        return Objects.equals(name, person.name) && age == person.age && Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", sex='" + getSex() + "'" +
            "}";
    }
    
}