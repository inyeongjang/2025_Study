N = input()
num_list = []
cnt1 = 0 
cnt2 = 0
for s in N:
    if cnt1 == 0:
        cnt1 = 1
        if s == '*': 
            cnt2 = 0
        else:
            num_list.append(int(s))
    elif cnt1 == 1:
        cnt1 = 0 
        if s == '*': 
            cnt2 = 1
        else:
            num_list.append(3 * int(s))

total = sum(num_list)
for x in range(10):
    if cnt2 == 1:
        if ((total + 3 * x) % 10 == 0):
            break  
    else:
        if ((total + x) % 10 == 0):
            break  
print(x)