Algoritmo sin_titulo
	Escribir "Ingrese el tamaño del vector: "
	leer n
	Dimension v[n]
	Escribir "Ingrese los valores para llenar el vector: "
	para i=1 hasta n con paso 1 Hacer
		leer v[i]
	FinPara
	
	interno=trunc(n/2)
	mientras interno!=0 Hacer
		para i=interno hasta n con paso 1 Hacer
			j=i-interno
			Mientras j>=1 Hacer
				k=j+interno
				si v[j] <= v[k] entonces
					j=j-1
				SiNo
					aux=v[j]
					v[j]=v[k]
					v[k]=aux
					j=j-interno
				finsi
			FinMientras
		FinPara
		interno=trunc (interno/2)
	FinMientras
	Escribir "El vector ordenado es: "
	para i=1 hasta n Con Paso 1 Hacer
		Escribir v[i]," "
	FinPara
FinAlgoritmo
