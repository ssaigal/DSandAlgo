package BitManipulation;

public class ReverseBit {

    public static int reverseBits(int n){
        int rev =0;
        while(n >0){
            rev = rev << 1;
            System.out.println(Integer.toBinaryString(rev));
            if((int)(n&1) ==1)
                rev ^=1;

            n= n >>1;
            System.out.println("n-> "+Integer.toBinaryString(n));

        }

        return rev;
    }

    public static void main(String[] args)
    {
        int n = 11;
        System.out.println(reverseBits(n));
    }
}
