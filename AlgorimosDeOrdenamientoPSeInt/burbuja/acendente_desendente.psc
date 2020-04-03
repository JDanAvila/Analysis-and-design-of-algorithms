subproceso llenar(A,tamano) // llena el  vector
	Escribir "digite los datos para llenar el vector"
	para i=1 hasta tamano con paso 1 hacer
		leer n
		A[i]=n
	FinPara
FinSubproceso


SubProceso Esc(Arreglo,tamano) // define el tamaño del vector
	para i=1 hasta tamano con paso 1 hacer
		Escribir Arreglo[i]
	FinPara
FinSubProceso


SubProceso ordenamiento(A,tam) // ordena el vector
	para i=1 hasta tam con paso 1 hacer
		para j=1 hasta tam -1 con paso 1 Hacer
			si A[j]>A[j+1] entonces
				temp = A[j]
				A[j] = A[j+1]
				A[j+1] = temp
			FinSi
		FinPara
	FinPara
FinSubProceso



Proceso ordenamiento_Burbuja// imnprime el vector
	Escribir "Tamaño del vector: "
	leer tam
	Dimension Arreglo[tam]
	llenar(Arreglo,tam)
	Escribir "Arreglo desordenado: "
	Esc(Arreglo,tam)
	ordenamiento(Arreglo,tam)
	Escribir "Arreglo ordenado Acendentemente de menor a mayor: "
	Esc(Arreglo,tam)
FinProceso
	