#include <stdio.h>
#include <stdlib.h>
#include <fstream>
#include <iostream>

using namespace std;

void printLast10Lines(const char* fileName) {
  const int k = 10;
  ifstream file(fileName);
  string L[k];
  int size = 0;
  
  while (file.peek() != EOF) {
    getline(file, L[size % k]);
    size++;
  }

  int start = size > k ? (size % k) : 0;
  int count = min(k, size);

  for (int i = 0; i < count; i++) {
    cout << L[(start + i) % k] << endl;
  }
}

int main() {
  const char* fileName = "file.txt";
  printLast10Lines(fileName);
  cout << endl;
  const char* fileName2 = "file2.txt";
  printLast10Lines(fileName2);
}
