if __name__ == '__main__':
	print("ingrese el tamaño del vector")
	n = int(input())
	v = [str() for ind0 in range(n)]
	print("ingrese los valores para llenar el vector")
	for i in range(1,n+1):
		v[i-1] = input()
	print("1 ordena menor a mayor || 2 ordena mayor a menor")
	ordenar = input()
	if ordenar==1:
		for i in range(1,n+1):
			min = i
			for j in range(i+1,n+1):
				if v[min-1]>v[j-1]:
					min = j
			temp = v[min-1]
			v[min-1] = v[i-1]
			v[i-1] = temp
	else:
		for i in range(1,n+1):
			min = i
			for j in range(i+1,n+1):
				if v[min-1]<v[j-1]:
					min = j
			temp = v[min-1]
			v[min-1] = v[i-1]
			v[i-1] = temp
	print("vector ordenadon es: ")
	for i in range(1,n+1):
		print(v[i-1])

