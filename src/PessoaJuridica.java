public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    static PessoaJuridica criarPJ(String nome, String endereco, String telefone, String cpf){
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome(nome);
        pj.setEndereco(endereco);
        pj.setTelefone(telefone);
        pj.setCnpj(cpf);
        return pj;
    }
}
