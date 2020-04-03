Funcion quicksort ( L, principio, final )
    i<-principio
    j<-final
    pivote<-(L[i]+L[j])/2
    
    Mientras i<j Hacer
        Mientras L[i]<pivote Hacer
            i<-i+1
        Fin Mientras
        Mientras L[j]>pivote Hacer
            j<-j-1
        Fin Mientras
        Si i<=j Entonces
            temporal<-L[i]
            L[i]<-L[j]
            L[j]<-temporal
            i<-i+1
            j<-j-1
        Fin Si
    Fin Mientras
    
    Si principio<j Entonces
        quicksort(L,principio,j)
    Fin Si
    
    Si final>i Entonces
        quicksort(L,i,final)
    Fin Si
    
Fin Funcion

Algoritmo ordenar
	Escribir "ingrese el tamaño del vector"
	leer n
	Dimension num[n]
	
	Escribir "ingrese los valores para llenar el vector"
	para i=1 hasta n con paso 1 Hacer
		leer num[i]
	FinPara
	
    Escribir "Vector Desordenado"
    Para i<-1 Hasta n Con Paso 1 Hacer
        Escribir num[i]
    Fin Para
    
    quicksort(num,1,n)
    
    Escribir "Vector Ordenado de menor a mayor"    
    Para i<-1 Hasta n Con Paso 1 Hacer
        Escribir num[i]
    Fin Para
FinAlgoritmo


