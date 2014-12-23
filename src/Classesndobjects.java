class Person {
    private String name;
    private int age;

    void predstaveni() {
        System.out.println("Ahoj jmenuju se " + name + " a je mi " + age);
    }

    int rokyDoUkonceni() {
        int zbyvajicichRoku = 60 - age;
        return zbyvajicichRoku;
    }

    public int getAge() {
        return age;
    }
    public void swag(String rekt){
        System.out.println(rekt);
}
    public void setPerson(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor wowrkign!");
    }
}

public class Classesndobjects {
    public static void main(String[] args) {
        /*spatne!
        /Person person1 = new Person();
        person1.name = "Stepan Paulik";
        person1.age = 18;
        */
        Person person2 = new Person();
        person2.setPerson("Vitek Paulik", 16);

        Person person3 = new Person();
        person3.setPerson("Anna Vlckova", 17);
        
    }
}
