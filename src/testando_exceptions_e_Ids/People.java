package testando_exceptions_e_Ids;

public class People {
    public String name;
    public int age;
    int id;
    private static int idCounter = 1;
    public People(String name, int age){
        this.name = name;
        this.age = age;
        this.id = idCounter++;
    }
    public int getId(){
        return id;
    }
}
