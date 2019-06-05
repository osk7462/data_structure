#include<iostream>

using namespace std;

int main() {
	string expression = "123*+5-";
	cout<<"expression:\t"<<expression<<endl<<endl;
	int i = -1;
	int size = -1;
	while(expression[++size] != '\0');
	int stack[size];
	int j = -1;
	while(expression[++i] != '\0') {
		if (expression[i] == '+' || expression[i] == '-' || expression[i] == '*' || expression[i] == '/') {
			int operand2 = stack[j];
			int operand1 = stack[--j];
			cout<<"pop:"<<endl;
			cout<<"\toperand1: "<<operand1<<"\toperand2: "<<operand2<<endl;
			if (expression[i] == '+') {
				stack[j] = operand1 + operand2;
			} else if (expression[i] == '-') {
				stack[j] = operand1 - operand2;
			} else if (expression[i] == '*') {
				stack[j] = operand1 * operand2;
			} else if (expression[i] == '/') {
				stack[j] = operand1 / operand2;
			}
			cout<<"\t\t"<<operand1 <<" "<<expression[i] << " "<<operand2 << " = "<<stack[j]<<endl;
		} else {
			stack[++j] = (int)expression[i] - 48;
			cout<<"inserting in the stack "<<stack[j]<<endl;
		}
	}
	cout<<"result:\t"<<stack[j]<<endl;;
	return 0;
}