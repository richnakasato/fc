# Collections module has already been imported.
def helper(address, curr_octets, valid_addresses):
    if len(curr_octets) == 4:
        if not len(address):
            valid_addresses.append(curr_octets)
    else:
        for i in range(1,len(address) + 1):
            curr_octet = address[:i]
            # len check for 3 here is hacky, figure out a better way
            # to resolve leading zero
            if 0 <= int(curr_octet) < 256 and len(curr_octet) <= 3:
                new_octets = curr_octets[:] + [curr_octet]
                helper(address[i:], new_octets, valid_addresses)

def generate_ip_address(input):
    # Return type should be a List.
    address = input
    curr_octets = list()
    valid_addresses = list()
    helper(address, curr_octets, valid_addresses)
    results = list()
    for address in valid_addresses:
        results.append('.'.join(address))
    return results
