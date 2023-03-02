from random import randint

n = int(input("Введите кол-во чисел в массиве:  "))
n_list = [randint(1, 10) for i in range(n)]
print(n_list)
k = int(input("Введите число для поиска ближайшего:  "))

b = [abs(k - i) for i in n_list]

print(f" Ближайшее к вашему числу {k} являеться число: {n_list[b.index(min(b))]} ")

