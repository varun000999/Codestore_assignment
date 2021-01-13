import java.util.*;
import java.io.*;
class table{
    String location;
    int number_of_sits;
    //Although it would be better to table have some name or id as a property as in that case even more featres and methods can be added to program.
    HashSet<Integer> st=new HashSet<>();//storing the time in 24hr format say 4, 11, 19 and 23. Also, i am assuming the duration is fixed for 1hr once the table is reserved for someone, but it can changed easily.
    table(String location,int number_of_sits)
    {
        this.location=location;// As tables do not have ids hence i have taken location as a kind of id.
        this.number_of_sits=number_of_sits;
    }
}
class Restaurant {
    static ArrayList<table> arr=new ArrayList<>();//storing the tables for refernce.
    public static void list_of_tables()// method to display list of tables.
    {
        for(table i: arr)
        {
            System.out.println("Table number "+i.location+" capacity "+i.number_of_sits+" ");
        }
    }
    public static void filter_by_size(int size)
    {
        //tables are of fixed size say 1,2,4 and 6.
        for(table i:arr)
            {
                if(i.number_of_sits<=size)// i made it all with given and smaller, can be fixed too means it then return tables of fixed size say 2 or 1, etc.
                {
                    System.out.println("Table number : "+i.location);//again have to use location as a kind of id.
                }
            }
    }
    public static void filter_by_period(int period)//actually it is taking a time say 7 or 11 or 21 and accordingly all tables that are free at that time would be displayed. We can even increse functionality by filtering by periods too like 2-4 etc.
    {
        for(table i:arr)
        {
            if(!i.st.contains(period))
            {
                System.out.println("Table number : "+i.location);
            }
        }
    }
    public static void registration_form(String location,int time)// again if table would have id and alse name then user can choose name and accodingly the id of that table would be considered for further actions.
    {
        for(table t:arr)
        {
            if(t.location==location)// Note location is a string. which actually acting as an id. to distinuish tables.
            {
                if(!t.st.contains(time))//checking the table is booked or not at that time.
                {    
                    System.out.println("Registration sucessful!!");
                    t.st.add(time);
                }
                else
                    System.out.println("Extreamly Sorry! this table is already booked for this slot, choose any other table");
            }
        }        
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        //BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        table T1_1=new table("1",1);arr.add(T1_1);// Adding some dummy tables.
        table T1_2=new table("2",1);arr.add(T1_2);
        table T1_3=new table("3",1);arr.add(T1_3);
        table T1_4=new table("4",1);arr.add(T1_4);
        table T1_5=new table("5",1);arr.add(T1_5);
        table T2_1=new table("6",2);arr.add(T2_1);
        table T2_2=new table("7",2);arr.add(T2_2);
        table T2_3=new table("8",2);arr.add(T2_3);
        table T2_4=new table("9",2);arr.add(T2_4);
        table T4_1=new table("10",4);arr.add(T4_1);
        table T4_2=new table("11",4);arr.add(T4_2);
        table T6_1=new table("12",6);arr.add(T6_1);
        table T6_2=new table("13",6);arr.add(T6_2);
        // uncomment funtions to see outputs of them.
        //list_of_tables();//method for a kind of dashboard.
        //filter_by_size(2);//size can be 1,2,4 or 6 also the method uses <= if user want only fixed size than simply removing '<'
        //filter_by_period(period);//the period is when user want to see which tables are free say at 19 or at 5.
        //registration_form("4",12);//takes two input table location as a id and time forreservation
        //registration_form("4",12);//when a user try to pick a table which is already occupied.
        //Also if somethings do not work try to change the class name to codechef and file name codechef.java as i used their ide for making this and at last changed the class name.
        //I think this was all, to make this assignmnet i made some assumptions please let me know if i was close to what i have to do or not?
    }
}
