package HomeWorkAIT.lesson25;

public class TestAthlete {
    public static void main(String[] args) {
       Athlete athlete = new Athlete();

       System.out.println("_______\uD83C\uDFCA\u200D♂\uFE0F________");
       athlete.warmUp();
       athlete.dive();
       athlete.swim();

       System.out.println("_______\uD83C\uDFC3\u200D♂\uFE0F________");
       athlete.stretch();
       athlete.run();
       athlete.jump();
    }
}
