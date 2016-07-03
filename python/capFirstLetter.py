'''
Function that capitalizes the first letter of a string
@param s    string
'''
def capFirstLetter(s):
    if len(s)>1:
        return s[0].upper() + s[1:]
    return s
