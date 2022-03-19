# Print All Palindromic Substrings

def printallpalindrome(st):
    for i in range(0, len(st)):
        for j in range(i+1, len(st)+1):
            sub = st[i:j]
            if isPalindrome(sub):
                print(sub)


def isPalindrome(str):
    left = 0
    right = len(str) - 1
    while left < right:
        lc = str[left:left + 1]
        rc = str[right:right + 1]
        if lc != rc:
            return False
        left += 1
        right -= 1
    return True


print(printallpalindrome('abcc'))
