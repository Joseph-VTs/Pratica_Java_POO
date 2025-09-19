public class Carro1_Main {
    public static void main(String[] args) {

        System.out.println("\nCriando o Primeiro Carro...");
        Carro_Teste1 Car_1 = new Carro_Teste1("Ford", "Azul");
        Car_1.Exibir_Detalhes(); // Saída: Marca: Ford, Cor: Azul

        System.out.println("\n--------------------------\n");

        System.out.println("Criando o Segundo Carro...");
        Carro_Teste1 Car_2 = new Carro_Teste1("Ford");
        Car_2.Exibir_Detalhes(); // Saída: Marca: Ford, Cor: "Branco Default"

        System.out.println("\n--------------------------\n");

        System.out.println("Criando Carro Padrão");
        Carro_Teste1 Car_Faber = new Carro_Teste1();
        Car_Faber.Exibir_Detalhes();

        System.out.println("\n--------------------------\nTeste 2");
        System.out.println("Carro 1: " + Car_1);
        System.out.println("Carro 2: " + Car_2);
    }
}
