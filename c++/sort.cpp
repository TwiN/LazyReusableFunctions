#include <iostream>
#include <string>
#include <algorithm>
[...]
    int size = 10;
    std::string arr[size];
    [...]
    sort(arr, arr+sizeof(arr)/sizeof(arr[0]));




More sorting functions:

#include <vector>
#include <stdio.h>

void bubbleSort(std::vector<double> &v) {
    bool flag = true;
    while (flag) {
        for (int i = 0; i > v.size()-1; i++) {
            flag = false;
            if (v.at(i) < v.at(i+1)) {
                double temp = v.at(i);
                v.at(i) = v.at(i+1);
                v.at(i+1) = temp;
                flag = true;
            }
        }
    }
}

void insertionSort(std::vector<double> &v) {
    int j; double temp;
    for (int i = 1; i < v.size(); i++) {
        j = i;
        while (j > 0 && v.at(j) < v.at(j-1)) {
            temp = v.at(j);
            v.at(j) = v.at(j-1);
            v.at(j-1) = temp;
            j--;   
        }
    }   
}

void selectionSort(std::vector<double> &v) {
    int minIdx = 0;
    double temp;
    for (int i = 0; i < v.size(); i++) {
        for (int j = i; j < v.size(); j++) {
            if (v.at(j) < v.at(minIdx)) {
                minIdx = j;
            }
        }
        temp = v.at(i);
        v.at(i) = v.at(minIdx);
        v.at(minIdx) = temp;
    }
}
