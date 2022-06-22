public class MergeSortingArray {
    void mergeSort(int r[],int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(r, start, end);
            mergeSort(r, mid+1, end);
            merge(r,start,mid,end);
        }
       
    }

    void merge(int r[],int start, int mid, int end) {
        int a[]=new int[mid-start+1];
        int b[]=new int[mid+1];
        for(int index=0;index<a.length;index++){
            a[index]=r[index];
        }
        for(int index=0;index<b.length;index++){
            b[index]=r[mid+1+index];
        }
        int i=0;int j=0;int k=0;
        while (i<a.length & j<b.length){
            if(a[i]<=b[j]){
                r[k]=a[i];
                i++;
                k++;
            }
            else{
                r[k]=b[j];
                j++;
                k++;

            }
        }
        //recurrive last excute stack ma huncha tei vayrw
        while (i<a.length){
            r[k]=a[i];
            i++;
            k++;
        }
        while (i<b.length){
            r[k]=b[j];
            j++;
            k++;
        }

    }
    
}
