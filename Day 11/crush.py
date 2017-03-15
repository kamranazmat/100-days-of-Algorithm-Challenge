# Enter your code here. Read input from STDIN. Print output to STDOUT
n, m = map(int, raw_input().strip().split(" "))
arr = [0] * (n+1)

while m > 0:
    a, b, k = map(int, raw_input().strip().split(" "))
    arr[a-1] += k
    arr[b] -= k    
    m -= 1
    
Max = j = 0
for i in arr:
    j += i
    if j >= Max:
        Max = j
        
print Max