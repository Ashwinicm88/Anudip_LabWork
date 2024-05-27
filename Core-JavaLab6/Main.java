package Lab5;
//start of the Main class
//created the main class
public class Main {
 public static void main(String[] args) 
 {
    /*Created the stundet and Teacher class objects to access the speak method using new keyword */
    Student studentObj=new Student();
    Teacher teacherObj=new Teacher();

    //called the speak method from both classes using their objects
    studentObj.speak();
    teacherObj.speak();
 }   
}
//end of the Main class