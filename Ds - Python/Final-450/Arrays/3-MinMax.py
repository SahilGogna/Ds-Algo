class Pair:
    # constructor method
    def __init__(self):
        # object attributes
        self.min = min
        self.max = max


def MinMax(arr: list, start: int, end: int):
    if start == end:
        pair = Pair()
        pair.min = arr[start]
        pair.max = arr[start]
        return pair

    elif start == end - 1:
        pair = Pair()
        if arr[start] > arr[end]:
            pair.max = arr[start]
            pair.min = arr[end]
        else:
            pair.min = arr[start]
            pair.max = arr[end]
        return pair

    else:
        mid = int(start + ((end - start) / 2))
        p1 = MinMax(arr, start, mid - 1)
        p2 = MinMax(arr, mid, end)
        pair = Pair()
        if p1.min < p2.min:
            pair.min = p1.min
        else:
            pair.min = p2.min

        if p1.max > p2.max:
            pair.max = p1.max
        else:
            pair.max = p2.max
        return pair


arr = [int(x) for x in input().split()]

p = MinMax(arr, 0, len(arr) - 1)

print("Min = {}, Max = {}".format(p.min, p.max))
print("Min =", p.min, "Max =", p.max)
