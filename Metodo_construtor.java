package teste2;
//class Carro {

//    String marca;
//String modelo;
//    int ano;
//   String cor;

//    Carro(String marca, String modelo, int ano, String cor) {
//        this.marca = marca;
//        this.modelo = modelo;
//        this.ano = ano;
//        this.cor = cor;
//    }

//    void apresentar() {
//       System.out.println("Marca: " + marca);
//        System.out.println("Modelo: " + modelo);
//        System.out.println("Ano: " + ano);
//        System.out.println("Cor: " + cor);
//    }
//}

//public class Main {

//    public static void main(String[] args) {

//        System.out.println("Programa iniciado!");

//        Carro c1 = new Carro("Toyota", "Corolla", 2020, "Prata");
//        Carro c2 = new Carro("Honda", "Civic", 2022, "Preto");

//        c1.apresentar();

//        System.out.println();

//        c2.apresentar();
//    }
//}




//Classe Aluno
class Aluno {

 // Atributos
 String nome;
 double nota1;
 double nota2;

 // Construtor
 Aluno(String nome, double nota1, double nota2) {
     this.nome = nome;
     this.nota1 = nota1;
     this.nota2 = nota2;
 }

 // Método para apresentar o aluno
 void apresentar() {
     System.out.println("Olá, meu nome é " + nome);
 }

 // Método para calcular média
 double calcularMedia() {
     return (nota1 + nota2) / 2;
 }
}

//Classe principal com main
class Main {

 public static void main(String[] args) {

     // Criando objetos
     Aluno a1 = new Aluno("João", 8.0, 7.5);
     Aluno a2 = new Aluno("Maria", 9.0, 10.0);
     Aluno a3 = new Aluno("Carlos", 6.5, 8.0);
     Aluno a4 = new Aluno("Ana", 7.0, 9.5);

     // Apresenta alunos
     System.out.println(a1.nome);
     System.out.println(a2.nome);
     System.out.println(a3.nome);
     System.out.println(a4.nome);

     // Chamando métodos
     a1.apresentar();
     a2.apresentar();
     a3.apresentar();
     a4.apresentar();

     double m1 = a1.calcularMedia();
     double m2 = a2.calcularMedia();
     double m3 = a3.calcularMedia();
     double m4 = a4.calcularMedia();

     System.out.println("Média de João: " + m1);
     System.out.println("Média de Maria: " + m2);
     System.out.println("Média de Carlos: " + m3);
     System.out.println("Média de Ana: " + m4);
 }
}
