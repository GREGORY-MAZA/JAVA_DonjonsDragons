package menu;

//-------------------------------- DECLARATION ATTRIBUTES CLASS ---------------------------

import loots.Item;

/** Class Character est la classe Parent abstraite de Warrior et Wizard.
 * Elle contient les attributs :
 * nom (String)  ,points de vie (int) ,points d'attaque (int) ,points de protection (int) ,points de vie Max (int),
 * points d'attaqye Max (int), main d'attaque (Item Objet), main défense (Item Objet),points de vie par défaut (int),
 * points d'attaque par défaut (int)  ,points de protection par défaut (int).
 */

public abstract class Character {

    private String name;
    private int health;
    private int attack;
    private int protect;
    private int healthMax;
    private int attackMax;
    private Item attackHand;
    private Item defenseHand;
    private int defaultHealth;
    private int defaultAttack;
    private int defaultProtect;
    private int experience;
    private int level;


    //------------------------------------ CONSTRUCTORS ---------------------------------------

    /**
     * CONSTRUCTORS
     *
     * @param name = nom du personnage (String)
     * @param health = points de vie (int)
     * @param attack = points d'attaque (int)
     * @param protect = points de protection (int)
     * @param healthMax = points de vie Max (int)
     * @param attackMax = points d'attaqye Max (int)
     * @param attackHand = main d'attaque (Item Objet)
     * @param defenseHand = main défense (Item Objet)
     * @param defaultHealth = points de vie par défaut (int)
     * @param defaultAttack = points d'attaque par défaut (int)
     * @param defaultProtect = points de protection par défaut (int)
     */

    public Character(String name, int health, int attack, int protect, int healthMax, int attackMax, Item attackHand, Item defenseHand,
                     int defaultHealth, int defaultAttack , int defaultProtect, int experience, int level) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.protect = protect;
        this.healthMax = healthMax;
        this.attackMax = attackMax;
        this.attackHand = attackHand;
        this.defenseHand = defenseHand;
        this.defaultHealth = defaultHealth;
        this.defaultAttack = defaultAttack;
        this.defaultProtect = defaultProtect;
        this.experience = experience;
        this.level = level;

    }


    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
        // TODO
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }

    public int getHealthMax() {
        return healthMax;
    }

    public void setHealthMax(int healthMax) {
        this.healthMax = healthMax;
    }

    public int getAttackMax() {
        return attackMax;
    }

    public void setAttackMax(int attackMax) {
        this.attackMax = attackMax;
    }

    public Item getAttackHand() {
        return attackHand;
    }


    /**
     * Permet de comparer les points d'attaque des items pour ne pas l'équiper une 2eme fois
     * @param attackHand
     * Prend en parametre l'attribut attackHand de type Item
     *
     */

    public void setAttackHand(Item attackHand) {
        if (!attackHand.equals(this.attackHand)) {
            this.attackHand = attackHand;
           // this.attack += attackHand.getAttackBonus();
            this.attack = defaultAttack + attackHand.getAttackBonus();

        }
        // todo verify max attack
    }

    public Item getDefenseHand() {
        return defenseHand;
    }

    /**
     * Permet de comparer les points de défense de l'item pour ne pas l'équiper une 2eme fois
     * @param defenseHand
     * Prend en parametre l'attribut defenseHand de type Item
     */

    public void setDefenseHand(Item defenseHand) {
        if (!defenseHand.equals(this.defenseHand)) {
            this.defenseHand = defenseHand;
            this.protect = defaultProtect + defenseHand.getProtectBonus();

        }
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }

    public int getDefaultAttack() {
        return defaultAttack;
    }

    public void setDefaultAttack(int defaultAttack) {
        this.defaultAttack = defaultAttack;
    }

    public int getDefaultProtect() {
        return defaultProtect;
    }

    public void setDefaultProtect(int defaultProtect) {
        this.defaultProtect = defaultProtect;
    }

    public int getExperience() { return experience; }

    public void setExperience(int experience) { this.experience = experience; }

    public int getLevel() { return level; }

    public void setLevel(int level) { this.level = level; }

    //------------------------------------ FUNCTION TOSTRING  ------------------------------------------

        public String toString() {
            return

                    "     toString class Character";
        }



//--------------------------------------- END ---------------------------------------------------

}
