def is_valid(board, pos):
    r,c = pos
    if 0<=r<len(board) and 0<=c<len(board[0]):
        return True
    else:
        return False

def print_paths(board):
    paths = list()
    path = ''
    start = (0,0)
    end = (len(board)-1, len(board[0])-1)
    if is_valid(board, start):
        path_helper(board, start, end, path, paths)
    return paths


def path_helper(board, pos, end, path, paths):
    r,c = pos
    path += board[r][c]
    if pos == end:
        paths.append(path)
    else:
        down = (r+1,c)
        if is_valid(board, down):
            path_helper(board, down, end, path, paths)
        right = (r,c+1)
        if is_valid(board, right):
            path_helper(board, right, end, path, paths)


def main():
    pass

if __name__ == "__main__":
    main()

