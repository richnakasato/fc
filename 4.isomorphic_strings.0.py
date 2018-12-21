def is_isomorphic(a, b):
    a_seen = dict()
    a_iso = list()
    char_count = 0
    for char in a:
        if char not in a_seen:
            a_seen[char] = char_count
            char_count += 1
        a_iso.append(a_seen[char])
    b_seen = dict()
    b_iso = list()
    char_count = 0
    for char in b:
        if char not in b_seen:
            b_seen[char] = char_count
            char_count += 1
        b_iso.append(b_seen[char])
    return a_iso == b_iso


def main():
    a = 'cpp'
    b = 'gll'
    assert is_isomorphic(a, b)
    a = 'ccacp'
    b = 'ddbtq'
    assert not is_isomorphic(a, b)


if __name__ == "__main__":
    main()

