import sys
input = sys.stdin.readline  # 빠른 입력 (input() 대신 사용)
write = sys.stdout.write    # 빠른 출력 (print() 대신 사용)

M = int(input())
bits = 0                     # 현재 집합을 비트마스크로 표현
ALL = (1 << 20) - 1          # 20 비트를 전부 1로 설정

for _ in range(M):
    parts = input().split()
    cmd = parts[0]
    
    # (1 << (x-1)) : x번째 비트를 1로 만들기
    #  ~(1 << (x-1)) : x번째 비트만 0, 나머지는 1 
    
    if cmd == "add":
        x = int(parts[1])
        bits |= (1 << (x - 1))   # |= : OR 연산 → 기존 비트는 유지, 해당 비트는 무조건 1

    elif cmd == "remove":
        x = int(parts[1])
        bits &= ~(1 << (x - 1))  # &= : AND 연산 → 해당 비트만 0으로 꺼짐

    elif cmd == "check":
        x = int(parts[1])
        # (bits & (1 << (x-1))) : x번째 비트가 켜져 있으면 0이 아님 => 있으면 1, 없으면 0 출력
        write("1\n" if bits & (1 << (x - 1)) else "0\n") 
        
    elif cmd == "toggle":
        x = int(parts[1])
        bits ^= (1 << (x - 1))    # ^= : XOR 연산 → 1이면 0으로, 0이면 1로 반전

    elif cmd == "all":
        bits = ALL                # 20 비트를 전부 1로 설정

    else:  # "empty"
        bits = 0                  # 비트를 전부 0으로 설정 → 공집합
