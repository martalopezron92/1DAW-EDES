#include <stdio.h>
#include <time.h>

int main() {
    printf("=== CALCULADORA DE AREA - VERSION C ===\n");
    
    double base, altura, area;
    
    printf("Introduce la base del triangulo: ");
    scanf("%lf", &base);
    
    printf("Introduce la altura del triangulo: ");
    scanf("%lf", &altura);
    
    // Medimos tiempo de cálculo (aunque sea insignificante)
    clock_t inicio = clock();
    
    // Calculamos el área muchas más veces para ver diferencias
    // Usamos volatile para evitar que el compilador optimice
    volatile double area_temp;
    for(int i = 0; i < 100000000; i++) {  // 100 millones de iteraciones
        area_temp = (base * altura) / 2.0;
    }
    area = area_temp;  // Asignamos el resultado final
    
    clock_t fin = clock();
    double tiempo = ((double)(fin - inicio)) / CLOCKS_PER_SEC;
    
    printf("\n--- RESULTADOS ---\n");
    printf("Base: %.2f\n", base);
    printf("Altura: %.2f\n", altura);
    printf("Area del triangulo: %.2f\n", area);
    printf("Tiempo de 100,000,000 calculos: %.6f segundos\n", tiempo);

    return 0;
}