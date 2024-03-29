import java.util.Scanner;
public class temperaturaMedia {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int totalTemperaturas = 12;
       double somaTemperaturas = 0;
       for (int i = 1; i <= totalTemperaturas; ) {
           System.out.printf("Digite a temperatura %d (entre 4 e 10): ", i);
           double temperatura = scanner.nextDouble();
           if (temperatura >= 4 && temperatura <= 10) {
               somaTemperaturas += temperatura;
               i++;
           } else {
               System.out.println("Temperatura inválida. Insira um valor entre 4º C e 10º C.");
           }
       }
       double mediaTemperaturas = somaTemperaturas / totalTemperaturas;
       System.out.printf("A média de hoje das temperaturas é: %.1fº C\n", mediaTemperaturas);
       scanner.close();
   }
}