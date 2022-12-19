package PetNurseryCode;
 
public class Cat extends Animals {
    private boolean red;
    public Cat(String name,int age, boolean red) {
          super(name,age);
          this.red = false;
      }    
      @Override
      public String toString() {
          String redDescription;
          if (red == true) {
 
               redDescription = "it is brown";
          } else {
              redDescription = "it is not brown";
          }
 
          return " The Cat's name is " + name +  " it is " + age +  " years old, " + redDescription;}
   
}
