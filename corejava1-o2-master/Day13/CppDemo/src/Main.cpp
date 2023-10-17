#include<iostream>
using namespace std;
template<class T>	//T <= Type parameter
void swap_object( T &a1, T &a2 )
{
	T temp = a1;
	a1 = a2;
	a2 = temp;
}
int main( void )
{
	int num1 = 10;
	int num2 = 20;

	//swap_object<int>(num1, num2);	//int <= Type argument
	swap_object(num1, num2);	//Type Inference
	cout<<"Num1	:	"<<num1<<endl;
	cout<<"Num2	:	"<<num2<<endl;
	return 0;
}
