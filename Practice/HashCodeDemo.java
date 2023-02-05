public class HashCodeDemo {
    public static void main(String a[]) {
        String name = "Megha";
        String title = "Megha";
        String animal = "Dog";
        String thing = "Pot";
        if(name.equals(title)){
            System.out.println("hash code for name and title is : " + name.hashCode() +", " + title.hashCode());
        }
        if(!animal.equals(thing)){
            System.out.println("hash code for animal and thing is : " + animal.hashCode() +", " + thing.hashCode());
        }
    }
}
