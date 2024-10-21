public class PessoaFisica  extends Pessoa {

    protected String cpf;

    public PessoaFisica(String cpf, String nome, String endereco, String telefone){
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

}
