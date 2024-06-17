package br.com.kaua.vilas_boas_ecommerce.domain.product;

public enum ProductCategory {
    ELECTRONICS,
    FASHION,
    HOME_AND_KITCHEN,
    BEAUTY_AND_HEALTH,
    SPORTS_AND_OUTDOORS,
    BOOKS_MOVIES_AND_MUSIC,
    AUTOMOTIVE,
    KIDS,
    FOOD_AND_BEVERAGES,
    PET_SUPPLIES;

    @Override
    public String toString() {
        switch(this) {
            case ELECTRONICS: return "Electronics";
            case FASHION: return "Fashion";
            case HOME_AND_KITCHEN: return "Home and Kitchen";
            case BEAUTY_AND_HEALTH: return "Beauty and Health";
            case SPORTS_AND_OUTDOORS: return "Sports and Outdoors";
            case BOOKS_MOVIES_AND_MUSIC: return "Books, Movies and Music";
            case AUTOMOTIVE: return "Automotive";
            case KIDS: return "Kids";
            case FOOD_AND_BEVERAGES: return "Food and Beverages";
            case PET_SUPPLIES: return "Pet Supplies";
            default: throw new IllegalArgumentException();
        }
    }
}
