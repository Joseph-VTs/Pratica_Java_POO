package Desafios;

public class Controle_Pedidos {

    public static class Cliente {
        // Atributos
        private String CPF;
        private String Nome;
        private String E_Mail;
        private String Endereco;

        // Métodoo Construtor
        public Cliente(String CPF, String Nome, String E_Mail, String Endereco) {
            this.CPF = CPF;
            this.Nome = Nome;
            this.E_Mail = E_Mail;
            this.Endereco = Endereco;
        }

        public Cliente() {
            this.CPF = "";
            this.Nome = "";
            this.E_Mail = "";
            this.Endereco = "";
        }

        // Métodos Getters + Métodos Setters
        public String getCPF() { return CPF; }
        public void setCPF(String CPF) { this.CPF = CPF; }

        public String getNome() { return Nome; }
        public void setNome(String nome) { this.Nome = nome; }

        public String getE_Mail() { return E_Mail; }
        public void setE_Mail(String e_Mail) { this.E_Mail = e_Mail; }

        public String getEndereco() { return Endereco; }
        public void setEndereco(String endereco) { Endereco = endereco; }

        @Override
        public String toString() {
            return "Informações do Cliente: " + this.Nome + "\n" +
                "-> CPF: " + this.CPF +
                " | E-Mail: " + this.E_Mail +
                " | Endereço: " + this.Endereco
            ;
        }
    }

    public static class Produtos{

        //Atributos
        private int Codigo;
        private String Nome;
        private double Preco;

        // Métodoo Construtor
        public Produtos(int Codigo, String Nome, double Preco){
            this.Codigo = Codigo;
            this.Nome = Nome;
            this.Preco =Preco;
        }

        public Produtos(){
            this.Codigo = 0;
            this.Nome = "";
            this.Preco = 0.00;
        }

        // Getters + Setters
        public int getCodigo() {
            return Codigo;
        }
        public void setCodigo(int codigo) {
            this.Codigo = codigo;
        }

        public String getNome() {
            return Nome;
        }
        public void setNome(String nome) {
            this.Nome = nome;
        }

        public double getPreco() {
            return Preco;
        }
        public void setPreco(double preco) {
            this.Preco = preco;
        }

        @Override
        public String toString() {
            return "Informações do Produto: " + this.Nome + "\n" +
                "-> Código: " + this.Codigo +
                " | Preço: " + this.Preco
            ;
        }
    }

    public static void main(String[] args) {


        Controle_Pedidos.Cliente Cliente_01 = new Controle_Pedidos.Cliente();

        System.out.println("\n------------------------------------------------------------------------------------------");
        Cliente_01.setNome("João");
        Cliente_01.setCPF("000.000.000-00");
        Cliente_01.setE_Mail("João@gmial.com");
        Cliente_01.setEndereco("Rua Larga das Pombas");

        // System.out.println(Cliente_01.toString());
        System.out.println("Informações do Cliente: " + Cliente_01.getNome() +
                "\n-> CPF: " + Cliente_01.getCPF() + " | E-mail: " + Cliente_01.getE_Mail() + " | Endereço: " + Cliente_01.getEndereco());



        Controle_Pedidos.Produtos Produto_01 = new Controle_Pedidos.Produtos();
        System.out.println("\n------------------------------------------------------------------------------------------");
        Produto_01.setNome("Pastel");
        Produto_01.setCodigo(1);
        Produto_01.setPreco(5.50);

        // System.out.println(Produto_01.toString());
        System.out.println("Lista de Produtos: " +
                "\n-> Nome:" + Produto_01.getNome() + " | Código: " + Produto_01.getCodigo() + " | Preço: " + Produto_01.getPreco());


        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.println("\nTentativa / Layout 1");
        System.out.println("Produto" + "\tPreço" + "\tCódigo");
        System.out.println(Produto_01.getNome() + "\t" + Produto_01.getPreco() + "\t" + Produto_01.getCodigo());
        System.out.println("\nTentativa / Layout 2");
        System.out.println("Produto: " + Produto_01.getNome() + "\t\t| Preço: " + Produto_01.getPreco() + "\t| Código: " + Produto_01.getCodigo());



        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.println("\nTentativa / Layout 3");
        System.out.println(String.format(
                "| Código: %02d | Preço: R$ %.2f | Produto: %-20s",
                Produto_01.getCodigo(),
                Produto_01.getPreco(),
                Produto_01.getNome()
        ));
        System.out.println();

        /*Explicação dos formatos
            %-20s: String com no mínimo 20 caracteres, alinhada à esquerda.
            %02d: Inteiro com 2 dígitos, preenchido com zero à esquerda se necessário.
            %.2f: Número decimal com 2 casas após a vírgula.
        */



        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("Tentativa / Layout 4\n");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(String.format("| %-4s | %-11s | %-20s |", "Cod", "Preço", "Produto"));
        System.out.println("--------------------------------------------------------------------------------");

        // Inserindo os Dados
        System.out.println(String.format(
                "| %04d | R$ %8.2f | %-20s |",
                Produto_01.getCodigo(),
                Produto_01.getPreco(),
                Produto_01.getNome()
        ));

        System.out.println(String.format(
                "| %04d | R$ %8.2f | %-20s |",
                Produto_01.getCodigo(),
                Produto_01.getPreco(),
                Produto_01.getNome()
        ));

        Produto_01.setPreco(123.84);
        System.out.println(String.format(
                "| %04d | R$ %8.2f | %-20s |",
                Produto_01.getCodigo(),
                Produto_01.getPreco(),
                Produto_01.getNome()
        ));


    }
}


