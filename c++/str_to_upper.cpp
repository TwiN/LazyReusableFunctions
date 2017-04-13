#include <string>

/* Change the case of all characters in a string to uppercase */
std::string str_to_upper(std::string s) {
    for (std::string::iterator it = s.begin(); it!= s.end(); ++it) {
        *it = toupper(*it);
    }
    return s;
}




// OTHER METHOD

#include <algorithm>
#include <string>

/* Change the case of all characters in a string to uppercase */
std::string str_to_upper(std::string s) {
    std::transform(s.begin(), s.end(), s.begin(), ::toupper);
    return s;
}






