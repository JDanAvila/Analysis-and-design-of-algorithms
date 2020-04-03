class Sort:
    def __init__(sort, v):
        sort.v = v
    
    def get_sorted(sort):
        length = len(sort.v)
        i = 1
        while i < length:
            if i == 0:
                i = i + 1
                
            if sort.v[i] >= sort.v[i-1]:
                i += 1
            else:
                sort.v[i], sort.v[i-1] = sort.v[i-1], sort.v[i]
                i -= 1
        return sort.v

def main():
    v = list(map(int, input("Digite los datos del vector a ordenar: ").split(' ')))
    obj = Sort(v)
    sorted_v = obj.get_sorted()
    print("Sorted Array:", end = ' ')
    print(*sorted_v)

if __name__ == "__main__":
    main()
