public class excersie5{
   public static void main(String[] args){
       int A[] = new int[] { 32, 43, 13, 46, 27, 9, 1, 51};
       int MAXno = A[0];
       for (int i = 1; i < A.length; i++){
           if (A[i] > MAXno){
               MAXno = A[i];
           }
       }
       System.out.println("Largest Number: " + MAXno);
       }
}