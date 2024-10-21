public class Funcionario extends PessoaFisica {

    private double salario;
    private String senha;
    private String login;
    private String lotacao;
    private double numHoras;

    // Construtor
    public Funcionario(double salario, String login, String senha, String lotacao, double numHoras, String nome,
                       String endereco, String telefone, String cpf) {
        super(cpf, nome, endereco, telefone);
        this.salario = salario;
        this.senha = senha;
        this.login = login;
        this.lotacao = lotacao;
        this.numHoras = numHoras;
    }

    // Getters
    public String getNome() {
        return super.nomePessoa;
    }

    public String getEndereco() {
        return super.enderecoPessoa;
    }

    public String getTelefone() {
        return super.telefonePessoa;
    }

    public String getCpf() {
        return super.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getLotação() {
        return this.lotacao;
    }

    public double getHoras() {
        return this.numHoras;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }

    // Método de autenticação
    public boolean autentica(String senha, String login) {
        return this.senha.equals(senha) && this.login.equals(login);
    }
}
