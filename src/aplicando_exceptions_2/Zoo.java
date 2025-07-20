package aplicando_exceptions_2;

import aplicando_exceptions_2.inputUtils.intPickerException;
import aplicando_exceptions_2.inputUtils.stringPickerException;
import aplicando_exceptions_2.inputUtils.validationUtils;
import java.util.ArrayList;
import java.util.Scanner;



public class Zoo {
    private ArrayList<Animal> animalsList;
    private Scanner sc;
    public Zoo(){
        this.animalsList = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }
    private void addCategoria(){
        while(true){
            try{
                System.out.println("Qual o nome da Categoria do Animal?");
                String nomeAnimal = sc.next();
                validationUtils.stringValidation(nomeAnimal);

                System.out.println("Quantos animais dessa categoria existem?");
                String qntdAnimal = sc.next();
                validationUtils.intValidation(qntdAnimal);
                int qntdAnimalParsed = Integer.parseInt(qntdAnimal);
                animalsList.add(new Animal(nomeAnimal,qntdAnimalParsed));
                break;

            }catch(intPickerException | stringPickerException e){
                System.out.println(e.getMessage());
            }

        }
    }
    private void listarCategoria(){
        System.out.println("----------- Lista de Animais --------------\n");
        for(Animal p : animalsList){
            System.out.println("Animal: "+ p.especie + " | Quantidade: " + p.qntd + "| ID: " + p.getID());
        }
    }
    public void run(){
        int inputPicker;
        do{
            System.out.println("\nDigite:");
            System.out.println("1 - Adicionar categoria de animais");
            System.out.println("2 - Listar categorias");
            System.out.println("0 - Encerrar");
            inputPicker = sc.nextInt();
            switch (inputPicker){
                case 1:
                    addCategoria();
                    break;
                case 2:
                    listarCategoria();
                    break;
            }
        }
        while(inputPicker!=0);{
            System.out.println("Sistema Encerrado.");
            sc.close();
        }
    }
}