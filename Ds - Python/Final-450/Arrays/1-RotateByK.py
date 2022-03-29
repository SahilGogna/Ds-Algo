def swap(arr: list, i: int, j: int):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp


def rotate(arr: list, start: int, end: int):
    while start < end:
        swap(arr, start, end)
        start += 1
        end -= 1


input_int_array = [int(x) for x in input().split()]
input_int_array2 = input_int_array[:]
k = int(input())
print("Orignal List:", input_int_array)
rotate(input_int_array, 0, len(input_int_array) - 1)
rotate(input_int_array, 0, k - 1)
rotate(input_int_array, k, len(input_int_array) - 1)
print("Rotated List:", input_int_array)

print("Orignal List:", input_int_array2)
rotate(input_int_array2, 0, len(input_int_array) - 1)
rotate(input_int_array2, 0, len(input_int_array) - k -1)
rotate(input_int_array2, len(input_int_array2) - k, len(input_int_array2) - 1)
print("Right Rotated List:", input_int_array2)