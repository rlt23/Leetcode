//50. Pow(x, n)
//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

class Solution {
    public double myPow(double x, int n) {
        if(n == 0)return 1;
        
        double temp = myPow(x,n/2);
        if(n%2 == 0){
            return temp*temp;
        }else{
            if(n<0){
                return temp*temp*1/x;
            }else{
                return temp*temp*x;
            }
        }
    }
}