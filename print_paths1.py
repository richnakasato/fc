def print_paths(board):
    paths = list()
    curr_path = ""
    start = (0,0)
    end = (len(board)-1,len(board[0])-1)
    print_paths_helper(board, start, end, curr_path, paths)
    return paths

def can_move(board, pos):
    r, c = pos
    if 0 <= r < len(board) and 0 <= c < len(board[0]):
        return True
    else:
        return False

def print_paths_helper(board, curr, end, curr_path, paths):
    r, c = curr
    new_path = curr_path + board[r][c]
    if curr == end:
        paths.append(new_path)
        return None
    else:
        right = (r,c+1)
        if can_move(board, right):
            print_paths_helper(board, right, end, new_path, paths)
        down = (r+1,c)
        if can_move(board, down):
            print_paths_helper(board, down, end, new_path, paths)
        return None


def main():
    board = [['A', 'B'],
             ['C', 'D']]
    print(print_paths(board))

if __name__ == "__main__":
    main()

