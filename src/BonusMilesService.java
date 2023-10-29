public class BonusMilesService {

    public int calculate(int price) {
        int result;
        int condition = 20; // количество рублей для одной бонусной мили
        result = price / condition;
        return result;
    }
}
