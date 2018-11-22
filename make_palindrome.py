def make_palindrome(input):
    left = 0
    right = len(input) - 1
    is_pal = True
    stack = list()
    while left < len(input) - 1:
        if input[left] != input[right]:
            is_pal = False
        stack.append(input[left])
        left += 1
        right -= 1
    if is_pal:
        return input
    else:
        if input[left] == stack[-1]:
            stack.pop()
        while len(stack):
            input += stack.pop()
        return input

def make_palindrome2(input):
    r_input = ''.join(reversed(input))
    if input == r_input:
        return input
    overlap_delta = 0
    while input[overlap_delta:] != r_input[:-overlap_delta]:
        overlap_delta += 1
    return input + r_input[len(input)-overlap_delta:]

def main():
    arr = "racecar"
    forward1 = make_palindrome(arr)
    forward2 = make_palindrome2(arr)
    reverse = ''.join(reversed(forward2))
    print(forward1)
    print(forward2)
    print(reverse)
    assert forward2==reverse

if __name__ == "__main__":
    main()

