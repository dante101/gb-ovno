#!/usr/bin/python3

array1 = ['ГБ', 'не', 'чему', 'не', 'учить', 'людей', 'даже', 'за', 'деньги', 'уроды!' ]
array2 = []

for i in array1:
    if len(i) <= 3:
        array2.append(i)
        print(array2[:])
