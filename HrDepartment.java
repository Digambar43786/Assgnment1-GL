import department.SuperDepartment;
class HrDepartment extends SuperDepartment
{
 public String departmentName()
 {
  return "Hr Department";
 }
 public String getTodaysWork()
 {
  return "Fill today's timesheet and mark our attendance";
 }
 public String getWorkDeadline()
 {
  return "Complete by EOD";
 }
 public String doActivity()
 {
  return "team Lunch";
 }
 public static void main (String[] args)
 {
   System.out.println ("Welcome to  HR Department");
    HrDepartment hd=new HrDepartment();
    hd.departmentName();
    hd.getTodaysWork();
    hd.doActivity();
    super.isTodayAHoliday();
  }
}
