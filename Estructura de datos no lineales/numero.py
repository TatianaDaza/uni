def primo (n):
    c=0
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            c= c+1
            break
    if c > 0 :
        return False
    else:
        return True
# calcular factorial
def factorial(c):
    fact=1
    for i in range(1, c+1 ,1):
        fact = fact * i
        print("el factorial", fact)


# serie fibonachi
a = b = 1
print(a)
print(b)
for i in range(2, 10):
    c = a + b
    a = b
    b = c
    print("el numero", c)
    primo(c)
    if primo(c):
        print("es primo")
        factorial(c)
    else:
        print("no es primo")
