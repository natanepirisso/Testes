package aplicando_exceptions_2.inputUtils;

public class validationUtils {
    public static void stringValidation(String itsStr) throws stringPickerException{
        if(!itsStr.matches("[a-zA-z]+")){
            throw new stringPickerException("Erro: Digite apenas letras.");
        }
    }
    public static void intValidation(String itsInt) throws intPickerException{
        if(!itsInt.matches("\\d+")){
            throw new intPickerException("Erro: Digite apenas um número inteiro.");
        }
    }
}
