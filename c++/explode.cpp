#include <sstream>
#include <vector>

std::vector<std::string> explode(std::string const &str, char delim) {
    std::vector<std::string> r;
    std::istringstream iss(str);
    for (std::string out; std::getline(iss, out, delim);) {
        r.push_back(out);
    }
    return r;
}



// USAGE: ex: will split variable "grille" by newlines
std::vector<std::string> lines = explode(grille, '\n');

