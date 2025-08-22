def primo (n):
    c=0
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            c= c+1
            break
    if c > 0 :
        print ("El numero no es primo")
    else:
        print ("El numero es primo")

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
    