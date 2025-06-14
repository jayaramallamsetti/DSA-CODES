// Brute force code:

int n = arr.length;
int cnt = 0;
for(int i=0; i<n; i++){
  int sum = 0;
  for(int j=i; j<n; j++){
    sum += arr[j];
    if(sum % k == (j-i+1) )
      cnt++;
  }

} 

return cnt;
