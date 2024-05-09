public class BonusMilesService {

    public int calculate(int price) {
        int result;
        int condition = 20; // количество рублей для одной бонусной милли
        result = price/ condition;
        return result;
    }
}