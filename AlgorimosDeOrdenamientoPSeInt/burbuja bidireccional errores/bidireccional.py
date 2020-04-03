# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


# En python no hay forma de elegir como pasar una variable a una
# funcion (por referencia o por valor). Las variables "inmutables"
# (str, int, float, bool) se pasan siempre por copia mientras que
# las demas (listas, objetos, etc.) se pasan siempre por referencia.
# Esto coincide con el comportamiento por defecto en pseint, pero
# cuando utiliza las palabras clave "Por Referencia" para
# alterarlo la traducción no es correcta.

def llenar(vec, n):
	j = int()
	print("ingrese valores de vector")
	for j in range(n):
		print("dijite los valores del vector",j+1)
		vec[j-1] = input()

def mostrarr(vec, n):
	j = int()
	print("vector ordenado")
	for j in range(n):
		print(vec[j-1])

def burbubi(vec, n):
	i = int()
	k = int()
	aux = int()
	for i in range(1,n):
		for k in range((n-1-i)+1):
			if (vec[k-1]>(k+1)):
				aux = vec[k-1]
				vec[k-1] = vec[k]
				vec[k] = aux

if __name__ == '__main__':
	vec = int()
	n = int()
	vec = [int() for ind0 in range(200)]
	print("digite la cantidad de elementos del vector")
	n = int(input())
	llenar(vec,n)
	burbubi(vec,n)
	mostrarr(vec,n)

