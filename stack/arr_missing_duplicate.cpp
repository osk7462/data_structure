// a cpp program to find the missing and the duplicate elements in the array;

#include<iostream>

using namespace std;

int main() {
	int ar[] = {1,1,2,3,4,5};
	int size = sizeof(ar)/sizeof(int), missing, duplicate;
	int sum = (size*(size+1))/2;
	// +x-y;
	int acproduct = 1;
	int acsum = 0;
	int arsum=0;
	int arproduct = 1;
	for(int i=1;i<=size;i++) {
		acproduct*=i;
		acsum+=i;
		arsum += ar[i-1];
		arproduct *= ar[i-1];
	}

	// actual sum of 1-n = sum of elements in the array + missng - duplicate;
	// actual product of 1-n = product * missing / duplicate;
	// using above two equation we can find the missing and duplicate values;
	missing = ((acproduct*acsum)-(acproduct*arsum)) / (acproduct- arproduct);
	cout<<"the missing number in the given array is:\t"<<missing<<endl;
	duplicate = arsum+missing-acsum;
	cout<<"the duplicate number in the array is:\t"<<duplicate;
}