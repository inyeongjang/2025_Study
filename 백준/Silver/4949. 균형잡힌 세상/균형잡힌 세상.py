import sys
input = sys.stdin.readline

while True: 
    sentence = input().rstrip()
    if sentence == '.':
        break 
        
    stack = []
    balanced = True 
    
    for s in sentence:
        if s == '(' or s == '[':
            stack.append(s)
        elif s == ')':
            if not stack or stack[-1] != '(':
                balanced = False 
                break 
            stack.pop()
        elif s == ']':
            if not stack or stack[-1] != '[':
                balanced = False 
                break 
            stack.pop()

    if balanced and not stack:
        print("yes")
    else:
        print("no")
        