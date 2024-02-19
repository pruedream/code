package SortingAlgorithms;

/**
 * @author spike
 * @version 1.0.0
 */
public class 快速排序 {

    public static void main(String[] args) {
        int[] qw = {3,2,1,5,6,4};

         sort(qw,0,5);

         for (int i : qw){
             System.out.println(i);
         }

    }

    /**
     *
     * @param sd
     * @param left
     * @param right
     *
     * left 与 right就是边界
     */
    public static void sort(int sd[],int left,int right){
           if(left>=right){
             return;
           }
           //用两个指针一起从头开始， 寻找小于的值，然后两个指针交换
           int i=left,h=left;
           while (h!=right){
               if(sd[h]<=sd[right]){
                   int as=sd[i];
                   sd[i]=sd[h];
                   sd[h]=as;
                   i++;
               }
               h++;
           }
           int zx=sd[i];
           sd[i]=sd[right];
           sd[right] = zx;

           sort(sd,left,i-1 );
           sort(sd,i+1,right );
    }


}
