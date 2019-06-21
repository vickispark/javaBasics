package com.InnerClass;


class Manager {                                                // Outer Class
  private class Grade {                                        // Inner Class
    private char grade;
    private char calculateGrade(String employeeid, int point) {
      if (isEmployeeExists(employeeid))  {
        if (point  < 100 && point >= 90) {
           grade = 'A';
        } else if (point < 90 && point >= 80) {
           grade = 'B';
        } else {
           grade = 'C';
        }
      
      }
      return grade;
    }
    // Check if the employee id exists or not
    private boolean isEmployeeExists(String employeeId) {
      // check from database or file system
      return true;
    }
  
  }
  public char CheckEmployeeID(String employeeId, int point) {
    Grade grade = new Grade();                                
    return grade.calculateGrade(employeeId,point);
  }

}
class Execute {
public static void main (String[] args) {
  Manager manager = new Manager();
  String employeeId = "I1001";
  char gradePoint = manager.CheckEmployeeID(employeeId, 80);
  System.out.println("The grade for " + employeeId + " is " + gradePoint);
}
}