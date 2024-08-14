public class Main {
    public static void main(String[] args) {
        //exercicio 1
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Guilherme";
        aluno1.idade = "20";
        aluno1.curso = "Ciencia da Computação";

        System.out.println("\nEu me chamo " + aluno1.nome + ", eu tenho " + aluno1.idade + " anos e faço " + aluno1.curso);
        //fim da 1

        //exercicio 2
        Livro livro1 = new Livro();
        livro1.titulo = "Um Curso de Cálculo - Vol. 1";
        livro1.auto = "Hamilton Luiz Guidorizzi";
        livro1.ano = 2001;
        exibir(livro1.titulo, livro1.auto, livro1.ano);

        //exercicio 3
        Retangulo retangulo1 = new Retangulo();
        retangulo1.comprimento = 8.50;
        retangulo1.largura = 12.80;
        areaRetangulo(retangulo1.comprimento, retangulo1.largura);

        //exercicio 4
        Triangulo triangulo1 = new Triangulo();
        triangulo1.ladoA = 4;
        triangulo1.ladoB = 8;
        triangulo1.ladoC = 9;
        System.out.println("Tipo do triangulo1: " + obterTipo(triangulo1.ladoA, triangulo1.ladoB, triangulo1.ladoC));
    }

    //exercicio 2
    public static void exibir(String titulo, String auto, int ano) {

        System.out.println("\nNome do livro: " + titulo + "\nAutor: " + auto + "\nAno: " + ano);
    }
    //fim da 2

    //exercicio 3
    public static double calcularArea(double comprimento, double largura) {

        return (comprimento * largura);
    }

    public static void areaRetangulo(double comprimento, double largura){

        System.out.println("\nArea do retangulo: " + calcularArea(comprimento, largura));
    }
    //fim da 3

    //exercicio 4
    public static boolean formaTriangulo(double ladoA, double ladoB, double ladoC){

            return (ladoA < ladoB + ladoC & ladoB < ladoA + ladoC & ladoC < ladoA + ladoB);
    }

    public static String obterTipo(double ladoA, double ladoB, double ladoC) {

        System.out.println("\n" + formaTriangulo(ladoA, ladoB, ladoC));
        boolean verificacao = formaTriangulo(ladoA,ladoB,ladoC);

        if (!verificacao){
            return "null";
        }
        if (ladoA == ladoB & ladoA == ladoC & ladoB == ladoC){
            return "Equilatero";
        }
        if (ladoA == ladoB & ladoA != ladoC & ladoB != ladoC){
            return "Isosceles";
        }
        if (ladoA != ladoB & ladoA != ladoC & ladoB != ladoC){
            return "Escaleno";
        }
        return ";)";
    }
    //fim da 4
}