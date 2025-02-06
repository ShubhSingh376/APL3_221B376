class Bheem extends Pandav {
    Bheem(String name, boolean kindness) {
        super(name, kindness);
    }

    void fight() {
        System.out.println(name + " fights powerfully.");
    }

    void obey() {
        System.out.println(name + " is obedient.");
    }

    void kind() {
        if (kindness) {
            System.out.println(name + " is kind.");
        } else {
            System.out.println(name + " is less kind.");
        }
    }
}
