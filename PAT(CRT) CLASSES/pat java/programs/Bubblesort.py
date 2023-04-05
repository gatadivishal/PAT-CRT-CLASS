'''l=list(map(int,input().split()))
for i in range(len(l)):
    for j in range((len(l)-i)-1):
        if l[j]>l[j+1]:
            l[j],l[j+1]=l[j+1],l[j]
print(l)'''
def bubble_sort(arr):
    for i in range(len(arr)):
        for j in range(len(arr) - 1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr
arr = [5, 2, 7, 1, 3]
sorted_arr = bubble_sort(arr)
print(sorted_arr)