import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int hour=0;
        switch(s.substring(8,10)){
            case("PM"):
            hour=Integer.parseInt(s.substring(0,2));
            if(hour<12) hour=hour+12;
            String newHour=String.valueOf(hour);
            s=s.replace(s.substring(0,2),newHour);
            System.out.println(s.replace("PM"," "));
            break;
            case("AM"):
            hour=Integer.parseInt(s.substring(0,2));
            if(hour>=12) hour=hour-12;
            String newHour1=String.valueOf(hour);
            if(newHour1.length()==1) newHour1="0"+newHour1;
            s=s.replace(s.substring(0,2),newHour1);
            System.out.println(s.replace("AM"," "));
            break;
        }
    }
}
