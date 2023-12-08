package io.github.joaopepe10;

import java.util.Scanner;

public class Menu {

    public  void chamarMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int x = in.nextInt();
        System.out.println("Digite um segundo numero: ");
        int y = in.nextInt();

        System.out.println("Escolha uma opcao" +
                "\n 1-SOMAR" +
                "\n 2-SUBTRAIR" +
                "\n 3-DIVIDIR" +
                "\n 4-MULTIPLICAR");
        int opc = in.nextInt();
        switch (opc){
            case 1:
                System.out.println(this.somar(x, y));
                this.chamarMenu();
                break;
            case 2:
                System.out.println(this.subtrair(x, y));
                this.chamarMenu();
                break;
            case 3:
                System.out.println(this.dividir(x, y));
                this.chamarMenu();
                break;
            case 4:
                System.out.println(this.multiplicar(x, y));
                this.chamarMenu();
                break;
            default:
                System.out.println("Opcao invalida, tente novamente!");
        }
    }

    private double somar(double i, double x){
        return i + x;
    }

    private double subtrair(double i, double x){
        return i - x;
    }

    private double dividir(double i, double x){
        return i / x;
    }

    private double multiplicar(double i, double x){
        return i * x;
    }
}
