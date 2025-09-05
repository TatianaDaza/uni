class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None
        self.anterior = None

class pilaDoblementeEnlazadaCircular:
    def __init__(self):
        self.frente = None
        self.ultimo = None
        self.tamaño = 0

    def insert_front(self, dato):
        nuevo = Nodo(dato)
        if self.frente is None:  # Si la pila está vacía
            self.frente = nuevo
            self.ultimo = nuevo
            nuevo.siguiente = nuevo
            nuevo.anterior = nuevo
        else:
            nuevo.siguiente = self.frente
            nuevo.anterior = self.ultimo
            self.frente.anterior = nuevo
            self.ultimo.siguiente = nuevo
            self.frente = nuevo
        self.tamaño += 1

    def insert_back(self, dato):
        nuevo = Nodo(dato)
        if self.ultimo is None:  # Si la pila está vacía
            self.frente = nuevo
            self.ultimo = nuevo
            nuevo.siguiente = nuevo
            nuevo.anterior = nuevo
        else:
            nuevo.siguiente = self.frente
            nuevo.anterior = self.ultimo
            self.frente.anterior = nuevo
            self.ultimo.siguiente = nuevo
            self.ultimo = nuevo
        self.tamaño += 1


    def buscar(self, dato):
            actual = self.frente
            cont = 1
            while self.tamaño >= cont:
                if actual.dato == dato:
                    print("Encontrado en la posicion", cont)
                    return  # Salir cuando se encuentre
                actual = actual.siguiente
                cont += 1
            print("No encontrado")

   # def buscar(self,dato):
      #  actual = self.frente
      #  cont =1
       # while self.tamaño >= cont:
         #   if actual.dato == dato:
          #      print("Encontrado en la posicion",cont)
         #       break
         #   else:
           # actual = actual.siguiente
          #  cont+=1*/


    def eliminar_front(self):
        if self.frente is None:  # Pila vacía
            print("La pila está vacía")
            return
        elif self.frente == self.ultimo:  # Sólo hay un nodo
            self.frente = None
            self.ultimo = None
        else:
            self.frente = self.frente.siguiente
            self.frente.anterior = self.ultimo
            self.ultimo.siguiente = self.frente
        self.tamaño -= 1

    def eliminar_back(self):
        if self.ultimo is None:  # Pila vacía
            print("La pila está vacía")
            return
        elif self.frente == self.ultimo:  # Sólo hay un nodo
            self.frente = None
            self.ultimo = None
        else:
            self.ultimo = self.ultimo.anterior
            self.ultimo.siguiente = self.frente
            self.frente.anterior = self.ultimo
        self.tamaño -= 1

    def modificar(self, viejo_dato, nuevo_dato):
        actual = self.frente
        while actual != self.ultimo:
            if actual.dato == viejo_dato:
                actual.dato = nuevo_dato
                return
            actual = actual.siguientea
        if actual.dato == viejo_dato:  # Verificar también el último nodo
            actual.dato = nuevo_dato

    def insertar_ordenada(self, dato):
        nuevo = Nodo(dato)
        if self.frente is None:  # Si la pila está vacía
            self.frente = nuevo
            self.ultimo = nuevo
            nuevo.siguiente = nuevo
            nuevo.anterior = nuevo
        else:
            actual = self.frente
            while actual.dato < dato and actual != self.ultimo:
                actual = actual.siguiente
            if actual.dato >= dato:  # Insertar antes del nodo actual
                nuevo.siguiente = actual
                nuevo.anterior = actual.anterior
                actual.anterior.siguiente = nuevo
                actual.anterior = nuevo
                if actual == self.frente:
                    self.frente = nuevo
            else:  # Insertar al final
                self.insert_back(dato)
        self.tamaño += 1

    def __str__(self):
        elementos = []
        actual = self.frente
        if self.frente is not None:
            while True:
                elementos.append(str(actual.dato))
                actual = actual.siguiente
                if actual == self.frente:
                    break
        return " <--> ".join(elementos)

# Ejemplo de uso
pila = pilaDoblementeEnlazadaCircular()
pila.insert_back(10)
pila.insert_back(20)
pila.insert_back(30)
pila.insert_back(50)

print("Pila antes de modificaciones:", pila)

# Insertar ordenadamente
pila.insertar_ordenada(25)
pila.insertar_ordenada(40)
pila.insertar_ordenada(50)
print("Pila después de insertar 25, 40 , 50 ordenado:", pila)

# Modificar un valor
pila.modificar(20, 22)
pila.modificar(10,75)
print("Pila después de modificar 20 por 22 y 10 por 75:", pila)

# Eliminar el primer elemento
pila.eliminar_front()
pila.eliminar_front()
print("Pila después de eliminar el primer y sgundo elemento:", pila)

# Eliminar el último elemento
pila.eliminar_back()
pila.eliminar_back()
print("Pila después de eliminar el último y pen ultimo elemento:", pila)

pila.buscar(25)
print("la pila despues de buscar 25 es",pila)