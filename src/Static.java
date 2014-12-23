class Thing {
    public static int count;
    public int id;
    public final static int cisloDresu = 5;
    private String name;
    private int age;
    public Thing(String name, int age) {
        this.name = name;
        this.age = age;
        id = count;
        count++;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class Static {

}
