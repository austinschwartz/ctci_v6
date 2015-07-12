#include <stdio.h>

void swap(char* p1, char* p2) {
  char temp = *p1;
  *p1 = *p2;
  *p2 = temp;
}

void reverse(char* str) {
  char* end = str;
  if (str) {
    while (*end)
      end++;
    end--;

    while (str < end) {
      swap(str, end);
      str++;
      end--;
    }
  }
}

int main() {
  char str[] = "hello";
  printf("%s\n", str);
  reverse(str);
  printf("%s\n", str);
  return 0;
}
