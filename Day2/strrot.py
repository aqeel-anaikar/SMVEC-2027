s=input()
n=int(input())
d=input()
if d=='L':
    if n>len(s):
        n=n-len(s)
        s=s[n:]+s[:n]
        print(s)
    else:
        s=s[n:]+s[:n]
        print(s)
elif d=='R':
    if n>len(s):
        n=n-len(s)
        s=s[:n]+s[n:]
        print(s)
    else:
        s=s[:n]+s[n:]
        print(s)

