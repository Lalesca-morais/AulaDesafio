import java.util.Scanner;
import java.util.Random;
public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, rodadas, contador = 0;

        System.out.println("=====JOGO DOS DADOS=====");
        System.out.println("Digite a quantidade de rodadas: ");
        rodadas = entrada.nextInt();
        System.out.println("----------------------------");

        while (contador < rodadas) {
            System.out.println("Digite um número de 1 a 10: ");
            numero = entrada.nextInt();

            Random aleatorio = new Random();
            int dado = (aleatorio.nextInt(10) + 1);
            System.out.println("O valor aleatório é: "+dado);
            compararValores(numero, dado);
            contador++;
        }
    }
    public static void compararValores (int numero, int dado) {
        int somaPontos = 0, acertos = 0, erros = 0;

        if (dado == numero) {
            somaPontos = somaPontos + 10;
            acertos++;
            System.out.println("Você ganhou 10 pontos ");
        }else if (dado + 1 == numero || dado - 1 == numero) {
            somaPontos = somaPontos + 5;
            acertos++;
            System.out.println("Você ganhou 5 pontos ");
        }else if (!(dado + 1 == numero || dado - 1 == numero)) {
            erros++;
            System.out.println("Você não ganhou pontos");
        }
        System.out.println("Você teve " +acertos+ " acertos e " +erros+ " erros!");
        System.out.println("Seu total de pontos é: "+somaPontos);
        System.out.println("==================================");
    }
}

