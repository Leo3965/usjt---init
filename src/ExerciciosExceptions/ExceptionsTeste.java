package ExerciciosExceptions;

public class ExceptionsTeste {

    public static void main(String[] args) {
        System.out.println("Início main");

        ExceptionsTeste.metodo1();

        System.out.println("Fim main");
    }

    private static void metodo1() {
        System.out.println("Início metodo1");

        ExceptionsTeste.metodo2();

        System.out.println("Fim metodo1");
    }

    private static void metodo2() {
        System.out.println("Início metodo2");

        throw new ArithmeticException("Deu ruim amigo");

        System.out.println("Fim metodo2");

    }

}
