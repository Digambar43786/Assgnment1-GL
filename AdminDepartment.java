package department;
import department.*;
class AdminDepartment extends SuperDepartment
{
 public String departmentName()
 {
  return "Admin Department";
 }
 public String getTodaysWork()
 {
  return "Completer your documents submission";
 }
 public String getWorkDeadline()
 {
   return "Complete by EOD";
 }
 public static void main (String[] args)
 {
  System.out.println ("Welcome to Admin Department");
   AdminDepartment ad=new AdminDepartment();
   ad.departmentName();
   ad.getTodaysWork();
   ad.getWorkDeadline();
   super.isTodayAHoliday();
 }
}