// package docs.u01.ejemplos.traductores;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA DE AREA - VERSION JAVA ===");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la base del triangulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Introduce la altura del triangulo: ");
        double altura = scanner.nextDouble();
        
        // Medimos tiempo
        long inicio = System.nanoTime();
        
        double area = 0;
        // Calculamos 100,000,000 veces
        for(int i = 0; i < 100000000; i++) {
            area = (base * altura) / 2.0;
        }
        
        long fin = System.nanoTime();
        double tiempo = (fin - inicio) / 1_000_000_000.0;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area del triangulo: " + area);
        System.out.println("Tiempo de 100,000,000 calculos: " + 
                          String.format("%.6f", tiempo) + " segundos");
        
        scanner.close();
    }
} 