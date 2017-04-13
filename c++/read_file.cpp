#include <iostream>
#include <fstream>
#include <string>

std::string read_file(const char* file_name) {
    std::string line, content;
    std::ifstream ifs;
    ifs.open(file_name);
    while (std::getline(ifs, line)) {
        content += line + "\n";
    }
    ifs.close();
    return content;
}


std::string read_file(std::string file_name) {
    std::string line, content;
    std::ifstream ifs;
    ifs.open(file_name.c_str());
    while (std::getline(ifs, line)) {
        content += line + "\n";
    }
    ifs.close();
    return content;
}


