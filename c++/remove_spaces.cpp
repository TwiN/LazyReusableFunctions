#include <algorithm>
#include <string>

std::string remove_spaces(std::string &s) {
    s.erase(std::remove(s.begin(), s.end(), ' '), s.end());
    return s;
}


