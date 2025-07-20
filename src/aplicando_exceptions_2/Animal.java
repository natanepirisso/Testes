package aplicando_exceptions_2;

public class Animal {
    public String especie;
    public int qntd;
    int id;
    private static int criarId = 1;
    public Animal(String especie, int qntd){
        this.especie = especie;
        this.qntd = qntd;
        this.id = criarId++;
    }
    public int getID(){
        return id;
    }

}
