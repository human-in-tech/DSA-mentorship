// find the gcd and lcm of numbers
#include<iostream>
using namespace std;
int main(){
    int num1,num2;
    cout<<"enter number 1:";
    cin>>num1;
    cout<<"enter number 2:";
    cin>>num2;

    // storing values of numbers
    int original_num1=num1;
    int original_num2=num2;
    
    // GCD
    int gcd=1;
    for(int i=2;i<=num1;i++){
        while(num1%i==0 && num2%i==0){
            gcd*=i;
            num1/=i;
            num2/=i;
        }
    }

    cout<<"GCD:"<<gcd<<endl;

    // LCM
    cout<<"LCM:"<<(original_num1*original_num2)/gcd;
    
}