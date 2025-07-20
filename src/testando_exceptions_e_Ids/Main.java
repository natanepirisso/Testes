package testando_exceptions_e_Ids;

public class Main {
    public static void main(String[] args) {
        People p1 = new People("Natan", 26);
        People p2 = new People("Thalyta",26);
        People p3 = new People("Vinicius",27);
        try{
            People[] peopleArr = new People[2];
            peopleArr[0] = p1;
            peopleArr[1] = p2;
            for(People p : peopleArr){
                System.out.println("Nome: " + p.name + " | Idade: " + p.age + " | ID: " + p.getId());
            }
            System.out.println(peopleArr[5]);
        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("Quantidade de pessoas dentro da lista já está lotada. Tente novamente mais tarde");
    }finally {
            System.out.println("Fim da listagem.");
        }
    }
}
