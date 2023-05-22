public class DaoFactory {
    private static Ads adsDao;

    private static Parks parksDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    public static Parks getParksDao() {
        if (parksDao == null) {
            parksDao = new MySQLParksDao();
        }
        return parksDao;
    }




}
