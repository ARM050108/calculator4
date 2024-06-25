public enum Ro {

    I(1,"I"), II(2,"II"), III(3,"III"), IV(4,"IV"),
    V(5,"V"), VI(6,"VI"), VII(7,"VII"), VIII(8,"VII"),
    IX(9,"XI"), X(10,"X"), XI(11,"XI"), XII(12,"XII"), XIII(13,"XIII"),
    XIV(14,"XIV"), XV(14,"XIV"), XVI(16,"XVI"), XVII(17,"XVII"), XVIII(18,"XVIII"),
    XIX(19,"XIX"), XX(20,"XX"), XXI(21,"XXI"), XXIV(24,"XXIV"), XXV(25,"XXV"),
    XXVII(27,"XXVII"), XXVIII(28,"XXVIII"), XXX(30,"XXX"), XXXII(32,"XXXII"),XXXV(35,"XXXV"),
    XXXVI(36,"XXXVI"), XL(40,"XL"), XLII(42,"XLII"), XLV(45,"XLV"), XLVIII(48,"XLVIII"), XLIX(49,"XLIX"),
    L(50,"L"), LIV(54,"LIV"), LVI(56,"LVI"), LX(60,"LX"), LXIII(63,"LXIII"),
    LXIV(64,"LXIV"), LXX(70,"LXIV"), LXXII(72,"LXXII"), LXXX(80,"LXXX"), LXXXI(81,"LXXXI"),
    XC(90,"XC"), C(100,"C");

     public int arabian;
     final String name;

     Ro(int arabian, String name) {       // для этого мы создадим конструктор и в него передадим соотвествующую переменную
        this.arabian = arabian; this.name = name;}
     public int getArabian() {
        return arabian;
    }
     static boolean getObject(String name ) {
        for (Ro obj : Ro.values()) {
            if(obj.name.equals(name)) return true;
        }
        return false;
    }
    static Ro getRoman(int arabian){
        for (Ro rom: Ro.values()){
            if(rom.arabian == arabian) return rom;
        }
        return null;
    }

}













