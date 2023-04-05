l=list(map(int,input().split()))
target = int(input())
start = 0
end = len(l) - 1
while start<= end:
    mid = (start + end) // 2
    if l[mid] == target:
        print(mid)
        break
    elif l[mid] < target:
        start = mid + 1
    else:
        end = mid - 1
if start > end:
    print("not found")