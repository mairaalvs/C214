from math import sqrt

num = int(input("Tabuada do numero: "))

for count in range(10):
    print("%d x %d = %d" % (num, count+1, num*(count+1)))
    print("Raiz do numero: %d eh %f" % (num*(count+1), sqrt(num*(count+1))))
