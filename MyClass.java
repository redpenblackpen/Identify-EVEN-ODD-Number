public class MyClass {
    
    int num;
    
    public static int CheckOddEven(int num){
        
        if(num % 2 == 0){
            
            double even = Math.pow(num, 2);
            
            num = (int) even;
            
            System.out.println(num);
            
            return num;
            
        }else{
            
            double odd = Math.pow(num, 3);
            
            num = (int) odd;
            
            System.out.println(num);
            
            return num;
            
        }
        
    }
    
    public static void main(String args[]) {
        
        CheckOddEven(2);
      
    }
}