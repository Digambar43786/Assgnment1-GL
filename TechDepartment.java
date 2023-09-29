import department.SuperDepartment;
class TechDepartment extends SuperDepartment
{
 public String departmentName()
 {
  return "Tech Department";
 }
 public String getTodaysWork()
 {
  return "Complete coding of module 1";
 }
 public String getWorkDeadline()
 {
  return "Complete by EOD";
 }
 public String getTechStackInformation()
 {
   return "Core Java";
 }
public static void main (String[] args)
{
 System.out.println ("Welcome to Tech Department");
 TectDepartment td=new TechDepartment();
 td.departmentName();
 td.getTodaysWork();
 td.getWorkDeadline();
 super.isTodayAHoliday();
}