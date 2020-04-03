if __name__ == '__main__':
	print("ingrese el tamaño del vector")
	n = int(input())
	vector = [str() for ind0 in range(n)]
	print("ingrese los valores para llenar el vector")
	for i in range(1,n+1):
		vector[i-1] = input()
	k = 1
	for i in range(1,n+1):
			for j in range(1,k+1):
				if vector[k-1]<vector[j-1]:
					auxiliar = vector[k-1]
					vector[k-1] = vector[j-1]
					vector[j-1] = auxiliar
				else:
					vector[k-1] = vector[k-1]
					vector[j-1] = vector[j-1]
			k = k+1
	
	print("vector ordenadon es: ")
	for i in range(1,n+1):
		print(vector[i-1])

