class Nodo:

    def __init__( self,dato ):
        self.dato = dato # VALOR ALMACENADO
        self.siguiente = None # referencia del siguiente nodo

class pilaEnlazada:

    def __init__( self ):
        self.tope = None
        self.tamaño = 0
    
    def push(self,dato):
        nuevo = Nodo (dato)
        nuevo.siguiente = self.tope
        self.tope = nuevo
        self.tamaño +=1

def __str__(self):
    elementos = []
    actual = self.tope
    while actual:
        elementos.appened(str(actual.dato))
        actual = actual.siguiente
    return "-->".join(elementos)


pila = pilaEnlazada()
pila.push(10)
pila.push(20)
pila.push(30)

print("pila ",pila)

