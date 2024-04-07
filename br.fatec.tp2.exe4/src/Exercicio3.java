import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio3 {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<AlunoAcademia> alunos = new ArrayList<>();

    public static void main(String[] args) {
        String menu = "MENU\n" +
                "1 - Cadastrar Aluno\n" +
                "2 - Listar Alunos\n" +
                "3 - Relatorio Geral\n" +
                "9 - Sair";
        System.out.println(menu);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                AlunoAcademia aluno = new AlunoAcademia();
                System.out.print("Nome: ");
                aluno.setNome(scanner.nextLine());
                System.out.print("\nIdade: ");
                aluno.setIdade(scanner.nextInt());
                System.out.print("\nPeso: ");
                aluno.setPeso(scanner.nextDouble());
                System.out.print("\nAltura: ");
                aluno.setAltura(scanner.nextDouble());
                aluno.setIdentificador(aluno.getAltura() * aluno.getPeso() * aluno.getIdade());
                alunos.add(aluno);
                break;
            case 2:
                listarAlunos(false);
                break;
            case 3:
                listarAlunos(true);
                break;
            case 9:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void listarAlunos(boolean relatorio) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else if (!relatorio) {
            System.out.println("Lista de Alunos:");
            for (AlunoAcademia aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        } else {
            for (AlunoAcademia aluno : alunos) {
                aluno.exibir();
            }
        }
    }

}
