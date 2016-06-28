# overwrite fname
def writeInFile(fname, data):
    fhandler = open(fname, "w")
    fhandler.write(data)
    fhandler.close()


# append to new line in fname
def writeInFile(fname, data):
    fhandler = open(fname, "a") 
    fhandler.write(data.replace('\n', '')+'\n') # make sure newline, but not 2
    fhandler.close()
