// Question: 8
// Given an array of characters formed with a’s and b’s. The string is marked with
// special character X which represents the middle of the list (for example: ababa...
// ababXbabab baaa). Check whether the string is palindrome
#include<iostream>

using namespace std;

int main() {
	string str = "oosoo";
	int i=-1;
	bool palindrome = true;
	int size=-1;
	while(str[++size] != '\0');
	while(++i <= --size) {
		if(str[i] != str[size]) {
			palindrome = false;
			break;
		}
	}
	if(palindrome) {
		cout<<"the Given striing is a palindrome."<<endl;
	} else {
		cout<<"the given string is not a palindrome."<<endl;
	}

	return 0;
}
