package DmvSimulator;

public class DmvSimulator 
{
    public static void main(String[] args) 
    {
        int userCallNumber = (int)(200 * Math.random() + 1);
        System.out.println("Hello! Welcome to the DMV. \nYour number is " + userCallNumber + ". Please wait until this number is called.");

        for(int currentCallNumber = (userCallNumber + 1); currentCallNumber <= 200; currentCallNumber++) 
        {
            System.out.println("Current call: " + currentCallNumber);
        }
        for (int currentCallNumber = 1; currentCallNumber <= userCallNumber; currentCallNumber++) 
        {
            System.out.println("Current call: " + currentCallNumber);
        }

        int n = (int)(100*Math.random());

        if(n <= 99)
        {
            System.out.println("You do not have the required paperwork. We can't do anything without your paperwork!");
        }
        else
        {
            System.out.println("You have the required paperwork. You are all set, thank you!");
        }
    }
}