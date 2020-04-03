def quicksort(l, principio, final):
	i = principio
	j = final
	pivote = ((l[i-1]+l[j-1])/2)
	while i<j:
		while l[i-1]<pivote:
			i = i+1
		while l[j-1]>pivote:
			j = j-1
		if i<=j:
			temporal = l[i-1]
			l[i-1] = l[j-1]
			l[j-1] = temporal
			i = i+1
			j = j-1
	if principio<j:
		quicksort(l,principio,j)
	if final>i:
		quicksort(l,i,final)

if __name__ == '__main__':
	print("ingrese el tamaño del vector")
	n = int(input(n))
	numeros = [str(n) for ind0 in range(n)]

	print("ingrese los valores para llenar el vector")
	for i in range(1,n+1):
		numeros[i-1] = input()
	print("Vector Desordenado")
	for i in range(1,n+1):
		print(numeros[i-1])
	quicksort(numeros,1,n)
	
	print("Vector Ordenado de menor a mayor")
	for i in range(1,n+1):
		print(numeros[i-1])

