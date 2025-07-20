package testando_listas;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa p1 = new Pessoa(26, "Natan");
        Pessoa p2 = new Pessoa(26,"Thalyta");
        pessoas.add(p1);
        pessoas.add(p2);
        for(Pessoa p : pessoas){
            System.out.println("Nome:"+ p.nome);
            System.out.println("Idade:"+ p.idade);
        }
    }
}
