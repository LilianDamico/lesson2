package curso_java;

import java.util.Scanner;//nunca se esquça de importar a classe Scanner

public class lesson2 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        double numero = teclado.nextDouble();
        double dobro = numero * 2;
        System.out.println("O dobro do número digitado é "+dobro);

    }
}
