import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    
        System.out.println("Qual a temperatura em graus Farenheit (ºF)? ");
        double tempF = console.nextDouble();
        
        double tempC = 5 * ((tempF - 32)/9);
        
        System.out.printf("A temperatura em graus Celsius (ºC) é igual a %.2f", tempC);

        console.close();
    }
}