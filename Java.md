### 1. 입출력

```java
// 입력
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 출력
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb = new StringBuilder(); // 문자열 누적용

// 한 줄 입력
String line = br.readLine().trim(); // trim(): 앞뒤 공백/개행 제거
int N = Integer.parseInt(line);

// 공백 단위 토큰 분리
StringTokenizer st = new StringTokenizer(br.readLine());
int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());

// 출력 모으기
sb.append(a + b).append('\n');
bw.write(sb.toString());
bw.flush();
```

| 자료구조                | 크기 구하는 방법      |
| ------------------- | -------------- |
| **배열 (Array)**      | `arr.length`   |
| **문자열 (String)**    | `str.length()` |
| **리스트 (List)**      | `list.size()`  |
| **Map (HashMap 등)** | `map.size()`   |

### 2. 배열 & 리스트

```java
// 배열 선언
int[] arr = new int[N];

// 리스트 (크기 가변)
List<Integer> list = new ArrayList<>();
list.add(10);
list.get(0);   // 10
list.size();   // 1
```


### 3. 문자열 다루기

```java
String s = "hello";

// 길이
s.length();    // 5

// 부분 문자열
s.substring(0, 3); // "hel"

// 문자 접근
s.charAt(1);   // 'e'

// 숫자 변환
int x = Integer.parseInt("123"); // 123
```

### 4. Map & Set

```java
// Map: Key → Value
Map<Integer, String> map = new HashMap<>();
map.put(1, "Alice");
map.put(2, "Bob");
map.get(1);    // "Alice"

// Set: 중복 없는 집합
Set<Integer> set = new HashSet<>();
set.add(10);
set.add(10);   // 무시됨
set.contains(10); // true
```



### 5. 정렬

```java
// 배열 정렬
int[] arr = {3, 1, 2};
Arrays.sort(arr); // [1, 2, 3]

// 리스트 정렬
List<Integer> list = Arrays.asList(3, 1, 2);
Collections.sort(list); // [1, 2, 3]

// 사용자 정의 정렬 (람다)
list.sort((x, y) -> y - x); // 내림차순

// Map.Entry 리스트 정렬
List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
entries.sort(Map.Entry.comparingByKey());   // key 기준
entries.sort(Map.Entry.comparingByValue()); // value 기준
```

### 6. 반복문

```java
// 기본 for
for (int i = 0; i < N; i++) { }

// 향상된 for (foreach)
for (int x : arr) { }
for (String name : list) { }
```

### 7. 자주 쓰는 클래스

```java
StringBuilder : 문자열 누적/출력용 (빠름)

StringTokenizer : 입력 문자열 공백/구분자 기준으로 빠르게 토큰 분리

Map.Entry : Map의 (key, value) 한 쌍 표현 (getKey(), getValue())

AbstractMap.SimpleEntry : (key, value) 쌍을 간단히 생성할 때
```
