package Desafios;

public class Aluno {
    // Atributos
    String Nome_Aluno;
    String Endereco_Residencial;
    String Telefone;
    String Email;
    int Matricula;

    public static void main(String[] args) {
        Aluno a2 = new Aluno();

        a2.Nome_Aluno = "Joertonino";
        a2.Endereco_Residencial = "Semangaloirei";
        a2.Telefone = "51 9.1234-1234";
        a2.Email = "Aluno_2@gmail.com";
        a2.Matricula = 370824;

        System.out.println("\nNome: " + a2.Nome_Aluno + " Matrícula: " + a2.Matricula + " Endereço: "
                + a2.Endereco_Residencial + " Telefone: " + a2.Telefone + " E-mail: " + a2.Email);
    }
}
