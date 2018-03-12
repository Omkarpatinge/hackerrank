import sys

if __name__ == "__main__":
    n = int(input())
    a=[]
    for i in range(0, n):
       a.append(input()) 
    q=int(input())
    
    for i in range(0, q):
        b=input()
        count=0
        for j in range(0,n):
            if(a[j]==b):
                count+=1
        print(count)    