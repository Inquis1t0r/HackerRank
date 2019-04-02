
public class Person {
    int age;    
    public Person(int initial_Age) {
        if(initial_Age<0){
            age=0;
            System.out.println("Age is not valid, setting age to 0.");
                
        }
        else{
            age=initial_Age;
        }
    }
        

    public void amIOld() {
        String msg="";
        
        if(age<13)
            msg="young";
        else if (age == 16)
            msg="a teenager";
        else if (age >=13 && age < 18)
            msg="a teenager";
        else{
            msg="old";
        }
        System.out.println("You are " + msg + ".");
    }

    public void yearPasses() {
        age+=1;
    }
