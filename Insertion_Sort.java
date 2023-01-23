public class Insertion_Sort{
    public static void sort_in(int ar[]){
        for(int i  =1;i<ar.length;i++){
            int a = ar[i];
            int p = i;
            int t = i-1;
            while(t>=0){
                if(a>ar[t]) break;
                ar[p] = ar[t];
                ar[t] = a; 
                p--;
                t--;
            }
            //Swaping
        }
    }
    public static void main(String[] args) {
        int ar[] = {12,11,13,5,6};
        sort_in(ar);
        for(int i = 0;i<ar.length;i++) System.out.print(ar[i]+" ");
    }
}