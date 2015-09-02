import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Tiago
 * Date: 24/08/15
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */
public class Teclado {

    Scanner tc = new Scanner(System.in);

    public int lerInt(){
        System.out.println("Digite um inteiro");
        return tc.nextInt();
    }

    public void lerInt(String a, int b){
        System.out.println(a);
        b= tc.nextInt();
    }
    public void lerInt(int b){
        System.out.println("Digite um inteiro");
        b= tc.nextInt();
    }
    public void lerInt(String a){
        System.out.println(a);
        tc.nextInt();
    }


    // Double
    public double lerDouble(){
        System.out.println("Digite um inteiro");
        return tc.nextDouble();
    }

    public void lerDouble(String a, double b){
        System.out.println(a);
        b= tc.nextDouble();
    }
    public void lerDouble(double b){
        System.out.println("Digite um double");
        b= tc.nextDouble();
    }
    public void lerDouble(String a){
        System.out.println("Digite um double");
        System.out.println(a);
        tc.nextDouble();
    }


    //Float
    public float lerFloat(){
        System.out.println("Digite um float");
        return tc.nextFloat();
    }
    public void lerFloat(String a, float b){
        System.out.println(a);
        b= tc.nextFloat();
    }
    public void lerFloat(float b){
        System.out.println("Digite um float");
        b= tc.nextFloat();
    }
    public void lerFloat(String a){
        System.out.println("Digite um float");
        System.out.println(a);
        tc.nextFloat();
    }


    //Char

    public char charAt(){
        System.out.println("Digite um char");
        return tc.next().charAt(0);
    }
    public void lerChar(String a, char b){
        System.out.println(a);
        b= tc.next().charAt(1);
    }
    public void lerChar(char b){
        System.out.println("Digite um char");
        b= tc.next().charAt(2);
    }
    public void lerChar(String a){
        System.out.println("Digite um char");
        System.out.println(a);
        tc.next().charAt(1);
    }
    //String
    public String lerString(){
        System.out.println("Digite uma string");
        return tc.next();
    }

    public void lerIString(String a, String b){
        System.out.println(a);
        b= tc.next();
    }
    public void lerString(String b){
        System.out.println("Digite uma string");
        b= tc.next();
    }
    public void lerString1(String a){
        System.out.println(a);
        return tc.next();
    }


}
