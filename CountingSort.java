public class CountingSort {
    public static void sort(int ar[]){
        int max = 0;
        for(int i = 0;i<ar.length;i++){
            max = Math.max(ar[i],max);
        }
        int freq[] = new int[max+1];
        for(int i  =0;i<ar.length;i++){
            freq[ar[i]]++;
        }
        int idx = 0;
        for(int i = 0;i<freq.length;i++){
            if(freq[i]!=0){
                int a = freq[i];
                while(a-->0){
                    ar[idx] = i;
                    idx++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int ar[] = {2,3,2,4,5,6,7,1,2,3,9};
        sort(ar);
        for(int i = 0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
