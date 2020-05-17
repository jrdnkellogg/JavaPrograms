package JavaPrograms;

class DayCounter {
   public static void main(String[] arguments) {
       int year = Integer.parseInt(arguments[0]);
       int[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
       for (int i=0; i < months.length; i++){
           int n = 1;
           while(n <= countDays(months[i], year)) {
               System.out.println(months[i] + "/" + n + "/" + year);
               n++;
           }
       }
   }

   static int countDays(int month, int year) {
       int count = -1;
       switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    count = 29;
                } else {
                    count = 28;
                }
                if ((year % 100 == 0) & (year % 400 != 0)) {
                    count = 28;
                }
       }
       return count;
   }
}