'''
Function that reads a local file
@param fname    path and filename
'''
def readLocalFile(fname):
    content=''
    with open(fname, 'r') as f:
        content += f.read()
    return content.rstrip("\n") #removes last newline
