public class Funcionarios {
    // Atributos
    private String Nome;
    private int Idade;

    // Métodos Construtores
    public Funcionarios(String Nome, int Idade){
        this.Nome = Nome;
        this.Idade = Idade;
    }

    // Métodos
    public void setNome(String nome_Alter) {
        Nome = nome_Alter;
    }
    public String getNome() {
        return Nome;
    }

    public void setIdade(int idade_Alter) {
        Idade = idade_Alter;
    }
    public int getIdade() {
        return Idade;
    }

    public void Fazer_Aniversario(){
        Idade++;
    }
}
