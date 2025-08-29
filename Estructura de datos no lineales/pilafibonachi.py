# Clase Nodo para la pila enlazada
class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None

# Clase PilaEnlazada
class PilaEnlazada:
    def __init__(self):
        self.tope = None
        self.tamaño = 0

    def push(self, dato):
        nuevo = Nodo(dato)
        nuevo.siguiente = self.tope
        self.tope = nuevo
        self.tamaño += 1

    def __str__(self):
        elementos = []
        actual = self.tope
        while actual:
            elementos.append(str(actual.dato))
            actual = actual.siguiente
        return " --> ".join(elementos) if elementos else "Pila vacía"

# Verifica si un número es primo
def primo(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

# Calcula el factorial de un número y lo devuelve
def factorial(n):
    fact = 1
    for i in range(1, n + 1):
        fact *= i
    return fact

# Función principal: Fibonacci, primos, factoriales y pila
def fibonacci_con_primos_y_pila(limite):
    a = b = 1
    pila_primos = PilaEnlazada()

    print(a)
    print(b)

    for _ in range(2, limite):
        c = a + b
        print(f"\nNúmero Fibonacci: {c}")

        if primo(c):
            print("Es primo.")
            f = factorial(c)
            print(f"Factorial de {c} es: {f}")
            pila_primos.push(c)
        else:
            print("No es primo.")

        a, b = b, c

    print("\n=== Pila de números primos encontrados en la serie Fibonacci ===")
    print(pila_primos)

# Ejecutar el programa
fibonacci_con_primos_y_pila(10)
