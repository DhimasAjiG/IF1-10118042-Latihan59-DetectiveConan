
package if1.pkg10118042.latihan59.detectiveconan;

public class MainCharacter extends Character{
    private String info;
    private String goal;

    public MainCharacter(String info, String goal, String name, String from, boolean eyeglasses) {
        super(name, from, eyeglasses);
        this.info = info;
        this.goal = goal;
    }

    public String getSpeciality() {
        return info;
    }

    public String getGoal() {
        return goal;
    }
    
    public void displayCharacter() {
        System.out.println("-----");
        System.out.println("Nama : " + name);
        System.out.println("-----");
        System.out.println("Dari : " + from);
        if(eyeglasses) {
            System.out.println("Kecamata : Iya");
        } else {
            System.out.println("Kecamata : Tidak");
        }
        System.out.println("Keterangan : " + info);
        System.out.println("Tujuan : " + goal);
        System.out.println();
    }

}