import java.util.*;
public class Question{
    public static char validOption(char ans){
        Scanner sc=new Scanner(System.in);
        while((ans<65 || (ans>68 && ans<=90)) || ((ans>90 && ans<97)||(ans>100 && ans<=122))){
            System.out.println("Please enter a valid option");
            ans=sc.next().charAt(0);
        }
        return ans;
    }
    public static int quest(){
        Scanner sc=new Scanner(System.in);
        char ans;
        List<Integer> c = new ArrayList<Integer>();
        Map<Integer,String> w = new HashMap<Integer,String>();
        System.out.println("Question No : 1\n A train running at the speed of 60 km/hr crosses a pole in 9 seconds. What is the length of the train?\nA. 120 metres\nB. 180 metres\nC. 324 metres\nD. 150 metres\nWhat do you choose?");//D
        ans=sc.next().charAt(0);
        ans=validOption(ans);
        if(ans=='D' || ans=='d')
            c.add(1);
        else
            w.put(1,"You chose "+ans+"\nThe correct answer is, D. 150 metres");
        System.out.println("Question No : 2\nIn a certain store, the profit is 320% of the cost. If the cost increases by 25% but the selling price remains constant, approximately what percentage of the selling price is the profit?\nA. 30%\nB. 70%\nC. 100%\nD. 250%\nWhat do you choose?");//B
        ans=sc.next().charAt(0);
        ans=validOption(ans);
        if(ans=='B' || ans=='b')
            c.add(2);
        else
            w.put(2,"You chose "+ans+"\nThe correct answer is, B. 70%");
        System.out.println("Question No : 3\nTwo ships are sailing in the sea on the two sides of a lighthouse. The angle of elevation of the top of the lighthouse is observed from the ships are 30° and 45° respectively. If the lighthouse is 100 m high, the distance between the two ships is:\nA. 173 m\nB. 200 m\nC. 273 m\nD. 300 m\nWhat do you choose?");//C
        ans=sc.next().charAt(0);
        ans=validOption(ans);
        if(ans=='C' || ans=='c')
            c.add(3);
        else
            w.put(3,"You chose "+ans+"\nThe correct answer is, C. 273 m");
        System.out.println("Question No : 4\nMr. Thomas invested an amount of Rs. 13,900 divided in two different schemes A and B at the simple interest rate of 14% p.a. and 11% p.a. respectively. If the total amount of simple interest earned in 2 years be Rs. 3508, what was the amount invested in Scheme B?\nA. Rs.6400\nB. Rs.6500\nC. Rs.7200\nD. Rs.7500\nWhat do you choose?");//A
        ans=sc.next().charAt(0);
        ans=validOption(ans);
        if(ans=='A' || ans=='a')
            c.add(4);
        else
            w.put(4,"You chose "+ans+"\nThe correct answer is, A. Rs.6400");
        System.out.println("Question No : 5\nSix bells commence tolling together and toll at intervals of 2, 4, 6, 8 10 and 12 seconds respectively. In 30 minutes, how many times do they toll together?\nA. 4\nB. 10\nC. 15\nD. 16\nWhat do you choose?");//D
        ans=sc.next().charAt(0);
        ans=validOption(ans);
        if(ans=='D' || ans=='d')
            c.add(5);
        else
            w.put(5,"You chose "+ans+"\nThe correct answer is, D. 16");
        System.out.println("Question No : 6\nFrom a group of 7 men and 6 women, five persons are to be selected to form a committee so that at least 3 men are there on the committee. In how many ways can it be done?\nA. 564\nB. 645\nC. 735\nD. 756\nWhat do you choose?");//D
        ans=sc.next().charAt(0);
        ans=validOption(ans);
        if(ans=='D' || ans=='d')
            c.add(6);
        else
            w.put(6,"You chose "+ans+"\nThe correct answer is, D. 756");
        System.out.println("Question No : 7\nA clock is started at noon. By 10 minutes past 5, the hour hand has turned through:\nA. 145°\nB. 150°\nC. 155°\nD. 160°\nWhat do you choose?");//C
        ans=sc.next().charAt(0);
        ans=validOption(ans);
        if(ans=='C' || ans=='c')
            c.add(7);
        else
            w.put(7,"You chose "+ans+"\nThe correct answer is, C. 155°");
        System.out.println("Question No : 8\nA and B together have Rs. 1210. If 4/15 of A amount is equal to 2/15 of B amount, how much amount does B have?\nA. Rs.460\nB. Rs.484\nC. Rs.550\nD. Rs.664\nWhat do you choose?");//B
        ans=sc.next().charAt(0);
        ans=validOption(ans);
        if(ans=='B' || ans=='b')
            c.add(8);
        else
            w.put(8,"You chose "+ans+"\nThe correct answer is, B. Rs.484");
        System.out.println("Question No : 9\nIn a shower, 5 cm of rain falls. The volume of water that falls on 1.5 hectares of ground is:\nA. 75 cu.m\nB. 750 cu.m\nC. 7500 cu.m\nD. 75000 cu.m\nWhat do you choose?");//B
        ans=sc.next().charAt(0);
        ans=validOption(ans);
        if(ans=='B' || ans=='b')
            c.add(9);
        else
            w.put(9,"You chose "+ans+"\nThe correct answer is, B. 750 cu.m");
        System.out.println("Question No : 10\nIt was Sunday on Jan 1, 2006. What was the day of the week Jan 1, 2010?\nA. Sunday\nB. Saturday\nC. Friday\nD. Wednesday\nWhat do you choose?");//C
        ans=sc.next().charAt(0);
        ans=validOption(ans);
        if(ans=='C' || ans=='c')
            c.add(10);
        else
            w.put(10,"You chose "+ans+"\nThe correct answer is, C. Friday");
        return score(c,w);
    }
    public static int score(List<Integer> c,Map<Integer,String> w){
        int total=c.size()*10;
        System.out.println("You answered "+c.size()+" questions correctly and you earned "+total+" points for those questions\n");
        System.out.println("Questions you answered wrong are : ");
        for(int i:w.keySet()){
            System.out.println("Question No : "+i+"\n"+w.get(i));
            total-=5;
        }
        System.out.println("You scored "+total);
        return total;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s;
do{
   System.out.println("Excited to start the quiz!\nLet's know the rules first.\nQuiz is for 100 marks in total.\nThere are 10 questions.\nEach question carries 10 marks and there is a penalty of negative 5 marks for every wrong answer.\nBe careful while choosing your answer.\nAre you ready to start the quiz?\nLet's begin!");
   int res=quest();
   if(res>50)
   System.out.println("You performance was good");
   else if(res==50)
   System.out.println("You could perform better");
   else
   System.out.println("You should try harder");
   System.out.println("Do you want to attempt again?");
   s=sc.next();
}while(s.equalsIgnoreCase("yes"));
}
}
