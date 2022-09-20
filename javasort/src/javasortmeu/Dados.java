
package javasortmeu;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private int number;
   private String name;
   private String typeOne;
   private String typeTwo;
   private int total;
   private int hp;
   private int attack;
   private int defense;
   private String sp;



    /**
     * @return the data
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the data to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the cidade
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the cidade to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the condicao
     */
    public String getTypeOne() {
        return typeOne;
    }

    /**
     * @param typeOne the condicao to set
     */
    public void setTypeOne(String typeOne) {
        this.typeOne = typeOne;
    }

    /**
     * @return the temperatura_Tendencia
     */
    public String getTypeTwo() {
        return typeTwo;
    }


    public void setTypeTwo(String typeTwo) {
        this.typeTwo = typeTwo;
    }

    /**
     * @return the temperaturaMinima
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the temperaturaMinima to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the temperaturaMaxima
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the temperaturaMaxima to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the ventoVelocidadeMinima
     */
    public int getAttack() {
        return attack;
    }

    /**
     * @param attack the ventoVelocidadeMinima to set
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

 
    public int getDefense() {
        return defense;
    }


    public void setDefense(int defense) {
        this.defense = defense;
    }

 
    public String getSp() {
        return sp;
    }


    public void setSp(String sp) {
        this.sp = sp;
    }
    
    @Override    
    public int compareTo(Dados outroDado){
      return this.getName().
              compareTo(outroDado.getName());
    }
    
    
     @Override
    public String toString(){
        return getName()+ " : " + getTypeOne() ;
    }// fim toString
    
}
