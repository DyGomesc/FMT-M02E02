import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Preencha as informações do paciente");
        Scanner scanner = new Scanner(System.in);

        Paciente paciente = new Paciente();

        System.out.println("Nome do paciente: ");
        paciente.nome = scanner.next();

        System.out.println("Idade do paciente: ");
        paciente.idade = scanner.nextInt();

    }
}
