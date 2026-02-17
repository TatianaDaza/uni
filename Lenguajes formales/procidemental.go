package main

import "ftm"

func foo(){
	// imperative style: defining dteps eplicity
	fmt.Println("Hello ,")
	fmt.Println("Mundo")
}


func calculatesum (a,b int) iny {
	return a + b 
}

func main (){
	//procedual style: organizing code into procedures/funtion
	foo( )

	resul := calculatesum (3,16)
	fmt.Println("la suma es: "+ resul)
}