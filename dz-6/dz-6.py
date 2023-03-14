#!/usr/bin/python3

#Task 30
a1 = int(input('Введите первый элемент прогрессии: '))
d = int(input('Введите разность прогрессии: '))
n = int(input('Введите число элементов прогрессии: '))
array = [a1+((n-1)*d) for n in range(1,n+1)]
print(array)


#Task 32
import random
array = [int(i) for i in input('Введите элементы массива: ').split()]
print(array)
min = int(input('Введите минимум: '))
max = int(input('Введите максимум: '))


for i in range(len(array)):
    if array[i]>=min and array[i]<=max:
        print(i, end=' ')
