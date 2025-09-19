public class Carro_Teste1 {
    // Atributos
    String Marca;
    String Cor;


    // Métodos Construtores
    //Construtor 1
    public Carro_Teste1(String Marca, String Cor) {
        System.out.println("Chamando Construtor 1: Carro(String, String)");
        this.Marca = Marca;
        this.Cor = Cor;
    }

    //Construtor 2
    public Carro_Teste1(String Marca) {
        System.out.println("Chamando Construtor 2: Carro(String)");
        this.Marca = Marca;
        this.Cor = "Branco";
    }

    //Construtor 3
    public Carro_Teste1() {
        System.out.println("Carro de Fábrica Padrão");
        this.Marca = "Ford";
        this.Cor = "Branco";
    }


    // Métodos
    public void Exibir_Detalhes() {
        System.out.println("Marca: " + this.Marca + ", Cor: " + this.Cor);
    }



    public static void main(String[] args) {

        System.out.println("\nCriando o Primeiro Carro...");
        // Criação de Instância
        Carro_Teste1 Car_1 = new Carro_Teste1("Ford", "Azul");
        Car_1.Exibir_Detalhes(); // Saída: Marca: Ford, Cor: Azul

        System.out.println("\n--------------------------\n");
        System.out.println("Criando o Segundo Carro...");
        // Criação de Instância
        Carro_Teste1 Car_2 = new Carro_Teste1("Ford");
        Car_2.Exibir_Detalhes(); // Saída: Marca: Ford, Cor: "Branco Default"

        System.out.println("\n--------------------------\n");
        System.out.println("Criando Carro Padrão");
        // Criação de Instância
        Carro_Teste1 Car_Faber = new Carro_Teste1();
        Car_Faber.Exibir_Detalhes();

        System.out.println("\n--------------------------\nTeste 2");
        System.out.println("Carro 1: " + Car_1);
        System.out.println("Carro 2: " + Car_2);
    }
}
