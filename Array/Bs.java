package Array;

public class Bs {
    public static int Binary(int num[], int key){
int start=0;
int end= num.length-1;
while(start<=end){
    int mid=start+(end-start)/2;
    if(num[mid]>key){
       end=mid-1;
    }
    else if(num[mid]<key){
        start=mid+1;
    }
    else{
        return mid;
    }

}
return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println(Binary(num,key));
    }
}
