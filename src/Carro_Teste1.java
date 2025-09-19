public class Carro_Teste1 {
    // Atributos
    String Marca;
    String Cor;



    // Métodos Construtores
    //Construtor 1
    public Carro_Teste1(String Marca, String Cor){
        System.out.println("Chamando Construtor 1: Carro(String, String)");
        this.Marca = Marca;
        this.Cor =Cor;
    }
    //Construtor 2
    public Carro_Teste1(String Marca){
        System.out.println("Chamando Construtor 2: Carro(String)");
        this.Marca =Marca;
        this.Cor = "Branco";
    }
    //Construtor 3
    public Carro_Teste1(){
        System.out.println("Carro de Fábrica Padrão");
        this.Marca = "Ford";
        this.Cor = "Branco";
    }



    // Métodos
    public void Exibir_Detalhes(){
        System.out.println("Marca: " + this.Marca + ", Cor: " + this.Cor);
    }
}

class Funcionarios{
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