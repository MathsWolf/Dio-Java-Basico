package AulasJava.Matheus.Aula5_ProgramaçãoOrientadaPOO.Construtores;

public class Pessoas {
    private String nome;
    private String cpf;
    private String endereco;

    // O ideal do construtor é ser utilizado para atributos bem relevantes para a criação do objeto.
    public Pessoas (String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    } // ja os dados restantes podem ser utilizando o metodo Set/Get.
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
}
