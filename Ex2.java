import java.util.Scanner;

public class Ex2 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num1;
    int num2;

    System.out.println("Digite um numero");
    num1 = entrada.nextInt();
    System.out.println("Digite outro numero");
    num2 = entrada.nextInt();

    System.out.println("O produto dos numeros eh");
    System.out.println(num1 * num2);

    entrada.close();
  }

}
