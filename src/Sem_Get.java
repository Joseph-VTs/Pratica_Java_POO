public class Sem_Get {
    // Atributos
    String Nome;
    int Idade;

    // Construtor
    public Sem_Get(String Nome, int Idade){
        this.Nome = Nome;
        this.Idade = Idade;
    }

    public static void main(String[] args) {

        // Criação de Instância
        Sem_Get p1 = new Sem_Get("Ronaldo", 37);
        System.out.println("\nTeste 1: " + p1);

        p1.Nome = "Hietro";
        System.out.println("\nTeste 2: " + p1.Nome);
        p1.Nome = "Carlos";
        System.out.println("\nTeste 3: " + p1.Nome);
        p1.Nome = "Serman";
        System.out.println("\nTeste 4: " + p1.Nome);
        p1.Nome = "Delaotru";
        System.out.println("\nTeste 5: " + p1.Nome);
    }
}
