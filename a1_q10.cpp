#include<iostream>
using namespace std;
int main(){
    //declaring variables and taking in inputs
    int n;
    cout<<"n:";
    cin>>n;

    while(n>1){
        for(int i=2;i<=n;i++){
            while(n%i==0){
                cout<<i<<"x";
                n/=i;
            }
        }
    }
    return 0;
}