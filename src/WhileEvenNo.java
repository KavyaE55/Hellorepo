public class WhileEvenNo {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber=20;
        int evenCount=0;
        int oddCount = 0;

        while (number<=finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                oddCount++;
                continue;


            }
            System.out.println("Even Number " + number);
            evenCount++;
            if (evenCount>=5) {
                break;
            }

        }
        System.out.println("Total Odd numbers found = " + oddCount);
        System.out.println("Total Even numbers found = " + evenCount);

    }
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;

        } else {
            return false;
        }
    }




}
