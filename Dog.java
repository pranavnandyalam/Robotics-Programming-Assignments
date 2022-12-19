package PetNurseryCode;

public class Dog extends Animals{
 
    private boolean cavapoo;

    public Dog(String name,int age, boolean cavapoo) {
        super(name,age);
        this.cavapoo = false;
    }    
 
    @Override
        public String toString() {
 
        String breedInfo;

   
        if (cavapoo == true) {
 
             breedInfo = "a cavapoo";
        } 
        else {
            breedInfo = "not a cavapoo";
        }
       
 
        return "This dog's name is " + name +  ", it is " + age + " years old, " + "it is " + breedInfo ;

    }
}
