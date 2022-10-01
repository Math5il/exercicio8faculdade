import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        float numeroDeHoras = 0.0f;
        float ganhoPorHora = 0.0f;
        float salario = 0.0f;

        System.out.println("Por favor digite a quantidade de horas trabalhadas: ");
        numeroDeHoras = console.nextFloat();
        System.out.println("Por favor digite quanto você ganha por hora");
        ganhoPorHora = console.nextFloat();

        salario = ganhoPorHora * numeroDeHoras;

        System.out.println("O seu sálario este mês é: " + salario);
    }
}
