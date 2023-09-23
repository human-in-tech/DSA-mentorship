// for marks above 90, print excellent.
//   	  2.2 for marks above 80 and less than equal to 90, print good.
//   	  2.3 for marks above 70 and less than equal to 80, print fair.
//   	  2.4 for marks above 60 and less than equal to 70, print meets expectations.
//   	  2.5 for marks less than equal to 60, print below par.
#include<iostream>
using namespace std;
int main(){
    int marks;
    cout<<"Enter marks:";
    cin>>marks;
    if(marks>90){
        cout<<"Excellent";
    }
    else if(marks<=90 && marks>80){
        cout<<"good";
    }
    else if(marks<=80 && marks>70){
        cout<<"fair";
    }
    else if(marks<=70 && marks>60){
        cout<<"meets expectations";
    }
    else if(marks<=60){
        cout<<"below par";
    }
}