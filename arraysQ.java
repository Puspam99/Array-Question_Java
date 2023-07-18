public class arraysQ{


    public static int linearSearch(int []array , int key){
        for (int i = 0; i<array.length; i++){
            if (array[i] == key){
                return array[i];
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int arr[] = {2,6,8,7,6,5,1,};
        int key = 7;
        System.out.println("number in array  "+linearSearch(arr, key));
    }

    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0 ; i<arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("smallest number is : "+smallest);
        return largest;
       
    }
    public static void main(String [] args){
      int array[] = {1,3,5,9,6,8,4,2,1};
      System.out.println("Largest number is : "+getLargest(array));
    }

    public static int binarySearch(int arr[] , int key){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int midd = (start + end) / 2;
            if (arr[midd] == key){
                return midd;
            }
            if(arr[midd] < key){
                start = midd+1;
            }else{
                end = arr[midd]-1;
            }
        }
        return -1;

    }
    public static void main(String [] args){
        int arr [] = {1,3,5,6};
        int key = 5;
        System.out.println("key value is : " +binarySearch(arr, key));
    }

    public static void reverse(int nums[]){
        int first = 0;
        int last = nums.length-1;
        while(first < last ){
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first]= temp;
            first ++;
            last--;
        }
    }
    public static void main(String [] args){
        int arr[] = {2,6,8,9,4,7};
        reverse(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ,");
        }
    }

    public static void printPairs(int nums[]){
        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                System.out.print("("+nums[i]+","+nums[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int arr [] = {2,6,5,8,9,2,3};
        printPairs(arr);
    }


    public static void subArraySum(int nums[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }

        for (int i=0; i<nums.length; i++){
            int start = i;
            for (int j = i; j<nums.length; j++){
                int end = j;
               curr = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
               if (curr >max){
                max = curr;
               }
            }
        }
        System.out.println("sub array sum : "+max);   
    } 
    public static void main(String [] args){
            int arr [] = {2,6,5,8,9,2,3};
            subArraySum(arr);

    }     

    public static void kadanes(int nums[]){
        int CS = 0;
        int MS = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++){
            CS += nums[i];
            if(CS < 0){
                CS = 0; 
            }   
            
            MS = Math.max(CS, MS);
           
        }
        System.out.println(MS);
    }
    public static void main(String [] args){
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(array);
    }

    public static float  stri(String str){
        int x = 0 , y = 0;
        for(int i = 0; i<str.length(); i++){
            char tr = str.charAt(i);
            if(tr == 'N'){
                x++;
            }
            else if(tr == 'S'){
                x--;
            }
            else if(tr == 'E'){
                y++;
            }
            else{
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
       
        
    }
            public static void main(String[] args){
                String  str= "WNEENESENNN";
                stri(str);
       


public static void main(String [] args){
int a  =10;
int b= 11;
a = b-a;
b= b-a;
a=  a+b;
System.out.println(b);;

int c = 132;
int result = 0;
for (int i=0; c>=0;i++){
    result += c%10;
    c = c/10;
    

}
System.out.println(result);
}

}


    {import java.util.Arrays;

    public class ppt1st{
    
        // public static void main(String []args){

        //     int arr[] = {2, 7, 11, 15};
        //     int target = 9;
        //     int result[] = new int[2];

        //     for (int i = 0; i < arr.length - 1; i++) {
        //         for (int j = i + 1; j < arr.length; j++) {
        //             if (arr[i] + arr[j] == target) {
        //                 result[0] = i;
        //                 result[1] = j;

        //                 System.out.println(Arrays.toString(result));
        //             }
        //         }
        //     }
        // }
            public static void main(String args[]){
                int nums[] = {1,3,5,6};
                int target = 5;
                int start= 0;
                int end = nums.length;
                while(start <= end){
                    int mid = (start+end)/2;
                    if(nums[mid] == target){
                        System.out.println(mid);
                    }if(nums[mid] < target){
                        start = mid+1;
                    }
                    if(nums[mid]<target){
                            start++;
                    }
                }
            
            }

    }

        public static int[] plusOne(int[] digits) {
    int n = digits.length;
    
    // Iterate from right to left
    for (int i = n - 1; i >= 0; i--) {
        // Increment the current digit
        digits[i]++;
        
        // Check if there is a carry
        if (digits[i] < 10) {
            // No carry, return the updated digits
            return digits;
        }
        
        // Carry is present, set the current digit to 0
        digits[i] = 0;
    }
    
    // If we reach here, it means there is a carry in the most significant digit
    // Create a new array with an extra digit for the carry
    int[] newDigits = new int[n + 1];
    newDigits[0] = 1;
   
    return newDigits;
}
public static void main(String[] args) {
    int[] digits = {9, 9, 9,9,9};
    int[] result = plusOne(digits);
     
    System.out.print("Output: ");
    for (int digit : result) {
        System.out.print(digit + " ");
    }
}

    public static String func(String str)
    {
        if ((str==null)||(str.length() <= 1))
           return str;

        else
        {  
            String r = func(str.substring(1,str.length()));
            return r + str.charAt(0) ;
        }
    }
     
    public static void main(String[] args)
    {
        String str = ""AeI123"";
       
        System.out.print( func(str) );
    }
}
