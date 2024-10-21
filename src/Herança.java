import java.util.Scanner;

public class Herança {  // Removi o acento do nome da classe para evitar problemas
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        double sal = 4500.75;
        String log = "zezinho";
        String senha = "11@22";
        String lot = "Departamento de TI";
        double H = 44;
        String cpf = "321.176.458-98";
        String nome = "José Carlos da Silva";
        String end = "Rua dos bobos n° zero";
        String tel = "98197-0744";

        Funcionario Func = new Funcionario(1550, "Kauã123", "1234", "Caraguatatuba",
                5, "Kauã Lima Betito", "Travessão", "12996679051", "4541");

        // Entrada de dados do usuário
        System.out.print("Entre com o nome de usuário: ");
        String logAcesso = Entrada.nextLine();
        System.out.print("Entre com a senha de usuário: ");
        String senhaAcesso = Entrada.nextLine();

        // Autenticação
        if (Func.autentica(senhaAcesso, logAcesso)) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Bem-vindo! " + Func.getNome());
            System.out.println("-------------------------------------------------------");
            System.out.println("Local de trabalho: " + Func.getLotação());
            System.out.println("Carga em horas: " + Func.getHoras());
            System.out.println("Salário: R$" + Func.getSalario());
            System.out.println("Bonificação: R$" + Func.getBonificacao());  // Corrigido para exibir a bonificação
            System.out.println("-------------------------------------------------------");
        } else {
            System.out.println("-------------------------------------------------------");
            System.out.println("Usuário não cadastrado!");
            System.out.println("-------------------------------------------------------");
        }
    }
}
