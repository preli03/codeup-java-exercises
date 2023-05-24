package movies;

public class Movie {
    private String name;
    //set the value of these fields
    private String category;
//getter and setter methods for accessing and modifying the values name and cat
    public void Movie(String name, String category){
        this.name = name;
        this.category = category;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }
}
