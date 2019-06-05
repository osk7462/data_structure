#include<iostream>
// #include<cstring>

using namespace std;

int getlen(string example) {
	int i=-1;
	while(example[++i] != '\0');
	return i;
}


int main(){
	string example = "<html><p> this is < >me osama hi there! </p> </html>";
	char stack[getlen(example)];
	int i = -1,j = -1;
	while(example[++i] != '\0'){
		if (example[i] == '{' || example[i] == '<' || example[i] == '(' || example[i] == '[') {
			// insert the element in the stack;
			stack[++j] = example[i];
			cout<<"inserting in stack"<<stack[j]<<"\n";
		
		}
		// check the last element in  the stack with current one 
		// if they are pair then pop from stack else report error
		else if((example[i] == '}' && stack[j] == '{') || (example[i] == '>' && stack[j] == '<') || 
				(example[i] == ']' && stack[j] == '[' ) || (example[i] == ')' && stack[j] == '(')) {
				cout<<"removing from stack"<<stack[j--]<<"\n";

		}
	}
	if(j == -1) {
		cout<<"the paranthesis are balanced."<<endl;
	} else {
		cout<<"the paranthesis are not balanced."<<endl;
	}

	return 0;
}