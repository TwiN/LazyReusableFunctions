#PYTHON 2.7.10
import urllib2,cookielib

'''
Function that returns the source from the target url
@param url  
'''
def file_get_contents(url):
    url = str(url).replace(" ", "+") # just in case, no space in url
    hdr = {'User-Agent': 'Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.64 Safari/537.11',
           'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
           'Accept-Charset': 'ISO-8859-1,utf-8;q=0.7,*;q=0.3',
           'Accept-Encoding': 'none',
           'Accept-Language': 'en-US,en;q=0.8',
           'Connection': 'keep-alive'}
    req = urllib2.Request(url, headers=hdr)
    try:
        page = urllib2.urlopen(req, timeout=10)
        return page.read()
    except urllib2.HTTPError, e:
        print e.fp.read()
    except urllib2.URLError, e:
        print e.fp.read()
    return ''

#example
print file_get_contents("https://twinnation.org/API/ip.php")

