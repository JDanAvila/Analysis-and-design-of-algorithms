SubProceso llenar (vec, N por valor)
	Definir j como entero
	Escribir "ingrese valores de vector"
	para j=0 hasta N-1 con paso 1 hacer
		Escribir "dijite los valores del vector", j+1
		leer vec[j];
	FinPara
FinSubProceso

SubProceso mostrarr(vec, N Por Valor)
	definir j como entero
	Escribir "vector ordenado"
	para j=0 hasta N-1 con paso 1 hacer
		Escribir vec[j];
	FinPara
FinSubProceso


SubProceso burbubi(vec, N Por Valor)
	Definir i, k, aux Como Entero
	para i=1 hasta N-1 con paso 1 hacer
		para k=0 hasta (N-1-i) Con Paso 1 Hacer
			si (vec[k]>[k+1]) Entonces
				aux = vec[k]
				vec[k] = vec[k+1]
				vec[k+1] = aux
			FinSi
		FinPara
	FinPara
	
FinSubProceso



Proceso ordnarvector
	Definir vec, N como entero
	dimension vec[200]
	Escribir "digite la cantidad de elementos del vector"
	leer N
	llenar(vec,N)
	burbubi(vec,N)
	mostrarr(vec,N)
FinProceso
	