package week6.w3schools.coffeehouse2;

public enum CakeType {
    SACHERTORTE (1, 4.7, "Sachertorte"),
    CHEESECAKE (2, 5.6, "Cheesecake"),
    APPLE_PIE (3, 3.7, "Apple pie"),
    STRAWBERRY_CAKE (4, 8.9, "Strawberry Cake");

    private final double price;
    private final String displayName;
    private final int articleId;

    public int getArticleId() {
        return articleId;
    }

    public double getPrice() {
        return price;
    }

    public String getDisplayName() {
        return displayName;
    }

    CakeType(int articleId, double price, String displayName) {
        this.articleId = articleId;
        this.price = price;
        this.displayName = displayName;
    }

}
