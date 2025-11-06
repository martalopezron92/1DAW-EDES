import time

def main():
    print("=== CALCULADORA DE AREA - VERSION PYTHON ===")
    
    base = float(input("Introduce la base del triangulo: "))
    altura = float(input("Introduce la altura del triangulo: "))
    
    # Medimos tiempo
    inicio = time.time()

    # Calculamos 100,000,000 veces
    for i in range(100000000):
        area = (base * altura) / 2.0
    
    fin = time.time()
    tiempo = fin - inicio
    
    print("\n--- RESULTADOS ---")
    print(f"Base: {base}")
    print(f"Altura: {altura}")
    print(f"Area del triangulo: {area}")
    print(f"Tiempo de 100,000,000 calculos: {tiempo:.6f} segundos")

if __name__ == "__main__":
    main()