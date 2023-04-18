public class BonusMilesService {
    public int calculate(int costTiket) {
        int miles;
        if (costTiket > 20) {
            miles = costTiket / 20;
        } else {
            miles = 0;
        }
        return miles;
    }
}
