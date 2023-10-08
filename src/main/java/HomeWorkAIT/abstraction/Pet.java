package HomeWorkAIT.abstraction;

 abstract class Pet {
     String name;
     abstract  void makeSaund();

  public String getName() {
   return name;
  }

  public void setName(String name) {
   this.name = name;
  }
  public void showName(){
   System.out.println(name);
  }
 }
