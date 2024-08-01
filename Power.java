class Power {
    public double myPow(double x, int n) {
        long num = Math.abs((long) n);
        double result = 1.0;
        while(num > 0){
            if(num % 2 == 0){
                x = x * x;
                num = num / 2;
            }else{
                result = result * x;
                num = num - 1;
            }
        }
        return  num < 0 ? 1.0 / result :  result;
    }
    public static void main(String[] args) {
        Power p = new Power();
        double num = p.myPow(2, 20);
        System.out.println(num);
    }
}