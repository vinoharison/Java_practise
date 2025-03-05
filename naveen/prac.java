


//find the smallest and largest string
public class prac {
        public static void main(String[] args) 
        {
        
            String str="aAhellozZ";
            char largest= str.charAt(0);
            char smallest=str.charAt(0);

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>largest){
                    largest=str.charAt(i);
                }
                if(str.charAt(i)<smallest){
                    smallest=str.charAt(i);
                }
            }
                  System.out.println(largest);//largest
             System.out.println(smallest); //smallest

                     
             }
        
    }

  
   



