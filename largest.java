public class largest
{
   public static void main(String[] args)
   {
       int A[] = new int[] { 32, 43, 13, 46, 27, 9, 1, 51}; //take input 8 integers

       int MAXno = A[0]; // let assume 1st element is largest

       for (int i = 1; i < A.length; i++)
       {
           if (A[i] > MAXno)
           {
               MAXno = A[i];
           }
          
       }

       System.out.println("Largest Number: " + MAXno);
      
   }

}