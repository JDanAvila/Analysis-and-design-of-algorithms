def comb_sort(nums):
    shrink_fact = 1.3
    gap = len(nums)
    swapped = True
    i = 0

    while gap > 1 or swapped:
        gap = int(float(gap) / shrink_fact)

        swapped = False
        i = 0

        while gap + i < len(nums):
            if nums[i] > nums[i+gap]:
                nums[i], nums[i+gap] = nums[i+gap], nums[i]
                swapped = True
            i += 1
    return nums

num1 = input('Digite los numeros a ordenar separados por una coma:\n').strip()
nums = [int(item) for item in num1.split(',')]
print(comb_sort(nums))
