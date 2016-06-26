def getBetween(s, first, last):
    try:
        start = s.index(first ) + len(first)
        end = s.index(last, start)
        return s[start:end]
    except ValueError:
        return ""
