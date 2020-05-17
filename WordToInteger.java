package JavaPrograms;

class wordToNum {
    public static void main(String[] arguments) {
        for (int i=0; i < arguments.length; i++){
            long [] arr = conversion(arguments);
            System.out.println(arr[i]);
        }
        
    }
    static long [] conversion(String[] args) {
        long num;
        long [] nums = new long[args.length];
        for (int i=0; i < args.length; i++){
            switch (args[i]){
                case "one":
                   num = 1;
                   nums[i] = num;
                   break;
                case "two":
                   num = 2;
                   nums[i] = num;
                   break;
                case "three":
                    num = 3;
                    nums[i] = num;
                    break;
                case "four":
                    num = 4;
                    nums[i] = num;
                    break;
                case "five":
                    num = 5;
                    nums[i] = num;
                    break;
                case "six":
                    num = 6;
                    nums[i] = num;
                    break;
                case "seven":
                    num = 7;
                    nums[i] = num;
                    break;
                case "eight":
                    num = 8;
                    nums[i] = num;
                    break;
                case "nine":
                    num = 9;
                    nums[i] = num;
                    break;
                case "ten":
                    num = 10;
                    nums[i] = num;
                    break;
            }
        }
        return nums;
    }
}