package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

public class WeaponSpell extends ItemSkill {

    private int damage;

    //------------------------------------ CONSTRUCTORS ---------------------------------------

    public WeaponSpell() {super("Greg") ;}
    public WeaponSpell(String name) {
        super(name);
    }
    //public WeaponSpell(int damage) ;}
    public WeaponSpell(String name, int damage) {
        super(name,damage);
        this.damage = damage;
    }



    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }


    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

    @Override
    public String toString() {
        return
                "     WEAPON / SPELL : " + getName() +
                "     DAMAGE : " + damage + " Points";
    }


    //------------------------- END -------------------------------------
}
