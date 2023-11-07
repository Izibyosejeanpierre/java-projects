//Java Program to demonstrate the use of If else-if ladder. 
public class axample {
public static void main(String[]agrs){
//defining a variable  
    int time=13; 
      //Check time
    if(time<12){  
        System.out.println("good morning");  
    }  
    else if(time==12){  
        System.out.println("good lunch!");  
    }  
    else if(time>12 && time<19){  
        System.out.println("good evening");  
    }  
    else if(time>=19 && time<=21){  
        System.out.println("have nive dinner");  
    }   
      else{  
        System.out.println("good night");  
    }  
}}  
