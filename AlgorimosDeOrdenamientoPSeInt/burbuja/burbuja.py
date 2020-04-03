# llena el  vector
def llenar(a, tamano):
	print("digite los datos para llenar el vector")
	for i in range(1,tamano+1):
		n = input()
		a[i-1] = n

# define el tamaño del vector
def esc(arreglo, tamano):
	for i in range(1,tamano+1):
		print(arreglo[i-1])

# ordena el vector
def ordenamiento(a, tam):
	for i in range(1,tam+1):
		for j in range(1,tam):
			if a[j-1]>a[j]:
				temp = a[j-1]
				a[j-1] = a[j]
				a[j] = temp

# imnprime el vector
if __name__ == '__main__':
	print("Tamaño del vector: ")
	tam = int(input())
	arreglo = [str() for ind0 in range(tam)]
	llenar(arreglo,tam)
	print("Arreglo desordenado: ")
	esc(arreglo,tam)
	ordenamiento(arreglo,tam)
	print("Arreglo ordenado Acendentemente de menor a mayor: ")
	esc(arreglo,tam)

