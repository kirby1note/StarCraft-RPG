package juegorol.Zergs;

public class BloodLord extends Zerg{
    public BloodLord(){
        this.size=(float) 2;
        this.cargo=0;
        this.armor=1;
        this.health=225;
        this.ataque=20;
        this.cooldown= 2;
        this.rango=1;
        this.vista=8; 
        this.puntosunidad=5;
   }
   public BloodLord(float size,float cargo,int armor,int health,int ataqueT,int ataqueA,
                   float cooldown,int rango,int vista)
   {      
   }
}
