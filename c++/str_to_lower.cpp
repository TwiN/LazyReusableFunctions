#include <string>

/* Change the case of all characters in a string to lowercase */
std::string str_to_lower(std::string s) {
    for (std::string::iterator it = s.begin(); it!= s.end(); ++it) {
        *it = tolower(*it);
    }
    return s;
}



// OTHER METHOD

#include <algorithm>
#include <string>

/* Change the case of all characters in a string to lowercase */
std::string str_to_lower(std::string s) {
    std::transform(s.begin(), s.end(), s.begin(), ::tolower);
    return s;
}

