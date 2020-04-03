Algoritmo sin_titulo
	Escribir "ingrese el tamaño del vector"
	leer n
	Dimension vector[n]
	Escribir "ingrese los valores para llenar el vector"
	para i=1 hasta n con paso 1 Hacer
		leer vector[i]
	FinPara
	k<-1
	Escribir "1 ordena menor a mayor || 2 ordena mayor a menor"
	leer ordenar
	si ordenar = 1 entonces 
		Para i<-1 Hasta n Con Paso 1 Hacer
			Para j<-1 Hasta k Con Paso 1 Hacer
				Si vector[k]<vector[j] Entonces
					auxiliar<-vector[k];
					vector[k]<-vector[j];
					vector[j]<-auxiliar;
				Sino
					vector[k]<-vector[k];
					vector[j]<-vector[j];
				FinSi
			FinPara
			
			k<-k+1;
			
		FinPara
		
		
	SiNo
		Para i<-1 Hasta n Con Paso 1 Hacer
			Para j<-1 Hasta k Con Paso 1 Hacer
				Si vector[k]>vector[j] Entonces
					auxiliar<-vector[k];
					vector[k]<-vector[j];
					vector[j]<-auxiliar;
				Sino
					vector[k]<-vector[k];
					vector[j]<-vector[j];
				FinSi
			FinPara
			
			k<-k+1;
			
		FinPara
		
	FinSi
	Escribir "vector ordenadon es: "
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir vector[i];
	FinPara
	
FinAlgoritmo
