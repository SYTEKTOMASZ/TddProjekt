public class Greeting {

    public String hello(String name){
        if(name.equals(""))
        {
            return "Witaj, przyjacielu";
        }
        else {
            return "Witaj, " + name;
        }
    }

}
