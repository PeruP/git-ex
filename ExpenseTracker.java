import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class ExpenseTracker{
    public static void print(List<Float> e,List<String> d,List<String> c){
        System.out.println("Date\t\tCategory\t\tExpense");
        for(int i=0;i<e.size();i++)
        System.out.println(d.get(i)+"\t\t"+c.get(i)+"\t\t"+e.get(i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is an expense tracker.");
        String choice="yes";
        while(choice.equalsIgnoreCase("yes")){
            System.out.println("Enter the username : ");
            String u=sc.next();
            System.out.println("Enter the password : ");
            String p=sc.next();
            System.out.println("Opened an account.");
            int f=0;
            Float total=(float)0;
            Map<String,Float> m=new HashMap<String,Float>();
            List<String> d=new ArrayList<String>();
            List<String> c=new ArrayList<String>();
            List<Float> e=new ArrayList<Float>();
            while(f==0){
                System.out.println("1.Add an Expense\n2.Check the Expenses\n3.Exit\nEnter your choice : ");
                int ch=sc.nextInt();
                switch(ch){
                    case 1 :
                        System.out.println("Enter the date(dd/mm/yyyy), category(capitals), and the expense : ");
                        d.add(sc.next());
                        String cat=sc.next();
                        c.add(cat);
                        Float exp=sc.nextFloat();
                        e.add(exp);
                        m.put(cat,m.getOrDefault(cat,(float)0)+exp);
                        total+=exp;
                        break;
                    case 2 :
                        System.out.println("Expenses till now are : ");
                        print(e,d,c);
                        System.out.println("Do you want to sort the data?(yes/no)");
                        String sort=sc.next();
                        int n=e.size();
                        while(sort.equalsIgnoreCase("yes")){
                            System.out.println("Sort according to....\n1.Date\n2.Category\n3.Expense\nEnter your choice : ");
                            int select=sc.nextInt();
                            switch(select){
                                case 1 :
                                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    for(int i=0;i<n-1;i++){
                                        for(int j=0;j<n-1-i;j++){
                                            LocalDate a=LocalDate.parse(d.get(j),formatter);
                                            LocalDate b=LocalDate.parse(d.get(j+1),formatter);
                                            if(a.isAfter(b)){
                                                Collections.swap(e,j,j+1);
                                                Collections.swap(d,j,j+1);
                                                Collections.swap(c,j,j+1);
                                            }
                                        }
                                    }
                                    System.out.println("Data is sorted according to the date.");
                                    print(e,d,c);
                                    break;
                                case 2 :
                                    for(int i=0;i<n-1;i++){
                                        for(int j=0;j<n-1-i;j++){
                                            if(c.get(j).compareTo(c.get(j+1))>0){
                                                Collections.swap(e,j,j+1);
                                                Collections.swap(d,j,j+1);
                                                Collections.swap(c,j,j+1);
                                            }
                                        }
                                    }
                                    System.out.println("Data is sorted according to the category.");
                                    print(e,d,c);
                                    break;
                                case 3 :
                                    for(int i=0;i<n-1;i++){
                                        for(int j=0;j<n-1-i;j++){
                                            if(e.get(j)>e.get(j+1)){
                                                Collections.swap(e,j,j+1);
                                                Collections.swap(d,j,j+1);
                                                Collections.swap(c,j,j+1);
                                            }
                                        }
                                    }
                                    System.out.println("Data is sorted according to the expense.");
                                    print(e,d,c);
                                    break;
                                default :
                                    System.out.println("Invalid choice!!!");
                            }
                            System.out.println("Do you want to sort the data?(yes/no)");
                            sort=sc.next();
                        }
                        break;
                    case 3 :
                        System.out.println("Closing the account.");
                        f=1;
                        break;
                    default :
                        System.out.println("Please enter a valid choice.");
                }
            }
            System.out.println("Total expenses entered till now are : "+total);
            List<String> l=new ArrayList(m.keySet());
            System.out.println("Category wise expenses in total are : ");
            for(String i:l)
            System.out.println(i+"->"+m.get(i));
            System.out.println("Do you want to create another account?(yes/no)");
            choice=sc.next();
        }
    }
}