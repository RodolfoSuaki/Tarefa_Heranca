public class PessoaFisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    static PessoaFisica criarPF(String nome, String endereco, String telefone, String cpf){
        PessoaFisica pf = new PessoaFisica();
        pf.setNome(nome);
        pf.setEndereco(endereco);
        pf.setTelefone(telefone);
        pf.setCpf(cpf);
        return pf;
    }
}
