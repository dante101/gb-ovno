from random import randint

n = int(input("Введите кол-во чисел в массиве:  "))
n_list = [randint(1, 10) for i in range(n)]
print(n_list)
k = int(input("Введите число для поиска:  "))
n_list.count(k)
print(f" Ваше число {k} встречаеться в кол-ве: {n_list.count(k)} ")
    
