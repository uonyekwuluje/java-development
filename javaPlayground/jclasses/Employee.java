public class Employee {
   public static void main(String[] args){
      System.out.println("Testing New Class");
      EmployeeImp newEmp = new EmployeeImp("BillyCat","MillyMeowww");
      newEmp.catSound();
   }
}


class EmployeeImp {
   private String catName;
   private String catSound;

   public EmployeeImp() {}


   public EmployeeImp(String catName, String catSound){
     this.catName = catName;
     this.catSound = catSound;
   }

   public void catSound(){
      System.out.println("Cat Sound => "+this.catSound);
   }

   public String getCatName(){
      return catName;
   }
   public void setCatName(String catName){
      this.catName = catName;
   }

   public String getCatSound(){
      return catSound;
   }
   public void setCatSound(String catSound){
      this.catSound = catSound;
   }



}
