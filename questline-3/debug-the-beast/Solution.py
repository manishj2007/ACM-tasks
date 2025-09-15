def second_largest(arr):
    arr = list(set(arr))   # remove duplicates
    arr.sort()
    if len(arr) < 2:
        return None
    return arr[-2]

n = int(input("Enter number of elements: "))
arr = list(map(int, input("Enter numbers: ").split()))

ans = second_largest(arr)
if ans is None:
    print("Not enough numbers")
else:
    print("Second largest:", ans)
