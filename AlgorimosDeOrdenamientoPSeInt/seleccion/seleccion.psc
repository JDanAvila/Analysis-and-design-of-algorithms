Algoritmo seleecion
	Escribir "ingrese el tamaño del vector"
	leer n
	Dimension v[n]
	Escribir "ingrese los valores para llenar el vector"
	para i=1 hasta n con paso 1 Hacer
		leer v[i]
	FinPara
	Escribir "1 ordena menor a mayor || 2 ordena mayor a menor"
	leer ordenar
	si ordenar = 1 entonces 
		para i=1 hasta n con paso 1 hacer
			min=i
			para j=i+1 hasta n con paso 1 hacer
				si v[min] > v[j] entonces
					min=j
				FinSi
			FinPara
			temp=v[min]
			v[min]=v[i]
			v[i]=temp
		FinPara
	sino 
		para i=1 hasta n con paso 1 hacer
			min=i
			para j=i+1 hasta n con paso 1 hacer
				si v[min] < v[j] entonces
					min=j
				FinSi
			FinPara
			temp=v[min]
			v[min]=v[i]
			v[i]=temp
		FinPara
	FinSi
	
	Escribir "vector ordenadon es: "
	para i=1 hasta n con paso 1 hacer
		escribir v[i]
	FinPara
	
	
FinAlgoritmo
