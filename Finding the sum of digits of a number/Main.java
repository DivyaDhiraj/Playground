#include <stdio.h>
int main() {
  int n,i,j,k,l,m;
  scanf("%d",&n);
  i=n/10000;
  j=n%10;
  k=(n%100)/10;
  l=(n%1000)/100;
  m=(n%10000)/1000;
  printf("%d",i+j+k+l+m);
	//Type your code
	return 0;
}