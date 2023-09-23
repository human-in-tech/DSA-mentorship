// You've to display the digits of a number in reverse.
#include<iostream>
using namespace std;
int main(){
    int n,d;
    int sum=0;
    cout<<"enter the number:";
    cin>>n;
    while(n>0){
        d=n%10;
        sum=sum*10+d;
        n/=10;
    }
    cout<<"The number in reversed order is "<<sum;
}