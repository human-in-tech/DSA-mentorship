// print the inverse of a number
#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int n,b;
    int i,sum=0;
    cout<<"enter number:";
    cin>>n;
    // first we find the number of digs of n 
    while(n>0){
        n/=10;
        i++;
    }
    for(int a=1;a<=i;a++){
        b=n/10;
        double row;
        row=pow(10,(b-1));
        sum+=a*row;
        n/=n;
    }
    cout<<"The inverse of the number is"<<sum;
}