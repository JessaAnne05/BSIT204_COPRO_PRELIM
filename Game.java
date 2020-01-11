class Pokemon {
    private String name;
    private int health;
    private int damage;
    
    public Pokemon(String name, int health, int damage)  {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }   
    
    	
    public String getName () {
       return this.name;
    } 
    	
    public int getHealth() {
        return this.name;
    }    	
    
    public int getHealth ( {
        return this.health;
    }
    
    public int getDamage () {
    	return this.damage;
    }
    
    public void setHealth (int health){
    }
    
    public void setDamage (int damage) {
        this.damage = damage;
    }	  	 
}   	  	 
    
class Test {
   	public static void main (String[] args) {
   	 	Pokemon enemy = new Pokemon('Squirtle", 100, 0);
   	 	Pokemon player = new Pokemon('Pikachu", 100, 0);  
   
   boolean flag = enemy.getHealth() > 0 && player getHealth() > 0;
   while(flag) {
   	   System.out.println(player.getName()+ "'s Health
   		