#!/usr/bin/python3

# stupid task 1
a = 123
a = a % 10
b = 12 % 10
c = 1 % 10
total = a + b + c
print(total)

# stupid task 2
s = int(input("Enter first number:"))
p = int(input("Enter second number:"))
k = (s + p) * 2
total2 = k + p + s
print(total2)

# stupid task 3
n = input("Your number please:")
print(n)
v = n.split()
print(v)
list1 = map(int, v)
print(list1)
mapoflist = list(list1)
print(mapoflist)
print(type(v))
if mapoflist[0] + mapoflist[1] + mapoflist[2] == mapoflist[3] + mapoflist[4] + mapoflist[5]:
    print("You are lucky son of the bitch")
else:
    print("See you looser")

# stupid task 4
n2 = int(input("Enter first number:"))
m2 = int(input("Enter second number:"))
x = (n2 + m2)
if x % 2 == 0:
    print("Ok do it")
else:
    print("Hahaaa")
