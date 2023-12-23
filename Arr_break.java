public class Arr_break {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10};
        
        for(int i=0;i<=num.length;i++){
            if(i==5){break;}
            System.out.print(num[i]+" ");
        }
    }
}
