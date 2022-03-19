def getKPC(s):
    keymap = {'0': '.;',
              '1': 'abc',
              '2': 'def',
              '3': 'ghi',
              '4': 'jkl',
              '5': 'mno',
              '6': 'pqrs',
              '7': 'tu',
              '8': 'vwx',
              '9': 'yz'}
    return helper(s, keymap, 0, '')


def helper(ip, keymap, ptr, asf):
    if ptr == len(ip):
        return [asf]
    possibleNumbers = keymap[ip[ptr]]
    ml = []
    for n in possibleNumbers:
        listRet = helper(ip, keymap, ptr + 1, asf + n)
        ml += listRet
    return ml


ans = getKPC('78')

print("[" + ', '.join(ans) + "]")