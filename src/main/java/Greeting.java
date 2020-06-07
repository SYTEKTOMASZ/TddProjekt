public class Greeting {

    public String hello(String name){
        if(name == null ||name.equals(""))
        {
            name = "przyjacielu";
        }
        return String.format("Witaj, %s", name);
    }

}
