import java.util.Scanner;
public class Main {

    public static double calcularDezPorcento(double valor) {
            return valor * 0.10;
        }

    public static double calcularImposto(double impostos){
        return impostos * 0.168;
    }

    public static void main(String[] args) {
        Scanner contaa =new Scanner(System.in);

        System.out.print("Digite o valor da sua conta: ");
        double valorConta = contaa.nextDouble();

        double valorGarcom = calcularDezPorcento(valorConta);
        double valorImposto = calcularImposto(valorConta);
        double total = valorConta + valorGarcom + valorImposto;

        System.out.println("Valor da sua conta: R$ " + valorConta);
        System.out.println("Valor dos 10% do Garçom: " + valorGarcom);
        System.out.println("Valor dos impostos " + valorImposto);
        System.out.println("Valor total da conta: " + total);

        contaa.close();
    }
}
