class Nodo:
    def__init__(self,dato):
        self.dato = dato # VALOR ALMACENADO
        self.siguiente = None # referencia del siguiente nodo

class pilaEnlazada:
    def__init__(self):
        self.tope = None
        self.tamaño = 0
    
    def push(self,dato):
        nuevo = Nodo (dato)
        nuevo.siguiente = self.tope
        self.tope = nuevo
        

    



