public class Tester {
    public static void main(String[] args) {
        AnimalList ALO = new AnimalList();

        Dog polgoso = new Dog();
        Fish nemo = new Fish();
        Dog pwetpwet = new Dog();
        Dog satyang = new Dog();
        Dog kutchi = new Dog();
        Fish fishball = new Fish();


        ALO.add(polgoso);
        ALO.add(nemo);
        ALO.add(pwetpwet);
        ALO.add(satyang);
        ALO.add(kutchi);
        ALO.add(fishball);
        ALO.add(fishball);
        ALO.add(fishball);
        ALO.loopAnimal();
    }
}
