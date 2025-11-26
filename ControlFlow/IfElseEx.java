package ControlFlow;

public class IfElseEx {
    
    public static void main(String[] args) {
        
        String nationality = "American";
        int age = 23;

        if(nationality != "Indian")
        {
            System.out.println("Can't vote");
        }
        else if(nationality == "Indian" && age < 18)
        {
            System.out.println("can't vote");
        }
        else
        {
            System.out.println("Can vote");
        }
    }
}
