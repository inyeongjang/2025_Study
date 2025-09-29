import sys
input = sys.stdin.readline
write = sys.stdout.write

M = int(input())
bits = 0
ALL = (1 << 20) - 1   # 1~20 모두 켜진 상태

for _ in range(M):
    parts = input().split()
    cmd = parts[0]

    if cmd == "add":
        x = int(parts[1])
        bits |= (1 << (x - 1))

    elif cmd == "remove":
        x = int(parts[1])
        bits &= ~(1 << (x - 1))

    elif cmd == "check":
        x = int(parts[1])
        write("1\n" if bits & (1 << (x - 1)) else "0\n")

    elif cmd == "toggle":
        x = int(parts[1])
        bits ^= (1 << (x - 1))

    elif cmd == "all":
        bits = ALL

    else:  # "empty"
        bits = 0
