public class BinaryGap {

    public int solution(int N) {
        String bString = Integer.toString(N, 2);

        boolean started = false;
        int counter = 0;
        int maxCount = 0;

        for (int i=0; i < bString.length(); i++) {
            String bit = bString.substring(i, i + 1);
            if (bit.equals("1")) {
                if (started) {
                    if (counter > maxCount) {
                        maxCount = counter;
                    }
                }
                counter = 0;
                started = true;
            }
            if (bit.equals("0")) {
                counter = counter + 1;
            }
        }      
        return maxCount;
    }

    public static void main(String[] args) {
        BinaryGap gap = new BinaryGap();
        System.out.println(gap.solution(9));
    }
}