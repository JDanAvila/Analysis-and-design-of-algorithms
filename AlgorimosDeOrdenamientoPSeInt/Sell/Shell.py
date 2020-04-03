if __name__ == '__main__':
	print("Ingrese el tamaño del vector: ")
	n = int(input())
	v = [str() for ind0 in range(n)]
	print("Ingrese los valores para llenar el vector: ")
	for i in range(1,n+1):
		v[i-1] = input()
	interno = int(n/2)
	while interno!=0:
		for i in range(interno,n+1):
			j = i-interno
			while j>=1:
				k = j+interno
				if v[j-1]<=v[k-1]:
					j = j-1
				else:
					aux = v[j-1]
					v[j-1] = v[k-1]
					v[k-1] = aux
					j = j-interno
		interno = int(interno/2)
	print("El vector ordenado es: ")
	for i in range(1,n+1):
		print(v[i-1]," ")

