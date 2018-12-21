def say_seq(say_str):
    if say_str == '0':
        return None
    else:
        result = ''
        curr = None
        count = 0
        for char in say_str:
            if not curr:
                curr = char
                count = 1
            else:
                if char == curr:
                    count += 1
                else:
                    result += str(count) + str(curr)
                    curr = char
                    count = 1
        result += str(count) + str(curr)
        return result


def look_and_say(sequence_number):
    if not sequence_number:
        return None
    else:
        sequence_number -= 1
        say_str = '1'
        for _ in range(sequence_number):
            say_str = say_seq(say_str)
        return say_str


def main():
    pass


if __name__ == "__main__":
    main()
