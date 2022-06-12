public class Hive {
    private String nameHive;
    private int countBees;

    public Hive(String nameHive, int countBees){
        Bee[] arrayBees = new Bee[countBees];
        for (int i = 0; i < arrayBees.length; i++) {
            arrayBees[i] = Bee.
        }
    }

    private class Bee{
        public Bee(String nameBee, int age) {
            this.nameBee = nameBee;
            this.age = age;
        }

        public String getNameBee() {
            return nameBee;
        }

        public void setNameBee(String nameBee) {
            this.nameBee = nameBee;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private String nameBee;
        private int age;
    }
}
