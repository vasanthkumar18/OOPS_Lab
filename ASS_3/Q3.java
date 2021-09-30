import java.lang.*;
import java.util.*;
import java.io.*;

public class Q3
{

    public static class DepartmentMeetingScheduler // class to schedule the meetings
    {
        String meetingTitle;
        String meetingDate;
        String meetingStartTime;
        String meetingEndTime;
        String meetingDescription;
        
        DepartmentMeetingScheduler(String meetingTitle, String meetingDate, String meetingStartTime, String meetingEndTime, String meetingDescription)
        {
            this.meetingTitle=meetingTitle;
            this.meetingDate=meetingDate;
            this.meetingStartTime=meetingStartTime;
            this.meetingEndTime=meetingEndTime;
            this.meetingDescription=meetingDescription;
        }
    }
    
    // to check if there is a collision b/w meetings
    public static boolean scheduleMeeting(ArrayList<DepartmentMeetingScheduler> listOfMeetings, String date, String startTime, String endTime)
    {
        for(DepartmentMeetingScheduler meet:listOfMeetings)
        {
            if(meet.meetingDate.equals(date))
            {
                String startDetails[],endDetails[];
                
                
                // this is to conver 24 hour format time to integer in minutes so that we can check collision
                startDetails=meet.meetingStartTime.split(":");
                int presentStart=Integer.parseInt(startDetails[0])*60+Integer.parseInt(startDetails[1]);
                endDetails=meet.meetingEndTime.split(":");
                int presentEnd=Integer.parseInt(endDetails[0])*60+Integer.parseInt(endDetails[1]);
                
                startDetails=startTime.split(":");
                int newStart=Integer.parseInt(startDetails[0])*60+Integer.parseInt(startDetails[1]);
                endDetails=endTime.split(":");
                int newEnd=Integer.parseInt(endDetails[0])*60+Integer.parseInt(endDetails[1]);
                if((newStart>=presentStart && newStart<=presentEnd) || (newEnd>=presentStart && newEnd<=presentEnd))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void displayMeetings(ArrayList<DepartmentMeetingScheduler> listOfMeetings, String date)
    {
        for(DepartmentMeetingScheduler meet:listOfMeetings)
        {
            if(meet.meetingDate.equals(date))
            {
                System.out.println("On "+date+", from "+meet.meetingStartTime+" to "+meet.meetingEndTime+" : "+meet.meetingTitle+" : "+meet.meetingDescription);
            }
        }
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    ArrayList<DepartmentMeetingScheduler> listOfMeetings=new ArrayList<>();
	    while(true)
	    {
	        System.out.println("1.Schedule Meeting\n2.List Meetings\n3.Exit");
	        System.out.print("Enter your choice: ");
	        int choice=sc.nextInt();
	        String buffer=sc.nextLine();
	        if(choice==1)
	        {
	        	System.out.print("Title- ");
			String meetingTitle=sc.nextLine();
			System.out.print("Date- ");
			String meetingDate=sc.nextLine();
			System.out.print("Start Time- ");
		   	String meetingStartTime=sc.nextLine();
		   	System.out.print("End Time- ");
		 	String meetingEndTime=sc.nextLine();
		 	System.out.print("Description- ");
			String meetingDescription=sc.nextLine();
                if(scheduleMeeting(listOfMeetings, meetingDate, meetingStartTime, meetingEndTime)==false)
                {
                    DepartmentMeetingScheduler meeting=new DepartmentMeetingScheduler(meetingTitle, meetingDate, meetingStartTime, meetingEndTime, meetingDescription);
                    listOfMeetings.add(meeting);
                    System.out.println("Scheduled successfully");
                }
                else{
                    System.out.println("Collision! Already another meeting is scheduled");
                }
                System.out.println();
	        }
	        else if(choice==2)
	        {
	            String date=sc.nextLine();
	            displayMeetings(listOfMeetings,date);
	            
	        }
	        else break;
	    }
	    
	    
	    
	}
}

