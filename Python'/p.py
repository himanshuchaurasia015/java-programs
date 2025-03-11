n=int(input())
for i in range(n):
    for j in range(i):
        print(" ",end=" ")
    for k in range(1,2*n-2*i):
        print(k,end=" ")
    print()