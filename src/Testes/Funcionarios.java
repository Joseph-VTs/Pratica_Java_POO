package Testes;

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

    @Override
    public String toString() {
        return "Funcionário {" + this.Nome + "}, têm {" +  this.Idade + "} anos de Idade";
    }





    public static void main(String[] args) {

        // Criação de Instância 'Objetos'
        Funcionarios f1 = new Funcionarios("Rosvaldo", 54);

        // Obtendo e Exibindo os valores dos Atributos
        System.out.println("\n--------------------------");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Idade: " + f1.getIdade());

        System.out.println("\n--------------------------");
        // Criando outra Instância 'Objeto'
        Funcionarios f2 = new Funcionarios("Joaquim", 28);
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Idade: " + f2.getIdade());

        System.out.println("\n--------------------------");
        // Funcionário de Aniversário
        f1.Fazer_Aniversario();
        System.out.println("Funcionário {" + f1.getNome() + "}, está completando {" + f1.getIdade() + "} Anos de Idade.");
    }
}
