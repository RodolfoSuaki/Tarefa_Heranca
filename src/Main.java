public class Main {
    public static void main(String[] args) {
        Pessoa pf = PessoaFisica.criarPF("Ricardo", "Rua Java,231", "99999-9999", "085321456");
        Pessoa pj = PessoaJuridica.criarPJ("AlimentaçãoSA", "Rua Java,221", "99239-9931", "081244146");

        System.out.println(pj);
        System.out.println(pf);
    }
}