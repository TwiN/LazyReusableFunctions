def txtFileToArray(fname):
    myArr = []
    with open(fname) as f:
        for line in f:
            myArr.append(line.replace("\n", ""))
    return myArr

# example:
proxies = txtFileToArray('ips.txt')
