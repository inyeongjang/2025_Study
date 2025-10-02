import sys 

T = int(sys.stdin.readline());

for i in range(T):
	levels, rooms, guest = map(int, sys.stdin.readline().split()) 
	room_num = 100 * ((guest - 1)  % levels + 1) + ((guest - 1) // levels + 1) 
	print(room_num) 	 