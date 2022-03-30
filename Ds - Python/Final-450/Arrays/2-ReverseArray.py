def revArray(arr: list, start: int, end: int):
    if start > end:
        return
    temp = arr[start]
    arr[start] = arr[end]
    arr[end] = temp
    revArray(arr, start + 1, end - 1)


arr = [int(x) for x in input().split()]
print(arr)
revArray(arr,0,len(arr)-1)
print(arr)
