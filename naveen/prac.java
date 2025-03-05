


// reverse a string 
public class prac {
        public static void main(String[] args) 
        {
        
            String str="vinod";
            char[]newstr=str.toCharArray();
            int i=0;
            int j=newstr.length-1;

            while(i<j){
                char temp=newstr[i];
                newstr[i]=newstr[j];
                newstr[j]=temp;
                i++;
                j--;
            }
              System.out.println(newstr);
           

                     
             }
        
    }

  
   



