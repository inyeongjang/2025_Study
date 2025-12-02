"""
==========================
    HEAP 자료구조 정리
==========================

1. 힙(Heap)이란?
   - 완전 이진 트리(Complete Binary Tree)를 기반으로 한 우선순위 큐 자료구조.
   - 부모-자식 간의 우선순위 관계만 유지되면 되기 때문에, 정렬된 구조는 아님.

2. 힙의 종류
   - 최소 힙(Min Heap): 부모 노드 ≤ 자식 노드. 루트(root)가 항상 최소값.
   - 최대 힙(Max Heap): 부모 노드 ≥ 자식 노드. 루트가 항상 최대값.

3. 시간 복잡도
   - 삽입(push)    : O(log N)
   - 삭제(pop)     : O(log N)
   - 루트 조회(peek): O(1)

4. Python의 heapq 모듈 (기본 = 최소 힙)
   - heapq.heappush(heap, item)  : 최소 힙에 요소 삽입
   - heapq.heappop(heap)         : 최소값(루트) 제거 및 반환
   - heapq.heapify(lst)          : 일반 리스트를 힙 구조로 변환
"""

import sys
import heapq 

input = sys.stdin.readline
N = int(input())

heap = []

for _ in range(N):
    x = int(input())
    if x == 0:
        if heap:
            print(heapq.heappop(heap))
        else:
            print(0)
    else:
        heapq.heappush(heap, x)
        