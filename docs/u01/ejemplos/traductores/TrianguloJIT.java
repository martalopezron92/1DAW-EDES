// package docs.u01.ejemplos.traductores;

public class TrianguloJIT {
    public static double calcularArea(double base, double altura) {
        return (base * altura) / 2.0;
    }
    
    public static void main(String[] args) {
        double base = 10;
        double altura = 20;
        
        System.out.println("=== DEMOSTRACION JIT ===");
        
        // Primera ejecución (sin JIT)
        long inicio = System.nanoTime();
        for(int i = 0; i < 100000000; i++) {
            calcularArea(base, altura);
        }
        long tiempo1 = System.nanoTime() - inicio;
        
        // Muchas ejecuciones para activar JIT
        for(int i = 0; i < 10000000; i++) {
            calcularArea(base, altura);
        }
        
        // Segunda ejecución (con JIT optimizado)
        inicio = System.nanoTime();
        for(int i = 0; i < 100000000; i++) {
            calcularArea(base, altura);
        }
        long tiempo2 = System.nanoTime() - inicio;
        
        System.out.println("Tiempo SIN JIT: " + (tiempo1/1000000.0) + " ms");
        System.out.println("Tiempo CON JIT: " + (tiempo2/1000000.0) + " ms");
        System.out.println("Mejora: " + (tiempo1/(double)tiempo2) + "x mas rapido");
    }
}