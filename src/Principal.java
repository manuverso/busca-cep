import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        ConsultaCep busca = new ConsultaCep();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("-----------------------------------");
        System.out.println("Digite o cep para a busca: ");
        String cep = input.nextLine();








        String json = gson.toJson(cep);

        System.out.println(json);

    }
}
