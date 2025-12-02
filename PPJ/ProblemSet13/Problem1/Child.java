class Child {
    private String name;
    private int numCandies;

    public Child(String name) {
        this.name = name;
        this.numCandies = 2;
    }

    public void givesCandyTo(Child other) {
        if (this.numCandies > 0) {
            this.numCandies--;
            other.numCandies++;
        } else {
            System.out.println("No candies to give!");
        }
    }

    public static Child getChildByName(Child[] children, String name) {
        for (Child child : children) {
            if (child.name.equals(name)) {
                return child;
            }
        }
        return null;
    }

    public static void printChildren(Child[] children) {
        System.out.print("[");
        for (Child child : children) {
            System.out.print(" (" + child.name + ", " + child.numCandies + " candies)");
        }
        System.out.println(" ]");
    }
}
