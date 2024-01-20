import java.util.*;
public class MonsterGame
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String select="yes";
		while(select.equalsIgnoreCase("yes")){
		    System.out.println("Welcome to the adventure.\nYou are given 10 points initially.\nLet us start the game.");
		    int points=10,mp=15;
	        System.out.println("Choose your direction\n1. Up\n2. Down\n3. Left\n4. Right");
	        int ch=sc.nextInt(),f=1;
	        boolean sword=false;
	        while(f==1){
		        switch(ch){
		            case 1 : 
		                points-=2;
		                System.out.println("The route you chose is not good. So you lose 2 points and move towards right.");
		                ch=4;
		                break;
		            case 2 :
		                System.out.println("Hooray!!!\nYou received a sword that helps you fight with the monster ahead.\nWhich way do you want to go now?\n3. Left\n4. Right.");
		                ch=sc.nextInt();
		                sword=true;
		                break;
		            case 3 : 
		                System.out.println("Congratulations!!!\nYou earned extra 5 points.\nThe stronger you are the better you can fight the monster.\nWhich way do you want to go now.\n1. Up\n3. Left\n4. Right");
		                points+=5;
		                ch=sc.nextInt();
		                break;
		            case 4 : 
		                System.out.println("You encountered a monster.Monster has 15 points.\nEvery time monster hits you, you lose half of your points and every time you hit the monster you gain 2 points and the monster loses 2 points.\nGood Luck.");
		                if(sword){
		                    while(points>7 && mp!=0){
		                        System.out.println("Monster attacked you.You lost half of your points.");
		                        points/=2;
		                        System.out.println("Total Points you have till now : "+points);
		                        System.out.println("You attacked the monster.Monster lost 2 points and you gained two points.");
		                        points+=2;
		                        mp-=2;
		                        System.out.println("Total Points you have till now : "+points);
		                    }
		                    if(points>=mp/2){
		                        System.out.println("You won the game.\nWe are happy to see you win the game!!!");
		                    }
		                    else{
		                        System.out.println("Though you have a sword you must have the points greater than half the monster points to win the game.\nYou Lose.\nHope you perform better in the next game.");
		                    }
		                }
		                else{
		                    System.out.println("You don't have the sword.You can't fight with the monster.\nYou Lose.\nHope you perform better in the next game.");
		                }
		                f=0;
		                System.out.println("Do you want to play again?(Yes/No)");
		                select=sc.next();
		                break;
		        }
	        }
		}
	}
}
