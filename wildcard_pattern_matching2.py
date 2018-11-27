# 61 minutes

def match(first, second):
    fi = si = 0
    wild = False
    while fi < len(first) and si < len(second):
        if first[fi] == second[si] or first[fi] == '?':
            fi+=1
            si+=1
            if wild:
                wild = False
        else:
            if wild:
                si+=1
            elif first[fi] == '*':
                wild = True
                fi+=1
                si+=1
            else:
                return False
    if si < len(second):
        if wild:
            return True
        else:
            return False
    return True


def main():
    pass

if __name__ == "__main__":
    main()

