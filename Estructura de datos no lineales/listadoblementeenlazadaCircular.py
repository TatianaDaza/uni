class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None
        self.anterior = None

class pilaDoblementeEnlazadaCircular:
    def __init__(self):
        self.frente= None
        self.ultimo =None
        self.tamaño = 0

    def insert_front(self, dato):
        nuevo = Nodo(dato)
        if self.frente == None:
            self.frente = nuevo 
            self.ultimo = nuevo
            nuevo.siguiete = nuevo
            nuevo.anterior = nuevo
        else:
            self.frente.siguiente = nuevo
            nuevo.anterior = self.frente
            nuevo.siguiente= self.ultimo
            self.ultimo.anterior = nuevo
            self.frente = nuevo

        self.tamaño += 1

    def insert_back(self,dato):
        nuevo = Nodo(dato)
        if self.ultimo == None:
            self.frente = nuevo 
            self.ultimo = nuevo 
            
            
        else:
            self.ultimo.anterior = nuevo
            nuevo.siguiente = self.ultimo
            nuevo.anterior= self.frente
            self.frente.anterior = nuevo
            self.ultimo = nuevo
        self.tamaño +=1

    def __str__(self):
        elementos = []
        actual = self.ultimo
        cont = 1
        while actual!= self.tamaño >=cont :
            elementos.append(str(actual.dato))
            actual = actual.siguiente
            #actual= actual.anterior
            cont+=1
        return " <-->".join(elementos)

    

# Ejemplo de uso
pila = pilaDoblementeEnlazadaCircular()
pila.insert_back(10)
pila.insert_back(20)
pila.insert_back(30)
pila.insert_back(50)

#pila.insert_front(10)
#pila.insert_front(20)
#pila.insert_front(30)
#pila.insert_front(40)
#pila.insert_front(50)

print("Pila:", pila)