public class Agent{
    private int agentId;
    private String firstName;
    private String lastName;
    private String city;
    private double premium;

    public Agent(){

    }

    public Agent(int argAgentId,
                  String argFirstName,
                  String argLastname,
                  String argCity,
                  double argPremium){
        this.agentId = argAgentId;
        this.firstName = argFirstName;
        this.lastName = argLastname;
        this.city = argCity;
        this.premium = argPremium;              
    }

    public int getAgentId(){
        return agentId;
    }
    
    public void setAgentId(int argAgentId){
        this.agentId = argAgentId;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String argFirstName){
        this.firstName= argFirstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String argLastName){
        this.lastName = argLastName;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String argCity){
        this.city = argCity;
    }

    public double getPremium(){
        return premium;
    }

    public void setPremium(double argPremium){
        this.premium = argPremium;
    }

    @Override
    public final String toString(){
        return "AgentId="+agentId+" FirstName="+firstName+" Lastname="+lastName+" City="+city+" Premium="+premium;
    }

    public static void main(String[] args){
        Agent obj1 =new Agent(1,"Sahil","K","Mumbai",4563217);
        System.out.println(obj1);
        Agent obj2 = new Agent();
        obj2.setAgentId(2);
        obj2.setFirstName("Sanjana");
        obj2.setLastName("K");
        obj2.setCity("Pune");
        obj2.setPremium(652143);
        System.out.println(obj2);
    }
}