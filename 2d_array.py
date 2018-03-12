#!/bin/python3

import sys


arr = []
for arr_i in range(6):
   arr_t = [int(arr_temp) for arr_temp in input().strip().split(' ')]
   arr.append(arr_t)
sum = -10000
for arr_i in range(1,5):
    for arr_j in range(1,5):
        temp = arr[arr_i][arr_j]+arr[arr_i-1][arr_j-1]+arr[arr_i-1][arr_j]+arr[arr_i-1][arr_j+1]+arr[arr_i+1][arr_j-1]+arr[arr_i+1][arr_j+1]+arr[arr_i+1][arr_j]
        if temp > sum:
            sum=temp
print(sum)            
        