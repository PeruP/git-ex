import java.util.*;
import java.io.*;
import java.lang.*;
class Rps{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String ch="yes";
while(ch.equals("yes")){
String s[]={"p","r","s"};
String cs=s[new Random().nextInt(s.length)];
System.out.println("Rock-->r\nPaper-->p\nScissors-->s\nEnter your move : ");
String us=sc.next();
System.out.println("Opponent's move : "+cs);
String out;
if(us.equals(cs))
out="Tie";
else if(us.equals("r")){
if(cs.equals("s"))
out="You win";
else
out="You lose";
}
else if(us.equals("s")){
if(cs.equals("r"))
out="You lose";
else
out="You win";
}
else if(us.equals("p")){
if(cs.equals("s"))
out="You lose";
else
out="You win";
}
else
out="It is an valid move";
System.out.println(out);
System.out.println("Do you want to play again(yes/no)?");
ch=sc.next();
}
}
}