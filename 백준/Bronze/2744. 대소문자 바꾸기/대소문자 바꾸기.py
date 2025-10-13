word = input() 
result = ""
for s in word:
    if s.isupper():
        result += s.lower()
    else:
        result +=s.upper();
print(result)