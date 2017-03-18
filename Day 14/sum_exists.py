# find if atleast a pair exsit which adds upto a sum
# two sorted list

a = [1, 2, 3, 4, 5]
b = [1, 3, 6, 8, 9, 12, 13]

Sum = 25

point_1 = 0
point_2 = len(b)-1

ans = "No"

if Sum > b[-1] + b[-2]:
    print ans
    
else:
    while point_1 != point_2:
        if b[point_1] + b[point_2] > Sum:
            point_2 -= 1
        elif b[point_1] + b[point_2] < Sum:
            point_1 += 1
        else:
            ans = "Yes"
            break
    print ans