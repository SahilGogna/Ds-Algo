def get_stair_paths(n):
    return helper(n, '')


def helper(n, asf):
    if n == 0:
        return [asf]
    if n < 0:
        return []

    l1 = helper(n - 1, asf + '1')
    l2 = helper(n - 2, asf + '2')
    l3 = helper(n - 3, asf + '3')
    return l1 + l2 + l3


ans = get_stair_paths(3)

print("[" + ', '.join(ans) + "]")