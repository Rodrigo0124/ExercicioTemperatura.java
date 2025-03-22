import java.util.Locale;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       double temp;
       String escolha;
      double conversao;
       System.out.println("Sua temperatura é em Celsius ou Fahrenheit?");
       escolha = s.nextLine();
       System.out.println("Qual a temperatura?");
       temp = s.nextDouble();


       if(escolha.equalsIgnoreCase("Celsius")){
           conversao = (9.0 / 5 * temp) + 32;
           System.out.printf("A temperatura em Fahrenheit é: %.1f\n", conversao);

       }else if(escolha.equalsIgnoreCase("Fahrenheit")){
           conversao = (temp - 32) * 5 / 9.0;
           System.out.printf("A temperatura em Celsius é: %.1f\n", conversao);
       }else{
           System.out.println("Informação inválida!");
        }


    }
}