// package docs.u01.ejemplos.ciclo-vida-desarrollo-software.src;

/**
 * Calculadora simple con operaciones básicas
 * 
 * @author Tu Nombre
 * @version 1.0
 */
public class Calculadora {
    
    /**
     * Suma dos números
     * @param a Primer número
     * @param b Segundo número
     * @return La suma de a + b
     */
    public double sumar(double a, double b) {
        return a + b;
    }
    
    /**
     * Resta dos números
     * @param a Primer número
     * @param b Segundo número
     * @return La resta de a - b
     */
    public double restar(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplica dos números
     * @param a Primer número
     * @param b Segundo número
     * @return El producto de a * b
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Divide dos números
     * @param a Numerador
     * @param b Denominador
     * @return El cociente de a / b
     * @throws ArithmeticException si b es cero
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
    
    /**
     * Método principal - punto de entrada del programa
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("=== MI CALCULADORA ===");
        System.out.println();
        
        // Ejemplos de uso
        double num1 = 10;
        double num2 = 5;
        
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println();
        
        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
        System.out.println("División: " + calc.dividir(num1, num2));
        
        // Probar división por cero
        System.out.println();
        System.out.println("Intentando dividir por 0...");
        try {
            calc.dividir(num1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 
