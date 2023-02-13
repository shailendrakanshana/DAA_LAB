public class RadixSort {
    public static int getBit(int a,int b){
        int c = 0;
        int r  = a;
        while(r>0){
            c++;
            r = r/10;
        }
        int ans = 0;
        int n = c;
        while(c+b>n){
            c--;
            ans = a%10;
            a = a/10;
        }
        return ans;
    }
    public static void bubbleSort(int ar[],int b){
        for(int i = 0;i<ar.length;i++){
            for(int j = i+1;j<ar.length;j++){
                if(getBit(ar[i], b)>getBit(ar[j], b)){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
    public static void radixSort(int ar[]){
        int max = 0;
        for(int i = 0;i<ar.length;i++) max = Math.max(max,ar[i]);
        int c = 0;
        while(max>0){
            c++;
            max = max/10;
        }
        for(int i = 1;i<=c;i++){
            bubbleSort(ar, i);
        }
    }
    public static void main(String[] args) {
        int ar[] = {2,3,2,4,5,6,7,1,2,3,9};
        radixSort(ar);
        for(int i = 0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
