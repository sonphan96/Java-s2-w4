public class Characteristic {
    private String description;
    private int rating;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (isValid(rating))
            this.rating = rating;
        else
            rating = 5;
    }

    public Characteristic(String description, int rating){
        this.description = description;
        this.rating = rating;
    }

    private boolean isValid(int rating){
        if (rating >= 10 && rating <=1)
            return true;
        return false;
    }

    private boolean isMatch(Characteristic other){
        if(this.description.equals(other.description))
            return true;
        return false;
    }

    public double getCompatability(Characteristic other){
        if (!isMatch(other))
            return 0.0;
        else
        {
            double ratingCalc = Math.pow(this.rating - other.rating, 2);
            double compatability = 1 - (ratingCalc/81);
            return compatability;
        }

    }

    public String toString(){
        return "Characteristic Description: " + this.description + "Rating: " + this.rating;
    }

}
