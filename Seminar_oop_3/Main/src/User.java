public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;
    private Personal subordinate;


    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setSubordinate(Personal subordinate) {
        this.subordinate = subordinate;
    }

    public Personal getSubordinate() {
        return subordinate;
    }

    @Override
    public String toString() {
        return String.format("\nFirst name: %s, Last name: %s, age: %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        int compareNames = this.firstName.compareTo(o.firstName);
        if (compareNames !=0) return compareNames;
        int comparelastNames = this.lastName.compareTo(o.lastName);
        if (comparelastNames !=0) return comparelastNames;
//        if (this.age < o.age){
//            return -1;
//        }else if (this.age > o.age){
//            return 1;
//        }else return 0;

        return this.age - o.age;
    }



}
