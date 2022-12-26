import java.util.*;
import java.time.*;
public class Calender {
	
	public static void main(String[] args) throws Exception{

	String[] monthValue = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	int[] value = {1,2,3,4,5,6,7,8,9,10,11,12};
	int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String[] daysofweek = {" S","M","T","W","T","F","S"};
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Year You Were Born From[1900-2023]");
	int year = sc.nextInt();
	while(true) {
	System.out.println("Enter Month:");
	int month = sc.nextInt();
	System.out.println(getMonth(value,monthValue,month));
	
	Date date = new Date();
    
	getAge(date,year);
	fInstruction(year);
	
	calender(month,days,year,daysofweek);
	 }
}
public static void calender(int month,int[] days,int year,String[] values) {
if(month == 2 && checkifitisaleapyear(year)) {
	days[month] = 29;
	}
printDaysofweek(values);
int d = getDay(month,1,year);
	
for(int i = 0; i < d; i++) 
	System.out.print("   ");
for(int i = 1; i <= days[month]; i++) {
	System.out.printf("%2d ",i);
if((i+d)%7 == 0 || i == days[month]) System.out.println();
	}
}
public static int getDay(int year,int day,int month) {
	int y = year - (14 - month) / 12;
	int x = y + y/4 - y/100 + y/400;
	int m = month + 12 * ((14 - month) / 12) - 2;
	int d = (day + x + (31*m)/12) % 7;
	return d;
}
public static void fInstruction(int year) throws Exception {
	int i = 1899;
	while(i <= 2022) {
		 i++;
     if(year == i) {	
	 
       break;
	 }
	 }
	 if(year != i) {
		throw new FollowInstruction("Enter Year From 1900 to 2023");
	}
	} 
public static void getAge(Date date,int yearyouwereborn) {
	date = new Date();
	if(yearyouwereborn != -1) {
	date.setYear(2022);
	int a = date.getYear();
	int value = a-yearyouwereborn;
		System.out.println("Age: "+value);
		}
	}
public static String getMonth(int[] value,String[] monthvalue,int month) {
	for(int i = 0; i < monthvalue.length;i++) {
		if(value[i] == month) {
			return monthvalue[i];
		} else {
			}
		}
		return "No month available for such index";
		}
public static void printDaysofweek(String[] days) {
	for(String c : days) {
		System.out.print(c+"  ");
	}
	System.out.println();
	}
public static boolean checkifitisaleapyear(int year) {
	int step1 = year%4;
	int step2 = year%400;
	int step3 = year%100;
	if(step1 == 0 | step2 == 0 | step3 == 0) {
	return true;
	} else {
	return false;
	}
	}
} 
	