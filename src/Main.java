import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);
        // Armazenará o ráio do circúlo
        double radius; // Armazena o raio do círculo.
        char answer;   // Armazena a resposta do usuário para continuar (Y/N)
        // Loop do-while: executa pelo menos uma vez e repete enquanto answer == 'Y'
        do {
            // 1. Solicita o raio ao usuário:
            System.out.print("Enter the radius of the circle: ");
            radius = sc.nextDouble();
            // 2. Calcula e exibe a área com 4 casas decimais:
            System.out.printf("Area = %.4f\n", Math.PI * radius * radius);
             // 3. Pergunta se deseja continuar:
            System.out.println("Do you want to calculate another area? [y/n]");
            // Converte para maiúscula e pega o primeiro caractere
            answer = sc.next().toUpperCase().charAt(0);
        } while (answer == 'Y');
        sc.close(); // Fecha o Scanner para liberar recursos
        System.out.println("Program terminated.");// Mensagem de fim do programa
    }
}
