Algoritmo metodo_Burbuja
	Dimension burbuja(10)
	v=7
	para i <- 1 Hasta v con paso 1 Hacer
		Escribir "ingrese los datos a ordenar";
		leer burbuja(i);
	FinPara
	para i <-2 hasta v con paso 1 hacer
		para g<-1 hasta v-i+1 con paso 1 hacer
			si burbuja(g)>burbuja(g+1) entonces
				aux=burbuja(g)
				burbuja(g)=burbuja(g+1)
				burbuja(g+1)=aux
			FinSi
		FinPara
	FinPara
	Escribir "vector ordenado acendentemente:"
	para i<-1 hasta v con paso 1 Hacer
	Escribir "[" ,i,"] : ", burbuja(i)
	FinPara
FinAlgoritmo
