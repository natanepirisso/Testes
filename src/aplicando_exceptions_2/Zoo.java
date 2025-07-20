package aplicando_exceptions_2;

import aplicando_exceptions_2.inputUtils.intPickerException;
import aplicando_exceptions_2.inputUtils.stringPickerException;
import aplicando_exceptions_2.inputUtils.validationUtils;
import java.util.ArrayList;
import java.util.Scanner;



public class Zoo {
    static ArrayList<Animal> animalsList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        interfaceZoo();
    }















    public static void addCategoria(){
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
    public static void listarCategoria(){
        System.out.println("----------- Lista de Animais --------------\n");
        for(Animal p : animalsList){
            System.out.println("Animal: "+ p.especie + " | Quantidade: " + p.qntd + "| ID: " + p.getID());
        }
    }
    public static void interfaceZoo(){
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