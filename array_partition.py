class Range():

    def __init__(self, start, end):
        self.start = start
        self.end = end

    def __str__(self):
        if self.start != self.end:
            return "{}-{}".format(self.start, self.end)
        else:
            return "{}".format(self.start)

def find_partitions(input_list):
    if len(input_list):
        out_ranges = list()
        temp = Range(input_list[0], input_list[0])
        for i in range(1, len(input_list)):
            if input_list[i] == temp.end + 1:
                temp.end = input_list[i]
            else:
                out_ranges.append(str(temp))
                temp = Range(input_list[i], input_list[i])
        out_ranges.append(str(temp))
        return out_ranges

def main():
    pass

if __name__ == "__main__":
    main()

