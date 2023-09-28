// rotate a number
#include<iostream>
#include<math.h>
using namespace std;
int main(){
    // declaring variables and taking in inputs
    int k,n;
    cout<<"number:";
    cin>>n;
    cout<<"no. of rotations to the right:";
    cin>>k;

    
    // finding the number of digits
    int digs=log10(n)+1;

    // rotating a number to the right
    if(k>0){
        for(int i=1;i<=k;i++){
            int lastdig=n%10;
            n/=10;
            n+=pow(10,digs-1)*lastdig;
            
            
        }
    }

    cout<<"the rotated number is:"<<n;

    return 0;
}