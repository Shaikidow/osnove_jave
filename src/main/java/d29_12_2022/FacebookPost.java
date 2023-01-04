package d29_12_2022;

public class FacebookPost {

    public String getUser1() {
        return user1;
    }
    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }
    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public int getLikes() {
        return likes;
    }

    public int getShares() {
        return shares;
    }

    private String user1;
    private String user2;
    private String text;
    private int likes;
    private int shares;

    public void like() {
        likes += 1;
    }
    public void dislike() {
        likes -= 1;
        if (likes < 0) {
            likes = 0;
        }
    }
    public void share() {
        shares += 1;
    }
    public void print() {
        System.out.println("\n" + this.user1 + " >>> " + this.user2);
        System.out.println(this.text);
        System.out.println("Likes " + this.likes + " | Shares " + this.shares);
    }

}
