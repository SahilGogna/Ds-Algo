def getSS(s):
    return helper(s, '', 0)


def helper(ip, ssf, ptr):
    if ptr == len(ip):
        return [ssf]
    l1 = helper(ip, ssf, ptr + 1)
    l2 = helper(ip, ssf + ip[ptr:ptr + 1], ptr + 1)
    return l1 + l2


ans = getSS('abc')

print("[" + ', '.join(ans) + "]")