n,k = map(int,input().split())
s = input()
k=k%len(s)
print(s[k:]+s[:k])
print(s[-k:]+s[:-k])