# Verifica si un número es primo
def primo(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

# Calcula el factorial de un número y lo imprime al final
def factorial(n):
    fact = 1
    for i in range(1, n + 1):
        fact *= i
    print(f"El factorial de {n} es: {fact}")

# Genera la serie de Fibonacci y analiza cada número
def fibonacci_con_primos_y_factorial(limite):
    a = b = 1
    print(a)
    print(b)

    for i in range(2, limite):
        c = a + b
        print(f"El número es: {c}")

        if primo(c):
            print("Es primo.")
            factorial(c)
        else:
            print("No es primo.")

        a, b = b, c

# Llamada al programa principal
fibonacci_con_primos_y_factorial(10)
